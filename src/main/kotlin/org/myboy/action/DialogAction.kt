package org.myboy.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import org.myboy.dialog.MyDialog

/**
 * dialog 见类 MyDialog
 */
class DialogAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        if (MyDialog().showAndGet()) {
            println("dialog ok")
        }
    }
}