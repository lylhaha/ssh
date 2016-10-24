package DesignDemo;

/**
 * Created by user on 2016/10/24.
 */
public class SendFactory  {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
