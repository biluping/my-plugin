package org.myboy.toolwindow

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.openapi.wm.ToolWindowType
import com.intellij.ui.content.ContentFactory
import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel

/**
 * https://plugins.jetbrains.com/docs/intellij/tool-windows.html#sample-plugin
 * plugin.xml 需要配置 extensions > toolWindow
 */
class MyToolWindowFactory : ToolWindowFactory {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val panel = createPanel()
        val content = ContentFactory.getInstance().createContent(panel, "MyToolWindow", false)
        toolWindow.contentManager.addContent(content)

        // 设置窗口浮动
        toolWindow.setType(ToolWindowType.FLOATING, null)
    }

    private fun createPanel() : JPanel {
        var count = 0
        val label = JLabel()
        val btn = JButton("加一")
        btn.addActionListener() {
            label.text = (++count).toString()
        }

        val jPanel = JPanel(FlowLayout())
        jPanel.add(btn)
        jPanel.add(label)

        return jPanel
    }

}