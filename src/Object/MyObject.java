package Object;

/**
 * Created by Administrator on 2019-01-12.
 */
public class MyObject {

    static Object object = new Object();

    // Object类的方法
    public static void main(String[] args) throws InterruptedException {
        // 1.getClass
        System.out.println(object.getClass());
        // 2.toString
        System.out.println(object.toString());
        // 3.equals
        Object object2 = new Object();
        System.out.println(object.equals(object2));
        // 4.hashCode
        System.out.println(object.hashCode());
        // 5.wait
        object.wait();
        // 6.notify
        object.notify();
        // 7.notifyAll
        object.notifyAll();
    }

}
