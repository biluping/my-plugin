package org.myboy.store

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.Service
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil

/**
 * 加上了 @Service 就可以通过 val mySettings = service<MySettings>() 直接拿到单例对象
 * @State 配合 PersistentStateComponent 接口用于将数据存储到本地，直接修改属性值后会更新到磁盘
 * 下面示例中，my-setting.xml 文件保存在 build/idea-sandbox/config/options/my-setting.xml，其中 xml 根标签是 my-setting
 */
@Service
@State(
    name = "my-setting",
    storages = [Storage("my-setting.xml")]
)
class MySettings : PersistentStateComponent<MySettings> {

    var api = "http://127.0.0.1:8080"

    override fun getState(): MySettings {
        return this
    }

    override fun loadState(state: MySettings) {
        XmlSerializerUtil.copyBean(state, this)
    }
}