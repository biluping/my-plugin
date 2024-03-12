package org.myboy.action

import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

/**
 * Notification 通知
 * https://plugins.jetbrains.com/docs/intellij/notifications.html
 * plugin.xml 需要配置 extensions > notificationGroup
 */
class NotificationAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        NotificationGroupManager.getInstance().getNotificationGroup("my-notification")
            .createNotification("Top level Notifications INFORMATION", NotificationType.INFORMATION)
            .notify(e.project)

        NotificationGroupManager.getInstance().getNotificationGroup("my-notification")
            .createNotification("Top level Notifications WARNING", NotificationType.WARNING)
            .notify(e.project)

        NotificationGroupManager.getInstance().getNotificationGroup("my-notification")
            .createNotification("Top level Notifications ERROR", NotificationType.ERROR)
            .notify(e.project)
    }
}