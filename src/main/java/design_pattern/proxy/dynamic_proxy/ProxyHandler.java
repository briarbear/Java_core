package design_pattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理处理类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-05-14:27
 */
public class ProxyHandler implements InvocationHandler {

    private Object target;

    /**
     * 绑定委托对象，并返回代理类
     */
    public Object bind(Object target){
        this.target = target;

        //绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //这里就可以进行所谓的AOP编程
        //执行前方法
        System.out.println("before...");
        result = method.invoke(target,args);
        //执行后方法
        System.out.println("after...");

        return result;
    }
}
