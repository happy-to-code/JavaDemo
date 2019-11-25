package cn.test3.leetcode.list.merge;

import cn.test3.leetcode.list.ListNode;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/23
 */
public class Test {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(5);
        ListNode list3 = new ListNode(6);
        list1.next = list2;
        list2.next = list3;


        ListNode listNode = mergeTwoLists(listNode1, list1);
        System.out.println(listNode);
    }

    /**
     * 合并两个有序的链表  使其合并后仍然有序
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode head;
        if (l1.data <= l2.data) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }
}
