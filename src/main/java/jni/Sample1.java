package jni;

/**
 * 示例类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-13 10:10
 */
public class Sample1 {
    /**
     * 4个native就是需要用C来实现的方法
     */
    public native int intMethod(int n);
    public native boolean booleanMethod(boolean bool);
    public native String stringMethod(String text);
    public native int intArrayMethod(int[] intArray);

    public static void main(String[] args) {
        //在windows下加载的就是Sample1.dll, 在linux下加载的就是Sample1.so.
        System.loadLibrary("Sample1");
        Sample1 sample = new Sample1();
        int square = sample.intMethod(5);
        boolean bool = sample.booleanMethod(true);
        String text = sample.stringMethod("Java");
        int sum = sample.intArrayMethod(new int[]{1,2,3,4,5,7,23});

        System.out.println("intMethod: " + square);
        System.out.println("booleanMethod: " + bool);
        System.out.println("stringMethod: " + text);
        System.out.println("intArrayMethod: " + sum);
    }

}
