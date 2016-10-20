import java.io.File;

/**
 * Created by user on 2016/10/19.
 */
public class ReadDirectory {
    private int fileLevel;

    /**
     * 生成输出格式
     *
     * @param name
     * @param level
     * @return
     */
    public String createPrintStr(String name, int level) {
        String printStr = "";
        for (int i = 0; i < level; i++) {
            printStr = printStr + "  ";

        }
        printStr = printStr + "- " + name;
        return printStr;
    }

    /**
     * 输出给定目录
     *
     * @param dirPath
     */
    public void printDir(String dirPath) {
        String[] dirNameList = dirPath.split("\\\\");
        fileLevel = dirNameList.length;
        for (int i = 0; i < dirNameList.length; i++) {
            System.out.println(createPrintStr(dirNameList[i], i));
        }

    }

    public void readFile(String dirPath) {
        // 建立当前目录中文件的File对象
        File file = new File(dirPath);
        // 取得代表目录中所有文件的File对象数组
        File[] list = file.listFiles();

        // 遍历file数组
        for (int i = 0; i < list.length; i++) {

            if (list[i].isDirectory()) {
                System.out.println(createPrintStr(list[i].getName(), fileLevel));
                fileLevel++;
                // 递归子目录
                readFile(list[i].getPath());
                fileLevel--;
            } else {
                System.out.println(createPrintStr(list[i].getName(), fileLevel));
            }
        }
    }

    public static void main(String[] args) {
        ReadDirectory rd = new ReadDirectory();
        String dirPath = "C:\\Users\\user\\Desktop\\Study";
        rd.printDir(dirPath);
        rd.readFile(dirPath);
    }

}
