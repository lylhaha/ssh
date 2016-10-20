/**
 * Created by user on 2016/10/20.
 */
public class Singleton {
    private String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "b='" + b + '\'' +
                '}';
    }

    private  static Singleton singleton=null;

    public static synchronized Singleton getSingleton() {
        if(singleton==null){
            singleton=new Singleton();
        }

        return singleton;
    }


}
