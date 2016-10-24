package DesignDemo;

/**
 * Created by user on 2016/10/24.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
