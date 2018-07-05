package design_pattern.proxy.static_proxy;

/**
 * 代理实现类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-05-10:52
 */
public class SubjectProxy implements Subject {

    Subject subjectImlp = new SubjectImpl();
    @Override
    public void doSomething() {
        subjectImlp.doSomething(); //调用真事实现类的方法
    }
}
