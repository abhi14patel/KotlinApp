package com.serosoft.academia.Utils

import android.content.Context
import android.util.Log
import android.widget.Toast

object ProjectUtils{

    private var toast: Toast? = null

    //For Long Period Toast Message
    fun showLong(context: Context?, message: String?) {

        if (message == null) {
            return
        }
        if (toast == null && context != null) {
            toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
        }
        if (toast != null) {
            toast!!.setText(message)
            toast!!.show()
        }
    }

    fun showLog(tag: String?, text: String?){

        Log.e(tag, text)
    }
}