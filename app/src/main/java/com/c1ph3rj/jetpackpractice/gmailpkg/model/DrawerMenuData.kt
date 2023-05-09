package com.c1ph3rj.jetpackpractice.gmailpkg.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData (val icon: ImageVector? = null, val title: String? = null, val isDivider: Boolean = false, val isHeader: Boolean = false){
    object AllInbox: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All Inbox"
    )

    object Primary: DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )

    object Social: DrawerMenuData(
        icon = Icons.Outlined.Person,
        title = "Social"
    )

    object Promotion: DrawerMenuData(
        icon = Icons.Outlined.Tag,
        title = "Promotions"
    )

    object AllLabels : DrawerMenuData(
        title = "AllLabels",
        isHeader = true
    )

    object Stared: DrawerMenuData(
        icon = Icons.Outlined.StarOutline,
        title = "Stared"
    )

    object Snoozed: DrawerMenuData(
        icon = Icons.Outlined.Alarm,
        title = "Snoozed"
    )

    object Important: DrawerMenuData(
        icon = Icons.Outlined.NotificationImportant,
        title = "Important"
    )

    object Sent: DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Sent"
    )

    object Scheduled: DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        title = "Scheduled"
    )

    object OutBox: DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )

    object Draft: DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    )


    object GoogleApps: DrawerMenuData(
        title = "Google Apps",
        isHeader = true
    )

    object Calender: DrawerMenuData(
        icon = Icons.Outlined.EditCalendar,
        title = "Calender"
    )

    object Contacts: DrawerMenuData(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    )

    object Divider: DrawerMenuData(
        isDivider = true
    )

    object Settings: DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )

    object HelpAndFeedBack: DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Help and FeedBack"
    )
}