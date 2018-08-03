package test;

import javafx.concurrent.Worker;

import java.util.concurrent.ThreadPoolExecutor;

public abstract class A {


    public static void main(String[] args) {
        new ThreadPoolExecutor()
    }

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