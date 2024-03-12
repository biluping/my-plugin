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