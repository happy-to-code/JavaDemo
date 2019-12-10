package cn.test3.vin;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/12/10
 */
public class insert {

    public void insert(int data) {

        if (tree == null) {

            tree = new Node(data);

            return;

        }


        Node p = tree;

        while (p != null) {

            if (data > p.data) {

                if (p.right == null) {

                    p.right = new Node(data);

                    return;

                }

                p = p.right;

            } else { // data < p.data

                if (p.left == null) {

                    p.left = new Node(data);

                    return;

                }

                p = p.left;

            }

        }

    }
}
