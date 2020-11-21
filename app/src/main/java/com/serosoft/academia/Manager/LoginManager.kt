package com.serosoft.academia.Manager

import android.content.Context
import com.serosoft.academia.Networking.KEYS
import com.serosoft.academia.Networking.ServiceCalls
import org.json.JSONObject
import java.util.*

class LoginManager(var mContext: Context) : BaseClass(mContext) {

    private var sharedPrefrenceManager: SharedPrefrenceManager? = null
    private var serverCalls: ServiceCalls? = null
    private var hashMap: HashMap<String, String>? = null
    private var responseObject: JSONObject? = null

    init {
        sharedPrefrenceManager = SharedPrefrenceManager(context)
        serverCalls = ServiceCalls()
    }

    fun validateUserNameAndPassword(mapValues: HashMap<String, String>?): Boolean? {

        responseObject = serverCalls!!.sendDataToServer(context, mapValues, KEYS.SWITCH_USER_LOGIN)

        if (responseObject != null) {
            return saveAccessToken(responseObject!!)
        } else {
            return false
        }
    }

    private fun saveAccessToken(responseObject: JSONObject): Boolean {

        val accessToken = responseObject.optString("access_token")
        val tokenType = responseObject.optString("token_type")
        val refreshToken = responseObject.optString("refresh_token")
        val scope = responseObject.optString("scope")

        if (accessToken.length > 0) {

            sharedPrefrenceManager!!.setAccessTokenInSP(accessToken)
            sharedPrefrenceManager!!.setTokenTypeInSP(tokenType)
            sharedPrefrenceManager!!.setRefreshTokenInSP(refreshToken)
            sharedPrefrenceManager!!.setTokenScopeInSP(scope)

            return getFeaturesFromServer()

        } else {
            return false
        }
    }

    private fun getFeaturesFromServer(): Boolean {

        hashMap = HashMap()
        hashMap!!.put("isMobielApp","true")

        responseObject = serverCalls!!.sendDataToServer(context, hashMap, KEYS.SWITCH_FEATURES)

        if (responseObject != null) {
            //return saveFeaturesInfo(responseObject)
        }

        return false
    }

}