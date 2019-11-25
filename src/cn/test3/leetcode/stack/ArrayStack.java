package cn.test3.leetcode.stack;

import java.util.Arrays;

/**
 * @author zhangyifei
 * @Describle 基于数组实现的顺序栈
 */
public class ArrayStack {
    /**
     * 数组
     */
    private String[] items;

    /**
     * 栈中元素个数
     */
    private int count;

    /**
     * 栈的大小
     */
    private int n;


    /**
     * 初始化数组，申请一个大小为 n 的数组空间
     *
     * @param n
     */
    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayStack{");
        sb.append("items=").append(Arrays.toString(items));
        sb.append(", count=").append(count);
        sb.append(", n=").append(n);
        sb.append('}');
        return sb.toString();
    }

    /**
     * 入栈操作
     *
     * @param item
     * @return
     */
    public boolean push(String item) {
        // 数组空间不够了，直接返回 false，入栈失败。
        if (count == n) {
            return false;
        }

        // 将 item 放到下标为 count 的位置，并且 count 加一
        items[count] = item;
        ++count;
        return true;
    }


    /**
     * 出栈操作
     *
     * @return
     */
    public String pop() {
        // 栈为空，则直接返回 null
        if (count == 0) {
            return null;
        }

        // 返回下标为 count-1 的数组元素，并且栈中元素个数 count 减一
        String tmp = items[count - 1];
        --count;
        return tmp;
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);

        boolean push1 = arrayStack.push("1");
        boolean push2 = arrayStack.push("2");
        boolean push3 = arrayStack.push("3");
        System.out.println(arrayStack);
        boolean push4 = arrayStack.push("4");
        System.out.println(push4);
        System.out.println(arrayStack);


        String pop1 = arrayStack.pop();
        String pop2 = arrayStack.pop();
        String pop3 = arrayStack.pop();

        System.out.println(pop1);
        System.out.println(pop2);
        System.out.println(pop3);

        System.out.println(arrayStack);

    }

}