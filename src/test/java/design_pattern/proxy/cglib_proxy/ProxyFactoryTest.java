package design_pattern.proxy.cglib_proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyFactoryTest {

    @Test
    public void test(){
        //目标对象
        SubjectImpl target = new SubjectImpl();

        //代理对象
        SubjectImpl proxy = (SubjectImpl)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.doSomeThing();


    }

}