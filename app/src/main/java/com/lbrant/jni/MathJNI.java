package com.lbrant.jni;

/**
 * Created by dell on 2015/9/9.
 */
public class MathJNI {
    static {
        System.loadLibrary("math");
    }

    public native int add(int x, int y);
}
