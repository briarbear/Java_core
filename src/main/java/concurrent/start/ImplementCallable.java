package concurrent.start;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ImplementCallable implements Callable<Integer> {


    public Integer call() throws Exception {
        int i = 0;
        for (; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }


    public static void main(String[] args) throws InterruptedException {
        ImplementCallable ic = new ImplementCallable();
        FutureTask<Integer> ft = new FutureTask<Integer>(ic);

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 5){
                new Thread(ft).start();  //启动线程
                Thread.sleep(3000); //更好观察父线程 子线程执行顺序
            }
        }

        try {
            System.out.println("子线程的返回值："+ ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
