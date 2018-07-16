package reflect.yunqi;

import org.junit.Test;
import test.A;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class AppleTest {


    /**
     * 自描述
     */
    @Test
    public void test1(){
        Class clazz = Apple.class;
        final Constructor[] constructors = clazz.getConstructors(); //获取构造器
        //获取类的构造器信息与对应的参数个数
        for (Constructor constructor : constructors) {
            System.out.println("constructor name:" + constructor.getName() + "params.length:" + constructor.getParameters().length);
        }

        //获取类的属性信息
        final Field[] fields  = clazz.getFields();
        for (Field field : fields) {
            System.out.println("filed name :" + field.getName());
        }

        ///获取类的方法信息
        final Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("method name :" + method.getName());
        }
    }


    /**
     * 自控制
     */
    @Test
    public void test2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class clazz = Class.forName("reflect.yunqi.Apple");
        //动态使用String参数的构造器
        final Constructor constructor = clazz.getConstructor(String.class);
        final Object apple = constructor.newInstance("china apple");
        System.out.println(apple instanceof Apple);

        final Apple chinaApple = (Apple)apple;

        //动态调用方法除法对象的行为
        final Method setNameMethod = clazz.getMethod("setName", String.class);
        setNameMethod.invoke(apple,"china chengdu apple");
        System.out.println("Apple name :" + chinaApple.getName());


        //动态对对象的属性赋值
        final Field nameField = clazz.getDeclaredField("name");

        //设置私有可以访问
        nameField.setAccessible(true);
        nameField.set(chinaApple,"china chengdu apple2");
        System.out.println("Appple name is :" + chinaApple.getName());
    }

}