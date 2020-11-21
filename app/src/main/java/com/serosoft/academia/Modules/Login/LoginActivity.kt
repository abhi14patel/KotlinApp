package com.serosoft.academia.Modules.Login

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.StringRequestListener
import com.serosoft.academia.Interfaces.AsyncTaskCompleteListener
import com.serosoft.academia.Modules.Dashboard.DashboardActivity
import com.serosoft.academia.Networking.KEYS
import com.serosoft.academia.R
import com.serosoft.academia.Utils.BaseActivity
import com.serosoft.academia.Utils.BaseURL
import com.serosoft.academia.Utils.ConnectionDetector
import com.serosoft.academia.Utils.ProjectUtils
import org.w3c.dom.Element
import org.xml.sax.InputSource
import java.io.BufferedReader
import java.io.StringReader
import javax.xml.parsers.DocumentBuilderFactory

class LoginActivity : BaseActivity(), AsyncTaskCompleteListener {

    var mContext: Context? = null
    var etUsername: EditText? = null
    var etPassword: EditText? = null
    var btnSignIn: Button? = null
    var btnForgotPassword: Button? = null
    var tvInstanceVersion: TextView? = null
    var tvAppVersion: TextView? = null
    var tvInstanceURL: TextView? = null
    var appVersion = ""

    val TAG: String? = LoginActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        ProjectUtils.showLog(TAG, "onCreate start")
        mContext = this@LoginActivity

        Initialize()

        populateContent()
    }

    private fun Initialize() {

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnForgotPassword = findViewById(R.id.btnForgotPassword);
        tvAppVersion = findViewById(R.id.tvAppVersion)
        tvInstanceURL = findViewById(R.id.tvInstanceURL)
        tvInstanceVersion = findViewById(R.id.tvInstanceVersion)

        btnSignIn!!.setOnClickListener(this)
        btnForgotPassword!!.setOnClickListener(this)
    }

    private fun populateContent() {

        if(ConnectionDetector.isConnectingToInternet(mContext!!)){

            populateVersions()
        }
        else {
            ProjectUtils.showLong(mContext, KEYS.NET_ERROR_MESSAGE)
        }
    }

    private fun populateVersions(){

        showProgressDialog(this)

        //Here do api calling
        val url: String = BaseURL.BASE_URL + KEYS.BUILD_INFO_METHOD

        AndroidNetworking.get(url)
            .setOkHttpClient(ProjectUtils.getUnsafeOkHttpClient())
            .setPriority(Priority.HIGH)
            .build()
            .getAsString(object : StringRequestListener {
                override fun onResponse(response: String) {
                    // do anything with response
                    //ProjectUtils.showLog(TAG, "Response"+response);
                    hideProgressDialog()

                    //Here parse Instance version
                    /************** Read XML  */
                    val br = BufferedReader(StringReader(response))
                    val `is` = InputSource(br)
                    /************  Parse XML  */
                    try {
                        val D = DocumentBuilderFactory.newInstance()
                        val d = D.newDocumentBuilder()
                        val mydocument = d.parse(`is`)

                        // to get the elements from document 'mydocument'
                        val E = mydocument.documentElement
                        E.normalize()
                        val MyListOfElemnts = mydocument.getElementsByTagName("buildInfo")

                        for (i in 0 until MyListOfElemnts.length) {
                            val N = MyListOfElemnts.item(i)
                            val myElement = N as Element
                            val N1 = myElement.getElementsByTagName("buildName").item(i).childNodes
                            val node1 = N1.item(i)
                            val name = node1.nodeValue
                            val N2 =
                                myElement.getElementsByTagName("buildVersion").item(i).childNodes
                            val node2 = N2.item(i)
                            val version = node2.nodeValue
                            tvInstanceVersion!!.text = "$name $version | "
                        }
                    } catch (ex: Exception) {
                        ex.printStackTrace()
                        ProjectUtils.showLog(TAG, "" + ex.message)
                    }
                    appVersionFunction()
                }

                override fun onError(anError: ANError) {
                    hideProgressDialog()
                }
            })
    }

    private fun appVersionFunction() {

        //Here get app version
        try {
            val pInfo = packageManager.getPackageInfo(packageName, 0)
            appVersion = pInfo.versionName
            ProjectUtils.showLog(TAG, appVersion)
            tvAppVersion!!.text = "V$appVersion | "

        } catch (e: PackageManager.NameNotFoundException) {

            e.printStackTrace()
        }

        //Here get instanceUrl
        val url = BaseURL.BASE_URL
        if (url.contains("://")) {

            val separated = url.split("://").toTypedArray()
            val str1 = separated[0]
            val str2 = separated[1]
            if (str2.contains(".academiaerp.com")) {

                val separated1 = str2.split(".academiaerp.com").toTypedArray()
                val st1 = separated1[0]
                val st2 = separated1[1]
                tvInstanceURL!!.text = st1
            }
            else {

                val sttr2: String? = ProjectUtils.removeLastChar(str2)
                tvInstanceURL!!.text = sttr2
            }
        }
    }

    override fun onTaskComplete(result: HashMap<String, String>?) {

    }

    override fun onClick(v: View?) {
        super.onClick(v)

        when (v!!.id) {
            R.id.btnSignIn -> {
                ProjectUtils.showLong(mContext, "Login")
            }

            R.id.btnForgotPassword -> {
                ProjectUtils.showLong(mContext, "Forget Password")
            }
        }
    }

    private fun goToDashboard() {
        val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
        startActivity(intent)
        finish()
    }
}