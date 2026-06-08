package pekan9_2511533005;

public class BTree_2511533005 {
    private Node_2511533005 root_3005;
    private Node_2511533005 currentNode;

    public BTree_2511533005() {
        root_3005 = null;
    }

    public boolean search(int data_3005) {
        return search(root_3005, data_3005);
    }

    private boolean search(Node_2511533005 node_3005, int data_3005) {
        if (node_3005.getData() == data_3005)
            return true;
        if (node_3005.getLeft() != null)
            if (search(node_3005.getLeft(), data_3005))
                return true;
        if (node_3005.getRight() != null)
            if (search(node_3005.getRight(), data_3005))
                return true;
        return false;
    }

    public void printInorder() {
        root_3005.printInorder(root_3005);
    }

    public void printPreOrder() {
        root_3005.printPreorder(root_3005);
    }

    public void printPostOrder() {
        root_3005.printPostorder(root_3005);
    }

    public Node_2511533005 getRoot() {
        return root_3005;
    }
    public boolean isEmpty() {
    	return root_3005 == null;
    }
    public int countNodes() {
    	return countNodes(root_3005);
    }
    private int countNodes(Node_2511533005 node_3005) {
    	int count_3005 = 1;
    	if (node_3005 == null) {
    		return 0;
    	} else {
    		count_3005 += countNodes(node_3005.getLeft());
    		count_3005 += countNodes(node_3005.getRight());
    		return count_3005;
    	}
    }
    public void print() {
    	root_3005.print();
    }
    public Node_2511533005 getCurrent() {
    	return currentNode;
    }
    public void setCurrent(Node_2511533005 node_3005) {
    	this.currentNode = node_3005;
    }
    public void setRoot(Node_2511533005 root_3005) {
    	this.root_3005 = root_3005;
    }
}