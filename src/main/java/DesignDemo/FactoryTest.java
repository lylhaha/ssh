package DesignDemo;

/**
 * Created by user on 2016/10/24.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory=new SendFactory();
        Sender sender=factory.produce("sms");
        sender.send();

    }
}
