package pekan9_2511533005;

public class BTreeDriver_2511533005 {
	
    public static void main(String[] args) {
        //Membuat Pohon
        BTree_2511533005 tree_3005 = new BTree_2511533005();
        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree_3005.countNodes());
        //menambahkan simpul data 1
        Node_2511533005 root_3005 = new Node_2511533005(1);
        //menjadikan simpul 1 sebagai root
        tree_3005.setRoot(root_3005);
        System.out.println("Jumlah simpul jika hanya ada root");
        System.out.println(tree_3005.countNodes());
        Node_2511533005 node2_3005 = new Node_2511533005(2);
        Node_2511533005 node3_3005 = new Node_2511533005(3);
        Node_2511533005 node4_3005 = new Node_2511533005(4);
        Node_2511533005 node5_3005 = new Node_2511533005(5);
        Node_2511533005 node6_3005 = new Node_2511533005(6);
        Node_2511533005 node7_3005 = new Node_2511533005(7);
        Node_2511533005 node8_3005 = new Node_2511533005(8);
        Node_2511533005 node9_3005 = new Node_2511533005(9);
        root_3005.setLeft(node2_3005);
        node2_3005.setLeft(node4_3005);
        node2_3005.setRight(node5_3005);
        node4_3005.setRight(node8_3005);
        root_3005.setRight(node3_3005);
        node3_3005.setLeft(node6_3005);
        node3_3005.setRight(node7_3005);
        node6_3005.setLeft(node9_3005);
        //Set root
        tree_3005.setCurrent(tree_3005.getRoot());
        System.out.println("menampilkan simpul terakhir: ");
        System.out.println(tree_3005.getCurrent().getData());
        System.out.println("Jumlah simpul: setelah simpul 7 ditambahkan");
        System.out.println(tree_3005.countNodes());
        System.out.println("InOrder: ");
        tree_3005.printInorder();
        System.out.println("\nPreorder: ");
        tree_3005.printPreOrder();
        System.out.println("\nPostorder : ");
        tree_3005.printPostOrder();
        System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
        tree_3005.print();
    
   }

}