package reflect.demo;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class WordTest {

    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1. 通过Class类得到对象
        Class office = Class.forName("reflect.demo.Word");
//        Office word = (Office) office.getConstructor().newInstance(); jdk10
        Office word = (Office) office.newInstance();
        word.describe();


        //2. 通过对象得到Class类
        Word word2 = new Word();
        Class w1 = word2.getClass();  //通过对象的getClass()方法获取Class
        Class w2 = Word.class;        //通过类的.class获取Class
        Class w3 = Class.forName("reflect.demo.Word");  //通过包路径获取Class

        System.out.println(w1 == w2);  //true
        System.out.println(w2 == w3);  //true

    }

}