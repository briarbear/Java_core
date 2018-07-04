package test;

public class AI {
    public static void main(String[] args) {
        E e = new E();
        e.say();
    }
}



interface BI{
    default void say(){
        System.out.println("BBB");
    }
}

interface CI{
    default void say(){
        System.out.println("CCC");
    }
}

interface DI extends CI,BI{
    @Override
    default void say() {
        CI.super.say();
    }
}

class E implements DI{

}
