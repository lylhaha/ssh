import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.InflaterInputStream;

/**
 * Created by user on 2016/10/20.
 */
public class URLConnection {
    public static void main(String[] args) {
        try {
            URL gis = new URL("http://www.baidu.com");
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gis.openStream(), "utf-8"));//字节按照utf-8转换成字符
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
    

}
