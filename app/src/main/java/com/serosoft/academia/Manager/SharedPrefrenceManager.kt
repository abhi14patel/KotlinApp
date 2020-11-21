package com.serosoft.academia.Manager

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.*

/**
 * Created by Abhishek on 24/09/20.
 */

class SharedPrefrenceManager(var context: Context) {

    private val sp: SharedPreferences
    private val editor: Editor
    private val ACADEMIA_SP = "academia-sp"

    init {
        sp = context.getSharedPreferences(ACADEMIA_SP, Context.MODE_PRIVATE)
        editor = sp.edit()
    }

    fun setUserLoginStatusInSP(value: Boolean?) {
        editor.putBoolean("LoggedIn", value!!)
        editor.commit()
    }

    fun getUserLoginStatusFromKey(): Boolean {
        return sp.getBoolean("LoggedIn", false)
    }

    fun setAccessTokenInSP(value: String?){
        editor.putString("accessToken", value)
        editor.commit()
    }

    fun getAccessTokenFromKey(): String? {
        return sp.getString("accessToken", "")
    }

    fun setTokenTypeInSP(value: String?) {
        editor.putString("tokenType", value)
        editor.commit()
    }

    fun getTokenTypeFromKey(): String? {
        return sp.getString("tokenType", "")
    }

    fun setRefreshTokenInSP(value: String?) {
        editor.putString("refreshToken", value)
        editor.commit()
    }

    fun getRefreshTokenFromKey(): String? {
        return sp.getString("refreshToken", "")
    }

    fun setTokenScopeInSP(value: String?) {
        editor.putString("tokenScope", value)
        editor.commit()
    }

    fun getTokenScopeFromKey(): String? {
        return sp.getString("tokenScope", "")
    }

    fun setUserGLoginStatusInSP(value: Boolean?) {
        editor.putBoolean("GoogleLogIn", value!!)
        editor.commit()
    }

    fun getUserGLoginStatusFromKey(): Boolean {
        return sp.getBoolean("GoogleLogIn", false)
    }

    fun setIsParentStatusInSP(value: Boolean?) {
        editor.putBoolean("IsParent", value!!)
        editor.commit()
    }

    fun getIsParentStatusFromKey(): Boolean {
        return sp.getBoolean("IsParent", false)
    }

    fun setIsFacultyStatusInSP(value: Boolean?) {
        editor.putBoolean("IsFaculty", value!!)
        editor.commit()
    }

    fun getIsFacultyStatusFromKey(): Boolean {
        return sp.getBoolean("IsFaculty", false)
    }

    fun setPersonIDInSP(value: Int?) {
        editor.putInt("PersonID", value!!)
        editor.commit()
    }

    fun getPersonIDFromKey(): Int {
        return sp.getInt("PersonID", -1)
    }

    fun setUserIDInSP(value: Int?) {
        editor.putInt("userID", value!!)
        editor.commit()
    }

    fun getUserIDFromKey(): Int {
        return sp.getInt("userID", -1)
    }

    fun setParentPersonIDInSP(value: Int?) {
        editor.putInt("ParentPersonID", value!!)
        editor.commit()
    }

    fun getParentPersonIDFromKey(): Int {
        return sp.getInt("ParentPersonID", -1)
    }

    fun setParentUserIDInSP(value: Int?) {
        editor.putInt("ParentUserID", value!!)
        editor.commit()
    }

    fun getParentUserIDFromKey(): Int {
        return sp.getInt("ParentUserID", -1)
    }

    fun setParentNameInSP(value: String?) {
        editor.putString("ParentName", value)
        editor.commit()
    }

    fun getParentNameFromKey(): String? {
        return sp.getString("ParentName", "")
    }

    fun setUserCodeInSP(value: String?) {
        editor.putString("UserCode", value)
        editor.commit()
    }

    fun getUserCodeFromKey(): String? {
        return sp.getString("UserCode", "")
    }

    fun setCurrencySymbolInSP(value: String?) {
        editor.putString("CurrencySymbol", value)
        editor.commit()
    }

    fun getCurrencySymbolFromKey(): String? {
        return sp.getString("CurrencySymbol", "")
    }

    fun setDateFormatInSP(value: String?) {
        editor.putString("DateFormat", value)
        editor.commit()
    }

    fun getDateFormatlFromKey(): String? {
        return sp.getString("DateFormat", "")
    }

    fun setTimeFormatInSP(value: String?) {
        editor.putString("TimeFormat", value)
        editor.commit()
    }

    fun getTimeFormatlFromKey(): String? {
        return sp.getString("TimeFormat", "")
    }

    fun setUserImageURLInSP(value: String?) {
        editor.putString("UserImageURL", value)
        editor.commit()
    }

    fun getUserImageURLFromKey(): String? {
        return sp.getString("UserImageURL", "")
    }

    fun setUserImageInSP(value: String?) {
        editor.putString("UserImage", value)
        editor.commit()
    }

    fun getUserImageFromKey(): String? {
        return sp.getString("UserImage", "")
    }

    fun setUserNameInSP(value: String?) {
        editor.putString("UserName", value)
        editor.commit()
    }

    fun getUserNameFromKey(): String? {
        return sp.getString("UserName", "")
    }

    fun setUserEmailInSP(value: String?) {
        editor.putString("UserEmail", value)
        editor.commit()
    }

    fun getUserEmailFromKey(): String? {
        return sp.getString("UserEmail", "")
    }

    fun setUserFirstNameInSP(value: String?) {
        editor.putString("FirstName", value)
        editor.commit()
    }

    fun getUserFirstNameFromKey(): String? {
        return sp.getString("FirstName", "")
    }

    fun setUserLastNameInSP(value: String?) {
        editor.putString("LastName", value)
        editor.commit()
    }

    fun getUserLastNameFromKey(): String? {
        return sp.getString("LastName", "")
    }

    fun setPasswordInSP(value: String?) {
        editor.putString("Password", value)
        editor.commit()
    }

    fun getPasswordFromKey(): String? {
        return sp.getString("Password", "")
    }

    fun setBatchIDInSP(value: Int?) {
        editor.putInt("batchID", value!!)
        editor.commit()
    }

    fun getBatchIDFromKey(): Int {
        return sp.getInt("batchID", -1)
    }

    fun setAdmissionIDInSP(value: Int?) {
        editor.putInt("admissionID", value!!)
        editor.commit()
    }

    fun getAdmissionCodeInSP(): String? {
        return sp.getString("admissionCode", "")
    }

    fun setAdmissionCodeInSP(value: String?) {
        editor.putString("admissionCode", value)
        editor.commit()
    }

    fun getAlertCountsFromKey(): Int {
        return sp.getInt("alertCounts", -1)
    }

    fun setAlertCountsInSP(value: Int?) {
        editor.putInt("alertCounts", value!!)
        editor.commit()
    }

    fun getNotificationCountsFromKey(): Int {
        return sp.getInt("notificationCounts", -1)
    }

    fun setNotificationCountsInSP(value: Int?) {
        editor.putInt("notificationCounts", value!!)
        editor.commit()
    }

    fun getAdmissionIDFromKey(): Int {
        return sp.getInt("admissionID", -1)
    }

    fun setAcademyLocationIDInSP(value: Int?) {
        editor.putInt("academyLocationID", value!!)
        editor.commit()
    }

    fun getAcademyLocationIDFromKey(): Int {
        return sp.getInt("academyLocationID", -1)
    }

    fun setAcademyLocationNameInSP(value: String?) {
        editor.putString("academyLocationName", value)
        editor.commit()
    }

    fun getAcademyLocationNameInSP(): String? {
        return sp.getString("academyLocationName", "")
    }

    fun setPortalIDInSP(value: Int?) {
        editor.putInt("portalID", value!!)
        editor.commit()
    }

    fun getPortalIDFromKey(): Int {
        return sp.getInt("portalID", -1)
    }

    fun setProgramIDInSP(value: Int?) {
        editor.putInt("programID", value!!)
        editor.commit()
    }

    fun getProgramIDFromKey(): Int {
        return sp.getInt("programID", -1)
    }

    fun setPeriodIDInSP(value: Int?) {
        editor.putInt("periodID", value!!)
        editor.commit()
    }

    fun getPeriodIDFromKey(): Int {
        return sp.getInt("periodID", -1)
    }

    fun setSectionIDInSP(value: Int?) {
        editor.putInt("sectionID", value!!)
        editor.commit()
    }

    fun getSectionIDFromKey(): Int {
        return sp.getInt("sectionID", -1)
    }

    fun getNotificationsFromKey(): String? {
        return sp.getString("Notifications", "")
    }

    fun setNotificationsInSP(value: String?) {
        editor.putString("Notifications", value)
        editor.commit()
    }

    fun getAttendanceTypeFromKey(): String? {
        return sp.getString("attendanceType", "")
    }

    fun setAttendanceTypeInSP(value: String?) {
        editor.putString("attendanceType", value)
        editor.commit()
    }

    fun setIsCompleteDayStatusInSP(value: Boolean?) {
        editor.putBoolean("IsCompleteDay", value!!)
        editor.commit()
    }

    fun getIsCompleteDayStatusFromKey(): Boolean {
        return sp.getBoolean("IsCompleteDay", false)
    }

    fun setIsCourseLevelStatusInSP(value: Boolean?) {
        editor.putBoolean("IsCourseLevel", value!!)
        editor.commit()
    }

    fun getIsCourseLevelStatusFromKey(): Boolean {
        return sp.getBoolean("IsCourseLevel", false)
    }

    fun setIsMultipleSessionStatusInSP(value: Boolean?) {
        editor.putBoolean("IsMultipleSession", value!!)
        editor.commit()
    }

    fun getIsMultipleSessionStatusFromKey(): Boolean {
        return sp.getBoolean("IsMultipleSession", false)
    }

    fun setAttendanceTypeCountInSP(value: Int?) {
        editor.putInt("AttendanceTypeCount", value!!)
        editor.commit()
    }

    fun getAttendanceTypeCountFromKey(): Int {
        return sp.getInt("AttendanceTypeCount", -1)
    }

    fun setFirebaseTokenInSP(value: String?) {
        editor.putString("FirebaseToken", value)
        editor.commit()
    }

    fun getFirebaseTokenFromKey(): String? {
        return sp.getString("FirebaseToken", "")
    }

    fun setFirebaseIDInSP(value: Long?) {
        editor.putLong("FirebaseID", value!!)
        editor.commit()
    }

    fun getFirebaseIDFromKey(): Long? {
        return sp.getLong("FirebaseID", -1)
    }

    fun setContact1InSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("Contact1", value)
        editor.commit()
    }

    fun getContact1FromKey(): String? {
        return sp.getString("Contact1", "")
    }

    fun setContact2InSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("Contact2", value)
        editor.commit()
    }

    fun getContact2FromKey(): String? {
        return sp.getString("Contact2", "")
    }

    fun setAddressInSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("Address", value)
        editor.commit()
    }

    fun getAddressFromKey(): String? {
        return sp.getString("Address", "")
    }

    fun setDateOfBirthInSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("DateOfBirth", value)
        editor.commit()
    }

    fun getDateOfBirthFromKey(): String? {
        return sp.getString("DateOfBirth", "")
    }

    fun setDateOfJoiningInSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("DateOfJoining", value)
        editor.commit()
    }

    fun getDateOfJoiningFromKey(): String? {
        return sp.getString("DateOfJoining", "")
    }

    fun setDateOfRegistrationInSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("DateOfRegistration", value)
        editor.commit()
    }

    fun getDateOfRegistrationFromKey(): String? {
        return sp.getString("DateOfRegistration", "")
    }

    fun setDateOfRegistrationLongInSP(value: Long?) {
        editor.putLong("DateOfRegistrationLong", value!!)
        editor.commit()
    }

    fun getDateOfRegistrationLongFromKey(): Long? {
        return sp.getLong("DateOfRegistrationLong", 0)
    }

    fun setDateOfBirthLongInSP(value: Long?) {
        editor.putLong("DateOfBirthLong", value!!)
        editor.commit()
    }

    fun getDateOfBirthLongFromKey(): Long? {
        return sp.getLong("DateOfBirthLong", 0)
    }

    fun setStudentCategoryInSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("StudentCategory", value)
        editor.commit()
    }

    fun getStudentCategoryFromKey(): String? {
        return sp.getString("StudentCategory", "")
    }

    fun setStudentGenderInSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("StudentGender", value)
        editor.commit()
    }

    fun getStudentGenderFromKey(): String? {
        return sp.getString("StudentGender", "")
    }

    fun setStudentFathersNameInSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("StudentFathersName", value)
        editor.commit()
    }

    fun getStudentFathersNameFromKey(): String? {
        return sp.getString("StudentFathersName", " - ")
    }

    fun setStudentMothersNameInSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("StudentMothersName", value)
        editor.commit()
    }

    fun getStudentMothersNameFromKey(): String? {
        return sp.getString("StudentMothersName", " - ")
    }

    fun setStudentReligionInSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("StudentReligion", value)
        editor.commit()
    }

    fun getStudentReligionFromKey(): String? {
        return sp.getString("StudentReligion", "")
    }

    fun setStudentCasteInSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("StudentCaste", value)
        editor.commit()
    }

    fun getStudentCasteFromKey(): String? {
        return sp.getString("StudentCaste", "")
    }

    fun setStudentBloodGroupInSP(value: String) {
        var value = value
        if (value == "null" || value.length == 0) value = " - "
        editor.putString("StudentBloodGroup", value)
        editor.commit()
    }

    fun getStudentBloodGroupFromKey(): String? {
        return sp.getString("StudentBloodGroup", "")
    }

    fun setAcademyTypeInSP(value: String?) {
        editor.putString("academyType", value)
        editor.commit()
    }

    fun getAcademyTypeFromKey(): String? {
        return sp.getString("academyType", "defualt")
    }

    fun setProgramIdsInSP(value: String?) {
        editor.putString("programIds", value)
        editor.commit()
    }

    fun getProgramIdsFromKey(): String? {
        return sp.getString("programIds", "defualt")
    }

    fun setCurrentVersionSP(value: String?) {
        editor.putString("CurrentVersion", value)
        editor.commit()
    }

    fun getCurrentVersionFromKey(): String? {
        return sp.getString("CurrentVersion", "")
    }

    fun setVersionInSP(value: String?) {
        editor.putString("versions", value)
        editor.commit()
    }

    fun getVersionFromKey(): String? {
        return sp.getString("versions", "")
    }

    fun setModulePermissionList(Tag: String?, lst: ArrayList<Int?>?) {
        val gson = Gson()
        val json: String = gson.toJson(lst)
        editor.putString(Tag, json)
        editor.commit()
    }

    fun getModulePermissionList(Tag: String?): ArrayList<Int?>? {

        val obj = sp.getString(Tag, "defValue")
        return if (obj == "defValue") {
            ArrayList()
        } else {
            val type = object : TypeToken<ArrayList<Int?>?>() {}.type
            val gson = Gson()
            gson.fromJson(obj, type)
        }
    }
}


