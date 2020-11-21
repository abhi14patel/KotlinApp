package com.serosoft.academia.Networking


object KEYS {

    /*Application Level Info*/
    const val CLIENT_ID = "client_id"
    const val CLIENT_SECRET = "client_secret"
    const val GRANT_TYPE = "grant_type"
    const val PORTAL_CODE = "portal_code"
    const val GOOGLE_ACCESS_TOKEN = "googleAccessToken"

    const val CLIENT_ID_VALUE = "erpclient"
    const val CLIENT_SECRET_VALUE = "#edu\$erp#2016$"
    const val GRANT_TYPE_VALUE = "password"
    const val PORTAL_CODE_VALUE = "SSO_GOOGLE"
    const val GOOGLE_AUTH_TOKEN = "459161975858-5ehdutkp4073onb2j29r2htnfpifht4c.apps.googleusercontent.com"
    const val ENCRYPTION_KEY = "C1Rms8o7CKBtH0LG"

    /*User Related Info*/
    const val USERNAME = "username"
    const val PASSWORD = "password"

    //Server callingprogramBatchPeriodConfiguration/findByPeriodId
    const val SERVER_ISSUE = "Unexpected server error!"
    const val RESPONSE_SUCCESSFULLY = "Success"
    const val RESPONSE_FAILURE = "Response failure"
    const val TIME_OUT = 10000
    const val POST = "POST"
    const val GET = "GET"

    //Service Method Name
    /*Login releted*/
    const val LOGIN_SERVICE_METHOD = "oauth/token"
    const val LATEST_VERSION_METHOD_NEW = "rest/userAccountResource/findByPlatform"
    const val GOOGLE_SIGNIN_METHOD = "rest/userAccountResource/getSocialClientInfo"
    const val FORGOT_PASSWORD_METHOD = "rest/userAccountResource/forgotPassword"
    const val FEATURES_SERVICE_METHOD = "rest/authentication/features"
    const val FIND_USERID_SOCIAL_LOGIN_METHOD = "/rest/users/findUserDetailsBySocialLoginId"
    const val STUDENT_ACADEMIC_DETAILS_SERVICE_METHOD = "rest/student/getStudemtAllDetailsById"
    const val STUDENT_PERSONAL_DETAILS_SERVICE_METHOD = "rest/student"
    const val STUDENT_PERSONAL_DETAILS2_SERVICE_METHOD = "rest/cb/executeBasicSearch"
    const val STUDENT_PROFILE_PICTURE_METHOD = "rest/users/downloadBase64Image"
    const val STUDENT_ATTENDANCE_TYPE_METHOD = "rest/attendanceALSetting/findByAcademyLocationId"
    const val MOBILE_TRANSLATION_METHOD = "rest/uITranslation/getMobileTranslations"
    const val DATE_TIME_FORMAT_METHOD = "rest/organization/findAll"
    const val FCM_REGISTERATION_METHOD = "rest/fireBasePersonInfo/saveFireBasePersonInfo"
    const val BUILD_INFO_METHOD = "buildInfo.xml"

    /*Dashboard releted*/
    const val FEATURE_PRIVILEGES_METHOD = "rest/authentication/featurePrivilegesForMobileApp"
    const val ACADEMY_IMAGE_METHOD = "rest/academyLocation/downloadLogo"
    const val LATEST_VERSION_METHOD = "rest/mobilePlatformDetail/findByPlatform"
    const val ALL_CURRENY_METHOD = "rest/feePlan/findAllActiveCurrency"
    const val LOGOUT_METHOD = "logout"
    const val CIRCULARS_METHOD = "rest/systemInternalMessagesResource/findAdhocNotificationByUserId"
    const val NOTIFICATIONS_METHOD = "rest/systemInternalMessagesResource/findAllByUserIdAndType"
    const val NOTIFICATIONS_COUNT_METHOD = "rest/systemInternalMessagesResource/findUnreadMessageCount"
    const val FCM_LOGOUT_METHOD = "rest/fireBasePersonInfo/logOutFireBase"
    const val FEEDBACK_EMAILS_METHOD = "rest/MobileApplicationFeedBack/getMobileFeedbackEmails"

    /*User Profile releted*/
    const val PARENT_DETAILS_METHOD = "rest/personRelationship/findByPersonId"
    const val DOCUMENT_UPLOAD1_METHOD = "rest/documents/create"
    const val DOCUMENT_UPLOAD2_METHOD = "rest/studentDocument/create"
    const val DOCUMENT_TYPE_METHOD = "rest/documentType/findAll"
    const val DOCUMENT_LIST_METHOD = "rest/studentDocument/findByCriteria"
    const val MEDICAL_CONDITION_LIST_METHOD = "rest/medicalHistory/gridData"
    const val MEDICAL_CONDITION_TYPES_METHOD = "rest/medicalHistory/findAllConditionTypes"
    const val MEDICAL_CONDITION_COUNTRY_CODE_METHOD = "rest/countryResource/findAll"
    const val MEDICAL_CONDITION_CREATE_METHOD = "rest/medicalHistory/create"

    /*Reset Password releted*/
    const val RESET_PASSWORD_METHOD = "rest/users/resetPassword"
    const val PASSWORD_POLICY_METHOD = "rest/userPasswordPolicy"

    /*MyCourses releted*/
    const val PROGRAM_BATCH_PERIOD_METHOD = "rest/programBatchStudent/getStudentProgramBatchPeriodSection"
    const val MY_COURSES_METHOD = "rest/studentCourseEnrollment/findStudentCourseReport"

    /*Attendance releted*/
    const val STUDENT_ATTENDANCE_SUMMARY_COMPLETE_DAY_METHOD = "rest/studentAttendanceDashboardStudentWise/getAttendanceSummary"
    const val STUDENT_ATTENDANCE_DETAILS_COMPLETE_DAY_METHOD = "rest/studentAttendance/findStudentCompleteDayAttendanceReport"
    const val STUDENT_ATTENDANCE_SUMMARY_COURSE_LEVEL_METHOD = "rest/studentAttendanceDashboardStudentWise/findStudentAttendanceSummaryForCoreErp"
    const val STUDENT_ATTENDANCE_DETAILS_COURSE_LEVEL_METHOD = "rest/studentAttendanceDashboardStudentWise/getStudentAttendanceStatusRecords"
    const val ATTENDANCE_PROGRAM_BATCH_PERIOD_METHOD = "rest/section/findAttendanceProgramSection"
    const val ATTENDANCE_COURSE_LIST_METHOD = "rest/courseVariant/getAttendanceCourses"
    const val ATTENDANCE_COURSE_VARIANT_METHOD = "rest/courseVariant/getAttendanceCourseVariant"

    /*Fees releted*/
    const val STUDENT_FEES_METHOD = "rest/billFeePlanRuleStage/findAllStudentPendingBillDetails"
    const val STUDENT_RECEIPTS_METHOD = "rest/feeAdjustmentMaster/findAllPaymentReceivedFromStudent"
    const val RECEIPT_DOWNLOAD_METHOD = "rest/ReportDocumentResource/exportReceiptInZip"
    const val STUDENT_INVOICE_METHOD = "rest/billHeader/pendingBillForMobileOnlinePayment"
    const val PAYMENT_GATEWAY_METHOD = "rest/paymentGatewayMobileApplication/findByEnvironmentAndAcedemyLocationId"
    const val PAYMENT_ID_METHOD = "rest/onlinePaymentMaster/createAtBillLevel"
    const val PAYTM_GET_CHECKSUMHASH_METHOD = "Paytm_App/generateChecksum.php"
    const val TRANSACTION_ID_UPDATE_METHOD = "rest/onlinePaymentMaster/updateOnlinePaymentMasterTransactionStatus"
    const val TRANSACTION_UPDATE_METHOD = "rest/onlinePaymentMaster/createReceiptAndSettlementForOnlinePaymentByOnlinePaymentMasterId"
    const val STUDENT_PENDING_BILLS_METHOD = "rest/billFeePlanRuleStage/findPendindBillDetailsForOnlinePayment"
    const val STUDENT_PENDING_FEE_HEADS_METHOD = "rest/billHeader/gridDataBillAdjustmentForOnlinePayment"
    const val INVOICE_DOWNLOAD_METHOD = "rest/ReportDocumentResource/manageInvoicePdf"

    /*Assignment releted*/
    const val STUDENT_HOMEWORK_ASSIGNMENT_DESCRIPTION_METHOD = "rest/courseHomeWorkAssignment/findById"
    const val STUDENT_COURSE_SESSION_DIARY_DESCRIPTION_METHOD = "rest/courseSessionDiary/findById"
    const val STUDENT_COURSE_COVERAGE_PLAN_METHOD = "rest/courseCoveragePlan/getDailyLogOrSessionReport"
    const val STUDENT_HOMEWORK_DOCUMENTS_METHOD = "/rest/groupHomeworkAssignmentDocument/findByCriteria"
    const val STUDENT_HOMEWORK_DOCUMENT_DOWNLOAD_METHOD = "rest/documents/downloadFile/"
    const val STUDENT_HOMEWORK_ASSIGNMENT_METHOD = "rest/cb/executeBasicSearch"
    const val STUDENT_HW_ASSIGNMENT_DETAILS_BY_ASSIGNMENTID = "rest/courseHomeWorkAssignment/homeworkAssignmentDetails"
    const val STUDENT_HW_ASSIGNMENT_UPLOAD_TEMP = "rest/file/uploadTemp"
    const val STUDENT_HW_ASSIGNMENT_SAVE_MULTIPLE_DOCUMENT = "rest/groupHomeworkAssignmentDocument/saveMultipleDocument"
    const val STUDENT_HW_ASSIGNMENT_SUBMIT_DOCUMENT = "rest/groupHomeworkAssignmentDocument/submitForm"
    const val STUDENT_HW_SAVED_ASSIGNMENT_DOCUMENT = "rest/groupHomeWorkAssignment/getGroupHomeWorkAssignment"
    const val ASSIGNMENT_TYPE_METHOD = "rest/dropDown/findAll"

    /*Exam releted*/
    const val RESULT_REPORT_METHOD = "rest/examStudentAverage/findGridDataStudentResultReport"
    const val STUDENT_MARKSHEETS_METHOD = "rest/marksheetJobDetailsResource/findAllMarksheetJobDetailsByAdmissionId"
    const val STUDENT_HALLTICKET_METHOD = "rest/evaluationGroupHallTicket/getAllPublishedHallTicketByAdmissionId"
    const val STUDENT_MARKSHEETS_DOWNLOAD_METHOD = "rest/markSheet/download"
    const val PROGRAMS_METHOD = "rest/program/findByProgramAndAcademyLocation"
    const val BATCH_PERIOD_METHOD = "rest/programBatchStudent/findAllCurrentBatchPeriodByStudentId"

    /*Event releted*/
    const val STUDENT_EVENTS_METHOD = "rest/eventCalendar/getStudentEventsForApp"
    const val STUDENT_EVENT_PICTURE_METHOD = "rest/users/downloadBase64Image"
    const val EVENT_ATTACHMENTS_METHOD = "rest/resourceBooking/findAllResourceBookingDocs"

    /*TimeTable releted*/
    const val STUDENT_CALENDAR_METHOD = "rest/courseCoveragePlan/getStudentCalendar"
    const val STUDENT_CALENDAR_DURATION_METHOD = "rest/programBatchPeriodConfiguration/findByPeriodId"
    const val STUDENT_HOLIDAYS_METHOD = "rest/calendar/findCalendarsHolidays"
    const val TIMETABLE_COURSES_METHOD = "rest/studentCourseEnrollment/findStudentOptedCourses"

    /*Circular releted*/
    const val STUDENT_NOTIFICATION_DOCUMENT_DOWNLOAD_METHOD = "rest/systemInternalMessagesResource/downloadAttachment/"

    /*Academia Drive related*/
    const val ACADEMIA_DRIVE_FOLDER_METHOD = "rest/galleryResource/findsharedGalleryByUserId"
    const val ALBUM_DETAILS_METHOD = "rest/galleryImagesResource/findAllImagesByGalleryId"
    const val ULTIMATE_GALLERY_METHOD = "rest/galleryResource/gridDataForMobile"
    const val ULTIMATE_GALLERY_IMAGE_METHOD = "resources/images/uploads"

    /*My Request*/
    const val MY_REQUEST_LIST_METHOD = "rest/cb/executeBasicSearch"
    const val MY_REQUEST_REQUEST_STATUS_METHOD = "rest/requestStatusResource/findAll"
    const val MY_REQUEST_REQUEST_TYPE_METHOD = "rest/requestTypeResource/requestTypeByGroup"
    const val MY_REQUEST_RAISE_REQUEST_TYPE_METHOD = "rest/serviceRequestSettingResource/findRequestTypesByGroup"
    const val MY_REQUEST_REQUESTER_DETAILS_METHOD = "rest/serviceRequest/findStudentRequesterDetails"
    const val MY_REQUEST_REQUESTER_HOSTEL_BASIC_DETAILS_METHOD = "rest/hostelLeaveRequest/findByRequestId"
    const val MY_REQUEST_REQUESTER_BASIC_DETAILS_METHOD = "rest/leaveServiceRequest/findByRequestId"
    const val MY_REQUEST_FOLLOWUP_DETAILS_METHOD = "rest/certificateServiceRequest/gridDataFollowup"
    const val MY_REQUEST_APPROVAL_DETAILS_METHOD = "rest/certificateServiceRequest/gridDataApproval"
    const val MY_REQUEST_MANDATORY_DOCUMENT_METHOD = "rest/serviceRequest/findMandatoryDocuments"
    const val MY_REQUEST_WITHDRAWN_REQUEST_METHOD = "rest/certificateServiceRequest/withdrawRequest"
    const val MY_REQUEST_EXECUTION_HANDOVER_MODE_METHOD = "rest/requestHandoverMode/findAll"
    const val MY_REQUEST_EXECUTION_CLOSURE_REASON_METHOD = "rest/closureReason/findAll"
    const val MY_REQUEST_EXECUTION_PRINT_CERTIFICATE_METHOD = "rest/certificate/findAlMappedDocs"
    const val MY_REQUEST_EXECUTION_DOWNLOAD_CERTIFICATE_METHOD = "rest/dynamicDocument/printHostelLeaveCertificate"

    /*Others*/
    const val MARK_NOTIFICATION_AS_READ_METHOD = "rest/systemInternalMessagesResource/changeMessageStatus"

    /*Parents Login related*/
    const val ASSOCIATED_STUDENTS_METHOD = "rest/parent/findAssociatedStudents"
    const val ASSOCIATED_SIBLINGS_METHOD = "rest/parentStudentMapping/getAssociatedSibling"

    //SWITCH CASES FOR SERVICE CALL
    /*Login Screen*/
    const val SWITCH_USER_LOGIN = "userLogin"
    const val SWITCH_USER_LOGIN_INCREPTION = "userLoginIncreption"
    const val SWITCH_SWITCH_STUDENT = "switchStudent"
    const val SWITCH_GOOGLE_SIGNIN = "googleSignin"
    const val SWITCH_GOOGLE_SIGNIN_SETUP = "googleSigninSetup"
    const val SWITCH_LATEST_VERSION_NEW = "latestVersionNew"
    const val SWITCH_LATEST_VERSION_NEW2 = "latestVersionNew2"
    const val SWITCH_FORGOT_PASSWORD = "forgotPassword"
    const val SWITCH_FEATURES = "features"
    const val SWITCH_FIND_USERID_SOCIAL_LOGIN = "findUserIdSocialLogin"
    const val SWITCH_STUDENT_ACADEMIC_DETAILS = "academicDetails"
    const val SWITCH_ASSOCIATED_STUDENTS = "associatedStudents"
    const val SWITCH_STUDENT_PERSONAL_DETAILS = "personalDetails"
    const val SWITCH_STUDENT_PERSONAL_DETAILS2 = "personalDetails2"
    const val SWITCH_STUDENT_PROFILE_PICTURE = "studentProfilePicture"
    const val SWITCH_ATTENDANCE_TYPE = "attendanceType"
    const val SWITCH_MOBILE_TRANSLATION = "mobileTranslation"
    const val SWITCH_DATE_TIME_FORMAT = "dateTimeFormat"
    const val SWITCH_FCM_REGISTRATION = "fcmRegistration"

    /*Dashboard Screen*/
    const val SWITCH_FEATURE_PRIVILEGES = "featurePrivileges"
    const val SWITCH_ACADEMY_IMAGE = "academyImage"
    const val SWITCH_LATEST_VERSION = "latestVersion"
    const val SWITCH_ALL_CURRENCY = "allActiveCurrency"
    const val SWITCH_LOGOUT = "logout"
    const val SWITCH_CIRCULARS = "notifications"
    const val SWITCH_REFRESH_LOGIN = "refreshLogin"
    const val SWITCH_ASSOCIATED_SIBLINGS = "associatedSiblings"
    const val SWITCH_NOTIFICATIONS = "notifications2"
    const val SWITCH_NOTIFICATIONS_COUNT = "notificationsCount"
    const val SWITCH_FCM_LOGOUT = "fcmLogout"
    const val SWITCH_FEEDBACK_EMAILS = "feedbackEmail"

    /*User Profile Screen*/
    const val SWITCH_PARENT_DETAILS = "parentDetails"
    const val SWITCH_DOCUMENT_LIST = "documentList"
    const val SWITCH_DOCUMENT_TYPE = "documentType"
    const val SWITCH_MEDICAL_CONDITION_LIST = "medicalConditionList"
    const val SWITCH_MEDICAL_CONDITION_TYPES = "medicalConditionType"
    const val SWITCH_MEDICAL_CONDITION_COUNTRY_CODE = "medicalConditionCountryCode"
    const val SWITCH_MEDICAL_CONDITION_CREATE = "medicalConditionCreate"

    /*Reset Password Screen*/
    const val SWITCH_RESET_PASSWORD = "resetPassword"
    const val SWITCH_RESET_PASSWORD_ENCRYPT = "resetPasswordEncrypt"
    const val SWITCH_PASSWORD_POLICY = "userPasswordPolicy"

    /*MyCourses Screen*/
    const val SWITCH_MYCOURSE_PROGRAM = "myCourseProgram"
    const val SWITCH_MYCOURSE_BATCH = "myCourseBatch"
    const val SWITCH_MYCOURSE_PERIOD = "myCoursePeriod"
    const val SWITCH_MY_COURSES_LIST = "myCoursesList"

    /*Attendance Screen*/
    const val SWITCH_ATTENDANCE_SUMMARY_COMPLETE_DAY = "attendanceSummaryCompleteDay"
    const val SWITCH_ATTENDANCE_SUMMARY_COURSE_LEVEL = "attendanceSummaryCourseLevel"
    const val SWITCH_ATTENDANCE_SUMMARY_MULTIPLE_SESSION = "attendanceSummaryMultipleSession"
    const val SWITCH_ATTENDANCE_PROGRAMS = "attendancePrograms"
    const val SWITCH_ATTENDANCE_BATCH = "attendanceBatch"
    const val SWITCH_ATTENDANCE_PERIOD = "attendancePeriod"
    const val SWITCH_ATTENDANCE_SECTION = "attendanceSection"
    const val SWITCH_COURSE_LIST = "courseList"
    const val SWITCH_COURSE_VARIANT = "courseVariant"
    const val SWITCH_ATTENDANCE_DETAILS_COMPLETE_DAY = "attendanceDetaisCompleteDay"
    const val SWITCH_ATTENDANCE_DETAILS_COURSE_LEVEL = "attendanceDetaisCourseLevel"
    const val SWITCH_ATTENDANCE_DETAILS_MULTIPLE_SESSION = "attendanceDetaisMultipleSession"
    const val SWITCH_ATTENDANCE_DETAILS_COMPLETE_DAY_MONTHWISE = "attendanceDetaisCompleteDayMonthwise"
    const val SWITCH_ATTENDANCE_DETAILS_COURSE_LEVEL_MONTHWISE = "attendanceDetaisCourseLevelMonthwise"
    const val SWITCH_ATTENDANCE_DETAILS_MULTIPLE_SESSION_MONTHWISE = "attendanceDetaisMultipleSessionMonthwise"

    /*Fees Screen*/
    const val SWITCH_STUDENT_FEES = "studentFees"
    const val SWITCH_STUDENT_RECEIPTS = "studentReceipts"
    const val SWITCH_RECEIPT_DOWNLOAD = "downloadReceipt"
    const val SWITCH_STUDENT_INVOICE = "studnetInvoice"
    const val SWITCH_PAYMENT_GATEWAY = "paymentGateway"
    const val SWITCH_PAYMENT_ID = "paymentID"
    const val SWITCH_PAYTM_GET_CHECKSUMHASH = "generateChecksum"
    const val SWITCH_TRANSACTION_ID_UPDATE = "transactionIDUpdate"
    const val SWITCH_TRANSACTION_UPDATE = "transactionUpdate"
    const val SWITCH_BILL_HEADER = "billHeader"
    const val SWITCH_INVOICE_DOWNLOAD = "downloadInvoice"
    const val SWITCH_PENDING_BILLS = "pendingBills"
    const val SWITCH_PENDING_FEE_HEADS = "pendingFeeHeads"
    const val SWITCH_PAYMENT_ID_FEE_HEAD = "paymentID_FeeHead"

    /*Assignment Screen*/
    const val SWITCH_COURSE_COVERAGE_LIST_DETAILS = "courseCoveragePlan3"
    const val SWITCH_COURSE_DIARY_DESCRIPTION = "courseDiaryDescription"
    const val SWITCH_COURSE_COVERAGE_PLAN_1_DETAILS = "courseCoveragePlan1"
    const val SWITCH_COURSE_COVERAGE_PLAN_2_DETAILS = "courseCoveragePlan2"
    const val SWITCH_HOMEWORK_ASSIGNMENT_LIST_DETAILS = "homeworkAssignments"
    const val SWITCH_HOMEWORK_ASSIGNMENT_LIST_DETAILS2 = "homeworkAssignments2"
    const val SWITCH_HOMEWORK_DOCUMENTS = "assignmentDocuments"
    const val SWITCH_HOMEWORK_ASSIGNMENT_DESCRIPTION = "homeworkAssignmentDescription"
    const val SWITCH_HOMEWORK_DOCUMENT_DOWNLOAD = "assignmentDocumentDownload"
    const val SWITCH_HOMEWORK_SAVED_DOCUMENT = "savedDocument"
    const val SWITCH_ASSIGNMENT_TYPE = "assignmentType"

    /*Exam Screen*/
    const val SWITCH_RESULT_REPORT = "resultReport"
    const val SWITCH_STUDENT_MARKSHEETS = "studentMarksheets"
    const val SWITCH_STUDENT_HALLTICKET = "studentHallTicket"
    const val SWITCH_STUDENT_MARKSHEETS_DOWNLOAD = "studentMarksheetsDownload"
    const val SWITCH_PROGRAMS = "resultPrograms"
    const val SWITCH_BATCH = "resultBatch"
    const val SWITCH_PERIOD = "resultPeriod"

    /*Event Screen*/
    const val SWITCH_STUDENT_EVENTS = "studentEvents"
    const val SWITCH_EVENT_ATTACHMENTS = "eventAttachments"
    const val SWITCH_EVENT_PICTURE = "eventPicture"

    /*TimeTable Screen*/
    const val SWITCH_STUDENT_CALENDAR_COURSEWISE = "studentCalendarCoursewise"
    const val SWITCH_TIMETABLE_COURSES = "timetableCourses"
    const val SWITCH_STUDENT_HOLIDAYS_MONTHWISE = "sstudentHolidaysMonthwise"
    const val SWITCH_STUDENT_CALENDAR_MONTHWISE = "studentCalendarMonthwise"
    const val SWITCH_STUDENT_CALENDAR_DURATION = "studentCalendarDuration"
    const val SWITCH_STUDENT_CALENDAR = "studentCalendar"

    /*Circular Screen*/
    const val SWITCH_NOTIFICATION_DOCUMENT_DOWNLOAD = "notificationDocumentDownload"

    /*Academia Drive*/
    const val SWITCH_ACADEMIA_DRIVE_FOLDER = "academiaDriveFolder"
    const val SWITCH_ALBUM_DETAILS = "albumDetails"
    const val SWITCH_ULTIMATE_GALLERY = "ultimateGallery"

    /*My Request*/
    const val SWITCH_REQUEST_STATUS = "myRequestStatus"
    const val SWITCH_REQUEST_TYPE = "myRequestType"
    const val SWITCH_RAISE_REQUEST_TYPE = "raiseRequestType"
    const val SWITCH_REQUESTER_DETAILS = "requesterDetails"
    const val SWITCH_REQUESTER_HOSTEL_BASIC_DETAILS = "requesterHostelBasicDetails"
    const val SWITCH_REQUESTER_BASIC_DETAILS = "requesterBasicDetails"
    const val SWITCH_MANDETORY_DOCUMENTS = "mandatoryDocuments"
    const val SWITCH_FOLLOWUP_DETAILS = "followupDetails"
    const val SWITCH_APPROVAL_DETAILS = "approvalDetails"
    const val SWITCH_WITHDRAW_REQUEST = "withdrawRequest"
    const val SWITCH_EXECUTION_HANDOVER_MODE = "executionHandoverMode"
    const val SWITCH_EXECUTION_CLOSURE_REASON = "executionClosureReason"
    const val SWITCH_EXECUTION_PRINT_CERTIFICATE = "executionPrintCertificate"
    const val SWITCH_EXECUTION_DOWNLOAD_CERTIFICATE = "executionDownloadCertificate"

    /*Others*/
    const val SWITCH_MARK_NOTIFICATION_AS_READ = "markNotificationAsRead"
    const val NET_ERROR_HEAD = "Network Error"
    const val NET_ERROR_MESSAGE = "Please Check Your Internet Connection!"
    const val CALL_FOR = "callFor"
    const val RETURN_RESPONSE = "returnResponse"
    const val RETURN_RESULT = "returnResult"
    const val TRUE = "true"
    const val FALSE = "false"
    const val COURSE_LEVEL = "COURSE_LEVEL"
    const val MULTIPLE_SESSION = "MULTIPLE_SESSION"
    const val COMPLETE_DAY = "COMPLETE_DAY"
    const val FEES_STRING = "FEES_STRING"
    const val RECEIPTS_STRING = "RECEIPTS_STRING"

    /**
     * Password encryption key
     */
    const val ENCRYPT_KEY =
        "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC1Nrr7gsMxSv+WN/eaJJE0JcOce8McNfRMK0pYKFrwuyvEj6W0sul+npdIlz6eT69SZA5uh+kmjVa4jHj2CPdEXrtuECl761acyay+nTDpxBNAu5lNZmN3roD+sBciGmqX0A2Awlb78mq/cjf+Jm2TRf2o6Pkv5FLocDAo7FgPIwIDAQAB"
}
