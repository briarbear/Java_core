package concurrent.start;

/**
 * 通过继承Thread来实现多线程
 */
public class ExtendsThread extends Thread {
    int i = 0;

    @Override
    public void run() {
        // 方法体
//        super.run();
        for (; i <10 ; i++) {
            System.out.println(getName() + " " + i);
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 5){
                new ExtendsThread().start(); //通过start()方法启动线程
                new ExtendsThread().start();
            }
        }
    }
}
