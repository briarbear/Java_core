package reflect.demo;

/**
 * Word类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-06-9:46
 */
public class Word implements Office{
    @Override
    public void describe() {
        System.out.println("hello word");
    }
}
