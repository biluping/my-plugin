package org.myboy.dialog

import com.intellij.openapi.ui.DialogWrapper
import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel

/**
 * 对话框
 * https://plugins.jetbrains.com/docs/intellij/dialog-wrapper.html?from=jetbrains.org#example
 * 1、继承 DialogWrapper，调用父类构造，传入 true
 * 2、构造方法设置 title，调用父类 init()
 * 3、重写 createCenterPanel 方法
 */
class MyDialog : DialogWrapper(true) {

    init {
        title = "MyDialog"
        init()
    }

    override fun createCenterPanel(): JComponent {
        var n = 0
        val jLabel = JLabel("" + n)

        val jButton = JButton("点击我")
        jButton.addActionListener {
            jLabel.text = "" + (++n)
        }

        val jPanel = JPanel(FlowLayout(FlowLayout.CENTER))
        jPanel.add(jButton)
        jPanel.add(jLabel)

        return jPanel
    }
}