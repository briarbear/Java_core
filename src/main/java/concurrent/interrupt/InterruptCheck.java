package concurrent.interrupt;

/**
 * 使用 isInterrupted()方法判断中断状态
 *
 * 可以在 Thread 对象上调用 isInterrupted()方法来检查任何线程的中断状态。
 * 这里需要注意：线程一旦被中断，isInterrupted()方法便会返回 true，
 * 而一旦 sleep()方法抛出异常，它将清空中断标志，此时isInterrupted()方法将返回 false
 */
public class InterruptCheck {

    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println("Point A: t.isInterrupted()=" + t.isInterrupted());
        //待决中断，中断自身
        t.interrupt();
        System.out.println("Point B: t.isInterrupted()=" + t.isInterrupted());
        System.out.println("Point C: t.isInterrupted()=" + t.isInterrupted());

        try{
            Thread.sleep(2000);
            System.out.println("was NOT interrupted");
        }catch( InterruptedException x){
            System.out.println("was interrupted");
        }
        //抛出异常后，会清除中断标志，这里会返回false
        System.out.println("Point D: t.isInterrupted()=" + t.isInterrupted());
    }
}
