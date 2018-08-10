package test;

/**
 * 测试
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-09 15:53
 */
public class Test3 {

    public static void main(String[] args) {

//        String s0="kvill";
//        String s1="kvill";
//        String s2="kv" + "ill";
//        System.out.println( s0==s1 );
//        System.out.println( s0==s2 );
//
//        String s3="kvill";
//        String s4=new String("kvill");
//        String s5="kv" + new String("ill");
//        System.out.println( s3==s4 );
//        System.out.println( s3==s5 );
//        System.out.println( s4==s5 );

        String s6= "kvill";
        String s7=new String("kvill");
        String s8=new String("kvill");
        System.out.println( s6==s7 );
        System.out.println("*********");
        s6.intern();
        s7=s7.intern(); //把常量池中“kvill”的引用赋给s2
        System.out.println( s6==s7);
        System.out.println( s6==s7.intern() );
        System.out.println( s6==s8 );

    }
}
