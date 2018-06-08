package concurrent.interrupt;

/**
 * 使用 Thread.interrupted()方法判断中断状态
 *
 * 可以使用 Thread.interrupted()方法来检查当前线程的中断状态（并隐式重置为 false）。
 * 又由于它是静态方法，因此不能在特定的线程上使用，而只能报告调用它的线程的中断状态，
 * 如果线程被中断，而且中断状态尚不清楚，那么，这个方法返回 true。与 isInterrupted()不同，
 * 它将自动重置中断状态为 false，第二次调用 Thread.interrupted()方法，总是返回 false，除非中断了线程
 *
 * 补充
 * 这里补充下 yield 和 join 方法的使用。
 *
 * join 方法用线程对象调用，如果在一个线程 A 中调用另一个线程 B 的 join 方法，线程 A 将会等待线程 B 执行完毕后再执行。
 * yield 可以直接用 Thread 类调用，yield 让出 CPU 执行权给同等级的线程，如果没有相同级别的线程在等待 CPU 的执行权，则该线程继续执行。
 */
public class InterruptReset {

    public static void main(String[] args) {
        System.out.println(
                "Point X: Thread.interrupted()=" + Thread.interrupted());
        Thread.currentThread().interrupt();
        System.out.println(
                "Point Y: Thread.interrupted()=" + Thread.interrupted());
        System.out.println(
                "Point Z: Thread.interrupted()=" + Thread.interrupted());
    }

}
