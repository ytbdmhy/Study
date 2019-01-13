package Thread_Runnable_Callable;

/**
 * Created by Administrator on 2019-01-11.
 */
public class MyRunnable implements Runnable {

    private int tickets = 10;

    @Override
    public void run() {
        for (int i =0;i<100;i++) {
            if (tickets>0) {
                System.out.println(Thread.currentThread().getName() + "--卖出票：" + tickets--);
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable,"窗口1");
        Thread thread2 = new Thread(myRunnable,"窗口2");
        Thread thread3 = new Thread(myRunnable,"窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
