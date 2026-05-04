package pekan5_2511533005;
import java.util.*;
public class TambahSLL_2511533005 {
    public static NodeSLL_2511533005 insertAtFront(NodeSLL_2511533005 head, int value) {
        NodeSLL_2511533005 new_node_3005 = new NodeSLL_2511533005(value);
        new_node_3005.next_3005 = head;
        return new_node_3005;
    }
    // fungsi menambahkan node di akhir SLL
    public static NodeSLL_2511533005 insertAtEnd(NodeSLL_2511533005 head, int value) {
        // buat sebuah node dengan sebuah nilai
        NodeSLL_2511533005 newNode_3005 = new NodeSLL_2511533005(value);
        // jika list kosong maka node jadi head
        if (head == null) {
            return newNode_3005;
        }
        // simpan head ke variabel sementara
        NodeSLL_2511533005 last_3005 = head;
        // telusuri ke node akhir
        while (last_3005.next_3005 != null) {
            last_3005 = last_3005.next_3005;
        }
        // ubah pointer
        last_3005.next_3005 = newNode_3005;
        return head;
    }
    static NodeSLL_2511533005 GetNode(int data) {
        return new NodeSLL_2511533005(data);
    }

    static NodeSLL_2511533005 insertPos(NodeSLL_2511533005 headNode, int position, int value) {
        NodeSLL_2511533005 head = headNode;
        if (position < 1)
            System.out.print("Invalid position");
        if (position == 1) {
            NodeSLL_2511533005 new_node_3005 = new NodeSLL_2511533005(value);
            new_node_3005.next_3005 = head;
            return new_node_3005;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    NodeSLL_2511533005 newNode_3005 = GetNode(value);
                    newNode_3005.next_3005 = headNode.next_3005;
                    headNode.next_3005 = newNode_3005;
                    break;
                }
                headNode = headNode.next_3005;
            }
            if (position != 1)
                System.out.print("Posisi di luar jangkauan");
        }
        return head;
    }
    public static void printList(NodeSLL_2511533005 head) {
        NodeSLL_2511533005 curr_3005 = head;
        while (curr_3005.next_3005 != null) {
            System.out.print(curr_3005.data_3005+"-->");
            curr_3005 = curr_3005.next_3005;
        }
        if (curr_3005.next_3005==null) {
            System.out.print(curr_3005.data_3005);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // buat linked list 2->3->5->6
        NodeSLL_2511533005 head_3005 = new NodeSLL_2511533005(2);
        head_3005.next_3005 = new NodeSLL_2511533005(3);
        head_3005.next_3005.next_3005 = new NodeSLL_2511533005(5);
        head_3005.next_3005.next_3005.next_3005 = new NodeSLL_2511533005(6);
        // cetak list asli
        System.out.print("Senarai berantai awal:");
        printList(head_3005);
        // tambahkan node baru di depan
        System.out.print("tambah 1 simpul di depan: ");
        int data = 1;
        head_3005 = insertAtFront(head_3005, data);
        // cetak update list
        printList(head_3005);
        // tambahkan node baru di belakang
        System.out.print("tambah 1 simpul di belakang: ");
        int data2 = 7;
        head_3005 = insertAtEnd(head_3005, data2);
        // cetak update list
        printList(head_3005);
        System.out.print("tambah 1 simpul ke data 4: ");
        int data3 = 4;
        int pos=4;
        head_3005 = insertPos(head_3005,pos,data3);
        // cetak update list
        printList(head_3005);
    }
}