package concurrent.start;

/**
 * 通过实现Runnable接口来创建线程
 */
public class ImplementRunnable implements Runnable {
    int i = 0;

    public void run() {
        // 方法体
//        super.run();
        for (; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 5){
                ImplementRunnable ir = new ImplementRunnable();
                //下面两个线程共享一份变量
                new Thread(ir,"新线程1").start();
                new Thread(ir,"新线程2").start();
            }
        }
    }
}


