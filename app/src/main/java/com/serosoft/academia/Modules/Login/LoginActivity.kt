package com.serosoft.academia.Modules.Login

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.serosoft.academia.R
import com.serosoft.academia.Utils.BaseActivity
import com.serosoft.academia.Utils.ProjectUtils

class LoginActivity : BaseActivity() {

    var mContext: Context? = null
    var etUsername: EditText? = null
    var etPassword: EditText? = null
    var btnSignIn: Button? = null
    var btnForgotPassword: Button? = null

    val TAG: String? = LoginActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        ProjectUtils.showLog(TAG, "onCreate start")
        mContext = this@LoginActivity

        Initialize()
    }

    private fun Initialize() {

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnForgotPassword = findViewById(R.id.btnForgotPassword);
    }
}