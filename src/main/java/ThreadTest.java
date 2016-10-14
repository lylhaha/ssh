/**
 * Created by user on 2016/10/13.
 */
public class ThreadTest {
    public static void main(String[] args) {
        //实现接口 Runnable
        Thread thread=new Thread(new MyRunner());
        thread.start();
        Thread thread1=new Mythread();
        thread1.start();
    }


}
