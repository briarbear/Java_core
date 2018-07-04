package test;

public abstract class A {

    public abstract void hello();
    public void say(){
        System.out.println(":");
    }
}


abstract class B extends A{

    @Override
    public void hello() {

    }
}

interface C{
    public void hello();

    default void say(){
        System.out.println("");
    }



}

interface D extends C{

    @Override
    default void say() {

    }
}