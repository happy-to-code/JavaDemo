package cn.test3.niuke;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * <p>
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */
public class Solution5 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>(10);

        if (sum <= 2) {
            return arrayLists;
        }
        int temp1 = (sum / 2);
        int temp2 = (sum + 1) / 2;

        for (int i = 1; i <= temp1; i++) {
            if (i > temp1) {
                break;
            }
            int count = i;
            for (int j = i + 1; j <= temp2; j++) {
                count += j;
                if (count == sum) {
                    addList(arrayLists, i, j);
                    continue;
                }
                if (count > sum) {
                    continue;
                }
            }
        }
        return arrayLists;
    }

    private void addList(ArrayList<ArrayList<Integer>> arrayLists, int i, int j) {
        ArrayList<Integer> subList = new ArrayList<>(10);

        for (int k = i; k <= j; k++) {
            subList.add(k);

        }

        arrayLists.add(subList);
    }


    public static void main(String[] args) {
        int i = 3;
        System.out.println(i / 2);
        System.out.println((i - 1) / 2);

        System.out.println("----------");
        Solution5 s = new Solution5();
        ArrayList<ArrayList<Integer>> arrayLists = s.FindContinuousSequence(100);
        for (ArrayList<Integer> arrayList : arrayLists) {
            System.out.println(arrayList);
        }
    }
}