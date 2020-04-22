package cn.test3.leetcode.search.test1;

/**
 * @Describle:二分查找测试 二分查找依赖的是顺序表结构，简单点说就是数组
 * 那二分查找能否依赖其他数据结构呢？比如链表。答案是不可以的，主要原因是二分查找算法需要按照下标随机访问元素。
 * 数组按照下标随机访问数据的时间复杂度是 O(1)，而链表随机访问的时间复杂度是 O(n)。
 * 所以，如果数据使用链表存储，二分查找的时间复杂就会变得很高。
 * @Author: zhangyifei
 * @Date: 2019/11/28
 */
public class BSearch {
    /**
     * 非递归
     *
     * @param a
     * @param fromIndex
     * @param toIndex
     * @param value
     * @return
     */
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int value) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];
            if (midVal < value) {
                low = mid + 1;
            } else if (midVal > value) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    /**
     * 递归
     *
     * @param a
     * @param fromIndex
     * @param toIndex
     * @param value
     * @return
     */
    public static int binarySearch1(int[] a, int fromIndex, int toIndex, int value) {
        if (fromIndex > toIndex) {
            return -1;
        }
        int mid = (fromIndex + toIndex) >>> 1;
        if (a[mid] < value) {
            return binarySearch1(a, mid + 1, toIndex, value);
        } else if (a[mid] > value) {
            return binarySearch1(a, fromIndex, mid - 1, value);
        } else {
            return mid;
        }
    }

    /**
     * 二分查找
     *
     * @param a
     * @param n
     * @param value
     * @return
     */
    public static int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 7, 9, 13, 18};
        System.out.println(binarySearch(a, 0, a.length, 13));
        System.out.println(binarySearch1(a, 0, a.length, 18));
        System.out.println(bsearch(a, a.length, 18));
    }

    /**
     * 二分查找
     *
     * @param array
     * @param n
     * @param value
     * @return
     */
    int binarySearch(int[] array, int n, int value) {
        int left = 0;
        int right = n - 1;
        //如果这里是int right = n 的话，那么下面有两处地方需要修改，以保证一一对应：
        //1、下面循环的条件则是while(left < right)
        //2、循环内当array[middle]>value 的时候，right = mid

        //循环条件，适时而变
        while (left <= right) {
            //防止溢出，移位也更高效。同时，每次循环都需要更新。
            int middle = left + ((right - left) >> 1);

            if (array[middle] > value) {
                //right赋值，适时而变
                right = middle - 1;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                return middle;
            }
            //可能会有读者认为刚开始时就要判断相等，但毕竟数组中不相等的情况更多
            //如果每次循环都判断一下是否相等，将耗费时间
        }
        return -1;
    }
}
