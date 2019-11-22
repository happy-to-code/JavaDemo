package cn.test3.leetcode.loop;

import java.util.HashMap;

/**
 * @author
 */
public class LinkADT {

    /**
     * 单链表节点
     *
     * @param <T>
     */
    private static class SingleNode<T> {
        public SingleNode<T> next;
        public T data;

        public SingleNode(T data) {
            this.data = data;
        }

    }

    /**
     * 判断是否有环 快慢指针法
     *
     * @param headNode
     * @return
     */
    public static boolean hasLoop(SingleNode headNode) {
        if (headNode == null) {
            return false;
        }

        // 慢指针  每次遍历一个节点
        SingleNode p = headNode;
        // 快指针  每次遍历两个节点
        SingleNode q = headNode.next;

        // 快指针未能遍历完所有节点
        while (q != null && q.next != null) {
            // 遍历一个节点
            p = p.next;
            // 遍历两个个节点
            q = q.next.next;

            // 已到链表末尾
            if (q == null) {
                return false;
            } else if (p == q) {
                // 快慢指针相遇，存在环
                return true;
            }
        }

        return false;
    }


    /**
     * 保存足迹信息
     */
    private static HashMap<SingleNode, Integer> nodeMap = new HashMap<>(4);

    /**
     * 判断是否有环 足迹法
     *
     * @param node
     * @return
     */
    public static boolean hasLoop2(SingleNode node, int index) {
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
        SingleNode s0 = new SingleNode(0);
        SingleNode s1 = new SingleNode(1);
        SingleNode s2 = new SingleNode(2);
        SingleNode s3 = new SingleNode(3);

        s0.next = s1;
        s1.next = s2;
        s2.next = s3;
        s3.next = s1;

        boolean b = hasLoop(s1);
        System.out.println(b);
        System.out.println("--------------------");
        boolean b2 = hasLoop2(s1,0);
        System.out.println(b2);
    }
}