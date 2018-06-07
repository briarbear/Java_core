package concurrent.synchronize;



/**
 * 假设现在我们总共有1000张票要进行出售，共有10个出售点，那么当售票到最后只有一张票时，
 * 每个售票点如何去处理这唯一的一张票？或者对于某一张票而言，
 * 假设它正在售票站1售票的程序执行过程中，但是还没有出售，那么此时，其他售票站改如何去处理这张票呢？
 */
public class SynchronizeExample {

    public static void main(String[] args) {
        int n  = 10;
        Thread[] threads = new Thread[n];//10个窗口售卖，开10个进程
        for (int i = 0; i < n; i++) {
            threads[i] = new Thread(new ticket());
            threads[i].setName(i+1+"号窗口");
            threads[i].start();
        }
    }
}

class ticket implements Runnable{
    private static int count = 1000;
    private static String key = "key"; //通过key这个互斥变量来控制对count的访问
    @Override
    public void run() {
        while (count > 0){
            synchronized (key){
                if (count > 0){
                    System.out.println("第"+Thread.currentThread().getName()+"在卖第"+(1001-count)+"张票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                }else {
                    break;
                }
            }
        }
        System.out.println("第"+Thread.currentThread().getName()+"的票已经卖完");
    }
}
