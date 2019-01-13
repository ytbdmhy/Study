package Thread_Runnable_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2019-01-12.
 */
public class MyCallable implements Callable {

    @Override
    public Object call() throws Exception {
        int tickets = 10;
        for (int i =0;i<100;i++) {
            if (tickets>0) {
                System.out.println(Thread.currentThread().getName() + "--卖出票：" + tickets--);
            }
        }
        return tickets;
    }

    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        FutureTask task = new FutureTask(myCallable);
        new Thread(task, "线程").start();
    }
}
