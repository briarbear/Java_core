 # 理解中断
 ---
 
 - http://wiki.jikexueyuan.com/project/java-concurrency/thread-interrupt.html
 
 
> 中断可以理解为线程的一个标识位属性，它表示一个运行中的线程是否被其他线程进行
了中断操作。中断好比其他线程对该线程打了个招呼，其他线程通过调用该线程的interrupt()
方法对其进行中断操作。

> 线程通过检查自身是否被中断来进行响应，线程通过方法islnterrupted0来进行判断是
否被中断，也可以调用静态方法Thread.interrupted0对当前线程的中断标识位进行复位。如
果该线程已经处于终结状态，即使该线程被中断过，在调用该线程对象的islnterrupted0时依
旧会返回false。

> 当一个线程运行时，另一个线程可以调用对应的 Thread 对象的 interrupt()方法来中断它，该方法只是在目标线程中设置一个标志，表示它已经被中断，并立即返回。这里需要注意的是，如果只是单纯的调用 interrupt()方法，线程并没有实际被中断，会继续往下执行
