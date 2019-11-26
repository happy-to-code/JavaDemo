package cn.test3.leetcode.list.deln;

import cn.test3.leetcode.list.ListNode;

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

        ListNode slow = head;
        ListNode fast = head;
        //  fast先移动n个位置
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;
            return head;
        }
        //  当fast达到尾部
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // 1-->2-->3  这一步相当于  1-->3
        slow.next = slow.next.next;

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
