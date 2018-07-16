package design_pattern.proxy.dynamic_proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyHandlerTest {

    @Test
    public void bind() {
        ProxyHandler proxy = new ProxyHandler();
        //绑定该类实现的所有接口
        Subject sub = (Subject) proxy.bind(new SubjectImpl());
        sub.doSomething();
    }
}