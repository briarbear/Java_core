package design_pattern.proxy.cglib_proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib子类代理工厂
 * 对SubjectImpl 在内存中工台构建一个子类对象
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-05-15:37
 */
public class ProxyFactory implements MethodInterceptor {
    //MethodInterceptor 需要引入cglib的jar文件,但是Spring的核心包中已经包括了Cglib功能,需要引入Spring core

    //维护目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //1. 工具类
        var en = new Enhancer();
        //2. 设置父类
        en.setSuperclass(target.getClass());
        //3. 设置回调函数
        en.setCallback(this);
        //4. 创建子类(代理对象)
        return en.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before....");
        //执行目标对象的方法
        Object result = method.invoke(target,args);
        System.out.println("afer...");
        return result;

    }
}
