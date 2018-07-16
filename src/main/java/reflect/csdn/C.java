package reflect.csdn;

/**
 * 验证isInstance方法与instanceof等价性
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-09-14:46
 */
class A {}

class B extends A {}

public class C {
    static void test(Object x) {
        System.out.println("Testing x of type " + x.getClass());
        System.out.println("x instanceof A " + (x instanceof A));
        System.out.println("x instanceof B "+ (x instanceof B));
        System.out.println("A.isInstance(x) "+ A.class.isInstance(x));
        System.out.println("B.isInstance(x) " +
                B.class.isInstance(x));
        System.out.println("x.getClass() == A.class " +
                (x.getClass() == A.class));
        System.out.println("x.getClass() == B.class " +
                (x.getClass() == B.class));
        System.out.println("x.getClass().equals(A.class)) "+
                (x.getClass().equals(A.class)));
        System.out.println("x.getClass().equals(B.class)) " +
                (x.getClass().equals(B.class)));
    }
    public static void main(String[] args) {
        test(new A());
        test(new B());
    }


}
