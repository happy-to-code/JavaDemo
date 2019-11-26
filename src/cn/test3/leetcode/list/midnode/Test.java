package cn.test3.leetcode.list.midnode;

import cn.test3.leetcode.list.ListNode;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/23
 */
public class Test {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node3 = new ListNode(9);
        ListNode node2 = new ListNode(7);
        ListNode node4 = new ListNode(11);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode listNode = middleNode(node1);
        System.out.println(listNode);
    }

    /**
     * 给出任意单向链表，找出并返回该链表的中间节点。
     * <p>
     * 奇数长度的链表，例如：1->2->3->4->5
     * 返回节点 3
     * <p>
     * 偶长度的链表，例如：1->2->3->4->5->6
     * 返回节点 4
     * <p>
     * <p>
     * 定义两个指针fast和slow。
     * slow一次遍历一个节点，fast一次遍历两个节点，
     * 由于fast的速度是slow的两倍，所以当fast遍历完链表时，slow所处的节点就是链表的中间节点。
     *
     * @param head
     * @return
     */
    public static ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        // 当没有到尾节点时，就一直循环
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 走到这一步，说明 （fast == null || fast.next == null）
        return fast == null ? slow : slow.next;
    }
}