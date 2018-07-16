package reflect.csdn;

import java.sql.SQLOutput;
import java.util.Random;

/**
 * 通过Class字面常量获取Class对象
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-09-13:51
 */


class Initable{
    //编译器静态变量
    static final int staticFianl = 47;
    //非编译期静态常量
    static final int staticFinal2  = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2{
    //静态成员变量
    static int staicNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        //字面常量获取方式获取Class对象
        Class initable =  Initable.class;
        System.out.println("After createing Initable ref");

        //不触发类初始化
        System.out.println("1:"+Initable.staticFianl);

        //会触发类初始化
        System.out.println("1:"+Initable.staticFinal2);

        //会触发类的初始化
        System.out.println("2:"+Initable2.staicNonFinal);

        //forName方法获取Class对象
        Class initable3 = Class.forName("reflect.csdn.Initable3");
        System.out.println("After createing Initable3 ref");
        System.out.println("3:"+Initable3.staticNonFinal);

    }
}
