package classloader;
/**
 * 测试主类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-20 14:41
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader myClassLoader = new MyClassLoader();
        //使用自定义的类加载器 反射
//        Class<?> clazz = myClassLoader.loadClass("classloader.People");
        Class<?> clazz = Class.forName("classloader.People", true, myClassLoader);
        Object instance = clazz.newInstance();
        System.out.println(instance);
        System.out.println(instance.getClass().getClassLoader());
    }
}
