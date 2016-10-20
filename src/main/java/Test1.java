import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by user on 2016/10/20.
 */
public class Test1 {
    public static void main(String[] args) {
        //饿汉式Singleton,创建多个对象，对象是同一个
        final Single single = Single.getSingle();
        single.setA("a");
        System.out.println(single);
        final Single single1=Single.getSingle();
        System.out.println(single1);
        //懒汉式Singleton


            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton singleton1 = Singleton.getSingleton();
                  singleton1.setB("a");
                    System.out.println("0"+singleton1);
                }
            }).start();




        new Thread(new Runnable() {

            @Override
            public void run() {
                Singleton singleton = Singleton.getSingleton();


                singleton.setB("b");
                System.out.println("1"+singleton);
            }
        }).start();

    }
}
