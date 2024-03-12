package org.myboy.action

import com.intellij.codeInsight.hint.HintManager
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys

/**
 * 代码编辑器内提示
 */
class EditHintAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val editor = e.dataContext.getData(CommonDataKeys.EDITOR)
        if (editor != null) {
            HintManager.getInstance().showInformationHint(editor, "This is a information hint")
//                HintManager.getInstance().showQuestionHint(editor, "This is a question hint", 100, 100) {
//                    Messages.showMessageDialog("Question message", "Question Title", Messages.getInformationIcon())
//                    true
//                }
//                HintManager.getInstance().showErrorHint(editor, "This is a error hint")
        }
    }
}