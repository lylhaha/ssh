import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by user on 2016/10/20.
 */

/**
 * URLConnection:读取和写入此URL引用的资源
 */
public class URLConnection {
    public static void main(String[] args) {
        try {
            /*
            访问url资源
             */
            URL gis = new URL("http://www.baidu.com");
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gis.openStream(), "utf-8"));//字节按照utf-8转换成字符,显示的是具体的内容，所以是转换成字符
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                bufferedReader.close();

                /*
                 URLConnection:读取和写入此URL引用的资源
                 */
                String strUrl = "http://www.baidu.com";
                URL url = new URL(strUrl);
                java.net.URLConnection connection = url.openConnection();//打开资源
                BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));//获取字节流，再转换成字符
                String str = "";
                while ((str = buffer.readLine()) != null) {
                    System.out.println(str);
                }
                buffer.close();

                String strURL = "http://www.baidu.com";
                String param = "wd=java";
               // System.out.println(sendGet(strURL, param));
                System.out.println(sendPost(strURL, param));


            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

    /**
     * 以Get 提交HTTP请求到服务器，并返回结果
     *
     * @param strURL
     * @param param
     * @return
     */
    private static String sendGet(String strURL, String param) {
        String result = "";
        String urlName = strURL + "?" + param;
        try {
            URL url = new URL(urlName);
            java.net.URLConnection connection = url.openConnection();
            connection.connect();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"gb2312"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                result += "\n" + line;

            }

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    /**
     * POST 提交HTTP请求到服务器，并返回结果
     */
    public static String sendPost(String url, String param){
        String result="";

        try {
            URL httpUrl=new URL(url);
            HttpURLConnection httpURLConnection= (HttpURLConnection) httpUrl.openConnection();
            //设置是否向httpUrlConnection输出
            httpURLConnection.setDoOutput(true);
            //设置是否从httpUrlConnection写入
            httpURLConnection.setDoOutput(true);
            //Post请求不能使用缓存
            httpURLConnection.setUseCaches(false);
            //设置请求方式
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-type","application/x-java-serialized-object");
            //利用输出流 像服务器传送参数，参数形式为“参数名=值&参数名=值"
            PrintWriter out =new PrintWriter(httpURLConnection.getOutputStream());
            out.print(param);
            out.flush();
            out.close();
            //输出请求内容
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                result+="\n"+line;

            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}
