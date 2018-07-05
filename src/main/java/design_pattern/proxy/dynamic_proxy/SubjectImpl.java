package design_pattern.proxy.dynamic_proxy;

/**
 * 接口真实实现类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-05-14:24
 */
public class SubjectImpl implements Subject {

    @Override
    public void doSomething() {
        System.out.println("dynamic doing something .... ");
    }
}
