package cn.test3.leetcode.deln;

import cn.test3.leetcode.reverse.ListNode;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/23
 */
public class Test {
    private static int count = 1;

    public static void main(String[] args) throws Exception {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(7);
        ListNode node3 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;

        ListNode listNode = removeNthFromEnd(node1, 3);
        System.out.println(listNode);

    }

    /**
     * 删除链表倒数N个的节点
     * 此方法还是相当于快慢指针法
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) throws Exception {
        // 计算链表的长度
        int count = amount(head);

        if (n > count) {
            throw new Exception("数字n超过链表的长度！");
        }

        ListNode p = head;
        ListNode q = head;
        //  p先移动n个位置
        for (int i = 0; i < n; i++) {
            p = p.next;
        }

        if (p == null) {
            head = head.next;
            return head;
        }
        //  当p达到尾部
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }

        // 1-->2-->3  这一步相当于  1-->3
        q.next = q.next.next;

        return head;

    }

    /**
     * 计算链表的长度
     *
     * @param head
     * @return
     */
    private static int amount(ListNode head) {
        if (head == null) {
            return 0;
        }

        if (head.next != null) {
            count++;
            amount(head.next);
        }

        return count;
    }
}
