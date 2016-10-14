import java.io.*;

/**
 * Created by user on 2016/10/14.
 */
public class FileExample {
    public static void main(String[] args) {
        createFile();
    }

    private static void createFile() {
        byte[]buffer=new byte[512];
        File file=new File("C:\\Users\\user\\Desktop\\file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            inputStream=new FileInputStream(file);
            outputStream=new FileOutputStream(new File("C:\\Users\\user\\Desktop\\filecopy.txt"));
            int i=inputStream.read(buffer);
            while (i!=-1){
                outputStream.write(buffer,0,i);
                System.out.println((char)i);
                i=inputStream.read(buffer);

            }
            outputStream.write("你好".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
