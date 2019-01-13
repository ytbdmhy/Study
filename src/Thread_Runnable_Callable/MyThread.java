package Thread_Runnable_Callable;

/**
 * Created by Administrator on 2019-01-11.
 */
public class MyThread extends Thread {

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
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}