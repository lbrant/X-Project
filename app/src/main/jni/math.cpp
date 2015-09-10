//
// Created by dell on 2015/9/10.
//

#include "math.h"

JNIEXPORT jint JNICALL Java_com_lbrant_jni_MathJNI_add
        (JNIEnv *env, jobject, jint a, jint b) {
    return a + b;
}