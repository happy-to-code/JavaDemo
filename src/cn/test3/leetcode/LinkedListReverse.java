package cn.test3.leetcode;

/**
 * @author
 */
public class LinkedListReverse {
    /**
     * 链表反转
     *
     * @param head
     * @return
     */
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode next;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }

    public static void main(String[] args) {
        // 测试
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        // 反转
        ListNode head = reverse(node1);
        System.out.print(head.data + " " + head.next.data + " " + head.next.next.data);

    }

}