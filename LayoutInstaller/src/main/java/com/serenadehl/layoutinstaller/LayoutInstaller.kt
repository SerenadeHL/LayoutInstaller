package com.serenadehl.layoutinstaller

import android.app.Activity
import android.support.v4.app.Fragment
import android.view.View
import android.view.ViewGroup
import java.lang.RuntimeException

/**
 * 作者：Serenade
 * 邮箱：SerenadeHL@163.com
 * 创建时间：2019-09-11 00:35:52
 */
object LayoutInstaller {
    fun bind(activity: Activity): View {
        val clazz = activity.javaClass
        val layout = clazz.getAnnotation(Layout::class.java) ?: throw RuntimeException("Annotation @Layout required!")
        activity.setContentView(layout.layoutId)
        return activity.window.decorView.findViewById(android.R.id.content)
    }

    fun bind(fragment: Fragment, container: ViewGroup?): View {
        val clazz = fragment.javaClass
        val layout = clazz.getAnnotation(Layout::class.java) ?: throw RuntimeException("Annotation @Layout required!")
        return fragment.layoutInflater.inflate(layout.layoutId, container, false)
    }
}