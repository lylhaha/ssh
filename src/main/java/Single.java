/**
 * 饿汉Singleton
 * 调用方法时，直接创建了该对象
 * Created by user on 2016/10/20.
 */
public class Single {
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    private Single() {

    }

    /*
    直接私有化创建变量
     */
    private static final Single single = new Single();


    public static Single getSingle() {
        return single;
    }

    @Override
    public String toString() {
        return "Single{" +
                "a='" + a + '\'' +
                '}';
    }
}
