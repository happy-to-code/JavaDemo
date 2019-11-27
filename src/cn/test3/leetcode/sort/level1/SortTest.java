package cn.test3.leetcode.sort.level1;

/**
 * @Describle: 这3种排序中插入排序性能是最好的，因为他的交换此时少，其次是冒泡，最差的是选择
 * @Author: zhangyifei
 * @Date: 2019/11/26
 */
public class SortTest {
    public static void main(String[] args) {
        int[] array = {1, -3, 2, 0};

        SortTest sortTest = new SortTest();
        SortTest.insertSort(array);

        sortTest.insertionSort(array);

        sortTest.bubbleSort(array, 4);

        System.out.println(sortTest);


    }

    /**
     * 插入排序的另一种写法
     *
     * @param a
     */
    public static void insertSort(int[] a) {
        // 要插入的数据
        int i, j, insertNote;
        // 从数组的第二个元素开始循环将数组中的元素插入
        for (i = 1; i < a.length; i++) {
            // 设置数组中的第2个元素为第一次循环要插入的数据
            insertNote = a[i];
            // insertNote 前一个元素的下标
            j = i - 1;
            while (j >= 0 && insertNote < a[j]) {
                // 如果要插入的元素小于第j个元素,就将第j个元素向后移动
                a[j + 1] = a[j];
                j--;
            }
            // 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
            a[j + 1] = insertNote;
        }
    }

    /**
     * 选择排序
     *
     * @param a
     */
    public static void selectSort(int[] a) {
        if (a == null || a.length <= 0) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            // 将当前下标定义为最小值下标
            int flag = i;
            for (int j = i + 1; j < a.length; j++) {
                // a[j] < temp 从小到大排序；a[j] > temp 从大到小排序
                if (a[j] < temp) {
                    temp = a[j];
                    // 如果有小于当前最小值的关键字将此关键字的下标赋值给flag
                    flag = j;
                }
            }
            if (flag != i) {
                a[flag] = a[i];
                a[i] = temp;
            }
        }
    }

    /**
     * 冒泡排序，a 表示数组，n 表示数组大小
     *
     * @param a
     * @param n
     */
    public void bubbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                // 交换
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;

                    // 表示有数据交换
                    flag = true;
                }
            }
            // 没有数据交换，提前退出
            if (!flag) {
                break;
            }
        }
    }

    /**
     * 插入排序，a 表示数组，n 表示数组大小
     *
     * @param a
     */
    public void insertionSort(int[] a) {
        if (a.length <= 1) {
            return;
        }
        for (int i = 1; i < a.length; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    // 数据移动
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            // 插入数据
            a[j + 1] = value;
        }

    }


}
