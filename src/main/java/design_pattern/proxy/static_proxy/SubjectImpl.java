package design_pattern.proxy.static_proxy;

/**
 * 接口实现类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-05-10:51
 */
public class SubjectImpl implements Subject{
    @Override
    public void doSomething() {
        System.out.println("do something.....");
    }
}
