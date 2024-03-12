package org.myboy.patcher

import com.intellij.execution.Executor
import com.intellij.execution.configurations.JavaParameters
import com.intellij.execution.configurations.RunProfile
import com.intellij.execution.runners.JavaProgramPatcher

/**
 * 启动项目后修改运行配置，如 jvm 参数
 * 1、build.gradle.kts 配置 intellij > plugins.set(listOf("java"))
 * 2、plugin.xml 增加 <depends>com.intellij.modules.java</depends>
 * 3、plugin.xml 增加 extensions > java.programPatcher
 */
class MyProgramPatcher : JavaProgramPatcher() {

    override fun patchJavaParameters(executor: Executor, runProfile: RunProfile, javaParameters: JavaParameters) {
        javaParameters.vmParametersList.add("-Xmx1024m")
    }
}