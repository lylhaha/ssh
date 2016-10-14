/**
 * Created by user on 2016/10/13.
 */
public class MyRunner implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("My Runner:"+i);
        }
    }
}




