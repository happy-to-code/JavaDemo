package cn.test3.leetcode.list.loop;

import cn.test3.leetcode.list.ListNode;

import java.util.HashMap;

/**
 * @author zyf
 */
public class LinkLoop {

    /**
     * 判断是否有环 快慢指针法
     *
     * @param headNode
     * @return
     */
    public static boolean hasLoop(ListNode headNode) {
        if (headNode == null) {
            return false;
        }

        // 慢指针  每次遍历一个节点
        ListNode slow = headNode;
        // 快指针  每次遍历两个节点
        ListNode fast = headNode.next;

        // 快指针未能遍历完所有节点
        while (fast != null && fast.next != null) {
            // 遍历一个节点
            slow = slow.next;
            // 遍历两个个节点
            fast = fast.next.next;

            // 已到链表末尾
            if (fast == null) {
                return false;
                // 如果有环就必然会相遇
            } else if (slow == fast) {
                // 快慢指针相遇，存在环
                return true;
            }
        }

        return false;
    }


    /**
     * 保存足迹信息
     */
    private static HashMap<ListNode, Integer> nodeMap = new HashMap<>(4);

    /**
     * 判断是否有环 足迹法
     *
     * @param node
     * @return
     */
    public static boolean hasLoop2(ListNode node, int index) {
        if (node == null || node.next == null) {
            return false;
        }

        if (nodeMap.containsKey(node)) {
            return true;
        } else {
            nodeMap.put(node, index);
            return hasLoop2(node.next, ++index);
        }
    }


    public static void main(String[] args) {
        ListNode s3 = new ListNode(3);
        ListNode s0 = new ListNode(0);
        ListNode s1 = new ListNode(1);
        ListNode s2 = new ListNode(2);

        s0.next = s1;
        s1.next = s2;
        s2.next = s3;
        s3.next = s1;

        boolean b = hasLoop(s1);
        System.out.println(b);
        System.out.println("--------------------");
        boolean b2 = hasLoop2(s1, 0);
        System.out.println(b2);
    }
}