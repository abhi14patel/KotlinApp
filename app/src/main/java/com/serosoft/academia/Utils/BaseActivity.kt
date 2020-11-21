package com.serosoft.academia.Utils

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import cc.cloudist.acplibrary.ACProgressConstant
import cc.cloudist.acplibrary.ACProgressFlower
import com.serosoft.academia.Manager.SharedPrefrenceManager

open class BaseActivity: AppCompatActivity(), View.OnClickListener {

    var acProgressFlowerDialog: ACProgressFlower? = null
    var sharedPrefrenceManager: SharedPrefrenceManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPrefrenceManager = SharedPrefrenceManager(this)
    }

    fun showProgressDialog(context: Context){

        acProgressFlowerDialog = ACProgressFlower.Builder(context)
            .direction(ACProgressConstant.DIRECT_CLOCKWISE)
            .themeColor(Color.WHITE)
            .petalThickness(3)
            .fadeColor(Color.DKGRAY).build()

        acProgressFlowerDialog!!.setCancelable(false)
        acProgressFlowerDialog!!.setCanceledOnTouchOutside(false)
        acProgressFlowerDialog!!.show()
    }

    fun hideProgressDialog() {
        try {
            if (acProgressFlowerDialog != null && acProgressFlowerDialog!!.isShowing) {
                acProgressFlowerDialog!!.dismiss()
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
            ProjectUtils.showLog("BaseActivity", ex.message)
        }
    }

    override fun onClick(v: View?) {}
}