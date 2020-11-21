package com.serosoft.academia.Networking

import android.content.Context
import com.serosoft.academia.Manager.BaseClass
import com.serosoft.academia.Manager.SharedPrefrenceManager
import org.json.JSONObject
import java.util.*

/**
 * Created by Abhishek on 24/09/20.
 */
class APIManager(var mContext: Context) : BaseClass(mContext) {

    private val sharedPrefrenceManager: SharedPrefrenceManager
    private var hashMap: HashMap<String, String>? = null

    private var responseString: String? = null
    private var responseObject: JSONObject? = null

    private var admissionId: Int? = null
    private var periodId: Int? = null
    private var sectionId: Int? = null
    private var academyLocationId: Int? = null
    private var studentId: Int? = null
    private var portalId: Int? = null
    private var programId: Int? = null
    private var batchId: Int? = null
    private var firebaseID: Long? = null

    /**
     * Here initialize varibles
     */
    init {
        responseString = KEYS.SERVER_ISSUE
        sharedPrefrenceManager = SharedPrefrenceManager(mContext)
        academyLocationId = sharedPrefrenceManager.getAcademyLocationIDFromKey()
        studentId = sharedPrefrenceManager.getUserIDFromKey()
        portalId = sharedPrefrenceManager.getPortalIDFromKey()
        programId = sharedPrefrenceManager.getProgramIDFromKey()
        batchId = sharedPrefrenceManager.getBatchIDFromKey()
        admissionId = sharedPrefrenceManager.getAdmissionIDFromKey()
        periodId = sharedPrefrenceManager.getPeriodIDFromKey()
        sectionId = sharedPrefrenceManager.getSectionIDFromKey()
        firebaseID = sharedPrefrenceManager.getFirebaseIDFromKey()
    }
}