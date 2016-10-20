import java.io.*;

/**
 * Created by user on 2016/10/14.
 */
public class ObjectStream {
    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream=null;
        ObjectInputStream objectInputStream=null;
        try {
            objectOutputStream=new ObjectOutputStream(new FileOutputStream("C:\\Users\\user\\Desktop\\file.txt"));
            objectOutputStream.writeObject(new Teacher("刘玉连", 23));
            objectInputStream=new ObjectInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\file.txt"));
            try {
                System.out.println(objectInputStream.readObject());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();

                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }


}
