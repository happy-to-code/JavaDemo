package cn.test3.leetcode.list;

/**
 * @author zyf
 */
public class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListNode{");
        sb.append("data=").append(data);
        sb.append(", next=").append(next);
        sb.append('}');
        return sb.toString();
    }
}