/**
 * Created by user on 2016/10/21.
 */
public class Order {
    public static void main(String[] args) {
        int[] array = {5, 7, 1, 58, 21, 8, 10, 9};
        order1(array);
        order2(array);
        order3(array);
        order4(array);

    }

    /**
     * 直接插入排序法（从后面向前找到合适位置插入）（稳定）
     */
    public static void order1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (temp < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = temp;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    /**
     * 二分法插入排序（稳定）
     * 与初始化的状态无关，依赖于个数，当n越大时，比直接排序要好
     * 通过二分法找到合适的位置，减少了次数
     * 时间复杂度：n2/2至n,平均：O(n2)
     */
    public static void order2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int low = 0;
            int high = i - 1;
            int mid = 0;
            int temp = array[i];
            while (high - low >= 0) {
                mid = (low + high) / 2;
                if (temp < array[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            for (int j = i - 1; j >= low; j--) {//往后依次移动一位
                array[j + 1] = array[j];
            }
            array[low] = array[i];
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }

    /**
     * 希尔排序(不稳定)
     * 先分组，在直接插入排序
     */
    public static void order3(int[] array) {
        int d = array.length;
        while (true) {
            d = d / 2;//根据d分组
            for (int i = 0; i < array.length; i++) {

                for (int j = i + d; j < array.length; j = j + d) {
                    int temp = array[j];
                    for (int k = j - d; k >= i; k = k - d) {
                        if (temp < array[k]) {
                            array[k + d] = array[k];
                        } else {
                            break;
                        }
                    }
                    array[j] = temp;


                }
            }
            //d==1时 ，直接就是最后一次的直接插入
            if (d == 1) {
                break;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
    /**
     * 选择排序
     * 每次选择生育数中的最小值
     */
    public static void order4(int array[]){
        for(int i=0;i<array.length-1;i++){
            int  min=array[i];
            int flag=i;
            for(int j=i+1;j<array.length;j++){

                if(min>array[j]){
                    min=array[j];
                    flag=j;
                }

            }

            array[flag]=array[i];
            array[i]=min;

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
