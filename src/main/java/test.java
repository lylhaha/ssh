/**
 * Created by user on 2016/10/10.
 */
public class test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        a1.show(b);
        a1.show(c);
        a1.show(d);
        a2.show(b);
        a2.show(c);
        a2.show(d);
        b.show(b);
        b.show(c);
        b.show(d);
        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));

        int i=-7*9;
        System.out.println(i);


    }

    public static class A {
        public final String show(D obj) {
            return ("A and D");
        }

        public String show(A obj) {
            return ("A and A");
        }

        public void a(String a ,int b){

        }
        public void a(int b,String c){}

    }
    public static class B extends A{
        String a="1";
        class AB{
            String a="2";
            public void a(){
                System.out.println(a);
            }
        }
        public  String show(B obj){
            return ("B and B");
        }


        public  String show(A obj){
            return ("B and A");
        }
    }

    public static class C extends B{

    }

    public static class D extends B{

    }


}



