package com.serenadehl

/**
 * 作者：Serenade
 * 邮箱：SerenadeHL@163.com
 * 创建时间：2019-09-11 00:38:01
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Layout(
    val layoutId: Int
)