package design_pattern.proxy.cglib_proxy;

/**
 * 真实实现类，无接口
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-05-15:35
 */
public class SubjectImpl {
    public void doSomeThing(){
        System.out.println("cglib proxy doing something...");
    }
}
