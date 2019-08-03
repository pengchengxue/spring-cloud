package service;

public class TestService {
    public static void main(String[] args) {
        //冒泡排序，--正序
        Integer[] arr = {12,2,5,45,34,11,9,23,112};
        for (int i = 0; i < arr.length; ++i) {
            // 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; ++j) {        //此处你可能会疑问的j<n-i-1，因为冒泡是把每轮循环中较大的数飘到后面，
                // 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
                if (arr[j] > arr[j + 1]) {        //即这两个相邻的数是逆序的，交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;//没有数据交换，数组已经有序，退出排序
        }

        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

        //选择排序，--反序
        Integer[] array = {12,2,5,45,34,11,9,23,112};
        for (int i = 0; i < array.length; i++) {
            // 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            boolean flag = false;
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[minIndex]){ //找到最大的数
                    minIndex = j; //将最大数的索引保存
                    flag = true;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            if (!flag) break;//没有数据交换，数组已经有序，退出排序
        }
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
