package pekan9_2511533005;

public class Node_2511533005 {
    int data_3005;
    Node_2511533005 left_3005;
    Node_2511533005 right_3005;

    public Node_2511533005(int data_3005) {
        this.data_3005 = data_3005;
        left_3005 = null;
        right_3005 = null;
    }

    public void setLeft(Node_2511533005 node_3005) {
        if (left_3005 == null)
            left_3005 = node_3005;
    }

    public void setRight(Node_2511533005 node_3005) {
        if (right_3005 == null)
            right_3005 = node_3005;
    }

    public Node_2511533005 getLeft() {
        return left_3005;
    }

    public Node_2511533005 getRight() {
        return right_3005;
    }

    public int getData() {
        return data_3005;
    }

    public void setData(int data) {
        this.data_3005 = data;
    }

    void printPreorder(Node_2511533005 node_3005) {
        if (node_3005 == null)
            return;
        System.out.print(node_3005.data_3005 + " ");
        printPreorder(node_3005.left_3005);
        printPreorder(node_3005.right_3005);
    }

    void printPostorder(Node_2511533005 node_3005) {
        if (node_3005 == null)
            return;
        printPostorder(node_3005.left_3005);
        printPostorder(node_3005.right_3005);
        System.out.print(node_3005.data_3005 + " ");
    }

    void printInorder(Node_2511533005 node_3005) {
        if (node_3005 == null)
            return;
        printInorder(node_3005.left_3005);
        System.out.print(node_3005.data_3005 + " ");
        printInorder(node_3005.right_3005);
    }

    public String print() {
        return this.print("", true, "");
    }

    public String print(String prefix_3005, boolean isTail_3005, String sb_3005) {
        if (right_3005 != null) {
            right_3005.print(prefix_3005 + (isTail_3005 ? "|   " : "    "), false, sb_3005);
        }
        System.out.println(prefix_3005 + (isTail_3005 ? "\\-- " : "/-- ") + data_3005);
        if (left_3005 != null) {
            left_3005.print(prefix_3005 + (isTail_3005 ? "    " : "|   "), true, sb_3005);
        }
        return sb_3005;
    }
}