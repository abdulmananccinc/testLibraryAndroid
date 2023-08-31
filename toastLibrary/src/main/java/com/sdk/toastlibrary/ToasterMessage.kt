package com.sdk.toastlibrary

import android.content.Context
import android.widget.Toast


object ToasterMessage {

    fun toast(context: Context, message: String) {
        val toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        toast.show()
    }
}