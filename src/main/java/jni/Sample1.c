#include "jni_Sample1.h"
#include <string.h>

/*
 * Class:     jni_Sample1
 * Method:    intMethod
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_jni_Sample1_intMethod
  (JNIEnv *env, jobject obj, jint num){
    return num * num;
  }

/*
 * Class:     jni_Sample1
 * Method:    booleanMethod
 * Signature: (Z)Z
 */
JNIEXPORT jboolean JNICALL Java_jni_Sample1_booleanMethod
  (JNIEnv *env, jobject obj, jboolean boolean){
    return !boolean;
  }

/*
 * Class:     jni_Sample1
 * Method:    stringMethod
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_jni_Sample1_stringMethod
  (JNIEnv *env, jobject obj, jstring string)
  {
      const char* str = (*env)->GetStringUTFChars(env, string, 0);
      char cap[128];
      strcpy(cap, str);
      (*env)->ReleaseStringUTFChars(env, string, 0);
      return (*env)->NewStringUTF(env, strupr(cap));
  }

/*
 * Class:     jni_Sample1
 * Method:    intArrayMethod
 * Signature: ([I)I
 */
JNIEXPORT jint JNICALL Java_jni_Sample1_intArrayMethod
  (JNIEnv *env, jobject obj, jintArray array)
  {
      int i, sum = 0;
      jsize len = (*env)->GetArrayLength(env, array);
      jint *body = (*env)->GetIntArrayElements(env, array, 0);

      for (i = 0; i < len; ++i)
      {
          sum += body[i];
      }
      (*env)->ReleaseIntArrayElements(env, array, body, 0);
      return sum;
  }
