/**
 * Created by user on 2016/10/13.
 */
public class Demo {
    public static void main(String[] args) {
        Point<Integer,Integer> p1=new Point<Integer, Integer>();
        p1.setX(1);
        p1.setY(2);
        int x=p1.getX();
        int y=p1.getY();
        System.out.println(x+","+y);
        Point<Double,String>p2=new Point<Double, String>();
        p2.setX(25.4);
        p2.setY("东京180度");
        double m=p2.getX();
        String n=p2.getY();
        System.out.println(m+","+n);
        p2.printPoint("内部方法："+m,n);
    }
}
