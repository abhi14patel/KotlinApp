package com.serosoft.academia.Networking;

import android.content.Context;
import android.os.AsyncTask;
import com.serosoft.academia.Interfaces.AsyncTaskCompleteListener;
import com.serosoft.academia.Manager.LoginManager;

import java.util.HashMap;

public class OptimizedServerCallAsyncTask extends AsyncTask<String, Void, String> {

    private String returnResponse = "";
    private String returnResult;
    Context context;
    private AsyncTaskCompleteListener callback;
    private String callFor;
    private APIManager apiManager;
    private LoginManager loginManager;

    public OptimizedServerCallAsyncTask(Context context, AsyncTaskCompleteListener callback, String callFor) {

        this.context = context;
        this.callback = callback;
        this.callFor = callFor;
        apiManager = new APIManager(context);
        loginManager = new LoginManager(context);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... params) {
        switch (callFor) {
            /*Login*/
            case KEYS.SWITCH_USER_LOGIN:
                HashMap<String, String> hashMap = new HashMap<String, String>();
                hashMap.put(KEYS.USERNAME, params[0]);
                hashMap.put(KEYS.PASSWORD, params[1]);
                hashMap.put(KEYS.GRANT_TYPE, params[2]);
                hashMap.put(KEYS.CLIENT_ID, params[3]);
                hashMap.put(KEYS.CLIENT_SECRET, params[4]);
                if (loginManager.validateUserNameAndPassword(hashMap)) {
                    returnResult = KEYS.TRUE;
                } else {
                    returnResult = KEYS.FALSE;
                }
                break;

            case KEYS.SWITCH_USER_LOGIN_INCREPTION:
                HashMap<String, String> hashMap1 = new HashMap<String, String>();
                hashMap1.put(KEYS.USERNAME, params[0]);
                hashMap1.put(KEYS.PASSWORD, params[1]);
                hashMap1.put(KEYS.GRANT_TYPE, params[2]);
                hashMap1.put(KEYS.CLIENT_ID, params[3]);
                hashMap1.put(KEYS.CLIENT_SECRET, params[4]);
                if (loginManager.validateUserNameAndPassword(hashMap1)) {
                    returnResult = KEYS.TRUE;
                } else {
                    returnResult = KEYS.FALSE;
                }
                break;
        }
        return returnResponse;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        HashMap<String, String> responseMap = new HashMap<>();
        responseMap.put(KEYS.RETURN_RESPONSE, returnResponse);
        responseMap.put(KEYS.RETURN_RESULT, returnResult);
        responseMap.put(KEYS.CALL_FOR, callFor);
        callback.onTaskComplete(responseMap);
    }
}
