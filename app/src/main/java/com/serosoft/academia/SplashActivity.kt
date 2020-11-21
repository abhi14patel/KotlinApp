package com.serosoft.academia

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.serosoft.academia.Helpers.Consts
import com.serosoft.academia.Manager.SharedPrefrenceManager
import com.serosoft.academia.Modules.Dashboard.DashboardActivity
import com.serosoft.academia.Modules.Login.LoginActivity
import com.serosoft.academia.Utils.ProjectUtils

class SplashActivity : AppCompatActivity() {

    var mContext: Context? = null
    var handler = Handler()
    var sharedPreferenceManager: SharedPrefrenceManager? = null

    val TAG: String = SplashActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        ProjectUtils.showLog(TAG, "onCreate Start")
        mContext = this@SplashActivity
        sharedPreferenceManager = SharedPrefrenceManager(this@SplashActivity)
    }

    override fun onResume() {
        super.onResume()

        handler.postDelayed(runnable, Consts.SPLASH_TIME_OUT)
    }

    var runnable = Runnable {

        if(sharedPreferenceManager!!.getUserLoginStatusFromKey()){

            val intent = Intent(this@SplashActivity, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }else{

            val intent = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()

        handler.removeCallbacks(runnable)
        finish()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}