package com.lbrant.x_project;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.lbrant.jni.MathJNI;

/**
    * Created by dell on 2015/9/9.
            */
    public class NDKTestActivity extends Activity {
        private static final String LOG_TAG = "NDKTestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MathJNI mathJNI = new MathJNI();
        Log.d(LOG_TAG, "1+2 = " + mathJNI.add(1, 2));
    }
}
