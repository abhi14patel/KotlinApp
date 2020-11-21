package com.serosoft.academia.Networking

import android.content.Context
import android.net.Uri
import com.serosoft.academia.Utils.BaseURL
import org.json.JSONException
import org.json.JSONObject
import java.io.*
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL
import java.security.KeyManagementException
import java.security.NoSuchAlgorithmException
import java.security.SecureRandom
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import java.util.HashMap
import java.util.logging.Level
import java.util.logging.Logger
import javax.net.ssl.HttpsURLConnection
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager


class ServiceCalls {

    fun sendDataToServer(context: Context, myMap: HashMap<String, String>?, methodname: String?): JSONObject?{

        var jsonObject: JSONObject? = null
        disableSSLCertificateChecking()

        when(methodname){

            KEYS.SWITCH_USER_LOGIN -> {

                try {
                    val builder = Uri.Builder()
                        .appendQueryParameter("username", myMap?.get(KEYS.USERNAME))
                        .appendQueryParameter("password", myMap?.get(KEYS.PASSWORD))
                        .appendQueryParameter("grant_type", myMap?.get(KEYS.GRANT_TYPE))
                        .appendQueryParameter("client_id", myMap?.get(KEYS.CLIENT_ID))
                        .appendQueryParameter("client_secret", myMap?.get(KEYS.CLIENT_SECRET))

                    var query = builder.build().encodedQuery

                    jsonObject = getResponseWithPost(
                        KEYS.POST,
                        KEYS.TIME_OUT,
                        KEYS.LOGIN_SERVICE_METHOD,
                        query
                    )

                } catch (ex: Exception) {
                    ex.printStackTrace()
                }
                return jsonObject
            }
        }
        return jsonObject
    }

    fun getResponseWithPost(postMethod: String?, timeout: Int?, url: String?, query: String?): JSONObject? {

        var jsonObject: JSONObject? = null
        var connection: HttpURLConnection? = null

        try {
            val urlObject = URL(BaseURL.BASE_URL.toString() + url)
            connection = urlObject.openConnection() as HttpURLConnection
            connection.requestMethod = postMethod
            connection.connectTimeout = timeout!!
            connection.readTimeout = timeout!!
            connection.doInput = true
            connection.doOutput = true
            val os = connection.outputStream
            val writer = BufferedWriter(OutputStreamWriter(os, "UTF-8"))
            writer.write(query.toString())
            writer.flush()
            writer.close()
            os.close()
            connection.connect()
            val status = connection.responseCode
            val br: BufferedReader
            val sb = StringBuilder()
            var line: String
            when (status) {

                400 -> {
                    val obj = JSONObject()
                    obj.put("status", "Wrong Credentials")
                    jsonObject = obj
                    return jsonObject
                }

                201, 200, 204, 401, 403, 404, 500, 503 -> {

                    br = BufferedReader(InputStreamReader(connection.inputStream))
                    while (br.readLine().also { line = it } != null) {

                        sb.append("""$line""".trimIndent())
                    }
                    br.close()
                    try {
                        jsonObject = JSONObject(sb.toString())
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    return jsonObject
                }
            }

        }
        catch (ex: MalformedURLException) {
            ex.printStackTrace();
            Logger.getLogger(javaClass.name).log(Level.SEVERE, null, ex)
        }
        catch (ex : IOException) {
            ex.printStackTrace();
            Logger.getLogger(javaClass.name).log(Level.SEVERE, null, ex)
        }
        catch (ex: Exception) {
            ex.printStackTrace()
            Logger.getLogger(javaClass.name).log(Level.SEVERE, null, ex)
        }
        finally {
            if (connection != null) {
                try {
                    connection.disconnect()
                } catch (ex: Exception) {
                    ex.printStackTrace()
                    Logger.getLogger(javaClass.name).log(Level.SEVERE, null, ex)
                }
            }
        }

        return null
    }

    private fun disableSSLCertificateChecking() {

        val trustAllCerts = arrayOf<TrustManager>(object : X509TrustManager {

            override fun getAcceptedIssuers(): Array<X509Certificate>? {
                return null
            }

            @Throws(CertificateException::class)
            override fun checkClientTrusted(arg0: Array<X509Certificate>, arg1: String) {
                // Not implemented
            }

            @Throws(CertificateException::class)
            override fun checkServerTrusted(arg0: Array<X509Certificate>, arg1: String) {
                // Not implemented
            }
        })

        try {
            val sc = SSLContext.getInstance("TLS")
            sc.init(null, trustAllCerts, SecureRandom())
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.socketFactory)
        } catch (e: KeyManagementException) {
            e.printStackTrace()
        } catch (e: NoSuchAlgorithmException) {
            e.printStackTrace()
        }
    }
}