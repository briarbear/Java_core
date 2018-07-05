package design_pattern.proxy.static_proxy;

import org.junit.Test;


public class StaticProxyTest {

    @Test
    public void test(){
        Subject sub = new SubjectProxy();  //实例化代理实现类对象
        sub.doSomething();
    }

}