package pekan5_2511533005;
public class HapusSLL_2511533005 {
    // fungsi untuk menghapus head
    public static NodeSLL_2511533005 deleteHead(NodeSLL_2511533005 head) {
        // jika SLL kosong
        if (head == null)
            return null;
        // pindahkan head ke node berikutnya
        head = head.next_3005;
        // Return head baru
        return head;
    }
    // fungsi menghapus node terakhir SLL
    public static NodeSLL_2511533005 removeLastNode(NodeSLL_2511533005 head) {
        // jika list kosong, return null
        if (head == null) {
            return null;
        }
        //jika list satu node, hapus node dan return null
        if (head.next_3005 == null) {
            return null;
        }
        //temukan node terakhir ke dua
        NodeSLL_2511533005 secondLast_3005 = head;
        while (secondLast_3005.next_3005.next_3005 != null) {
            secondLast_3005 = secondLast_3005.next_3005;
        }
        // hapus node terakhir
        secondLast_3005.next_3005 = null;
        return head;
    }
    // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511533005 deleteNode(NodeSLL_2511533005 head, int position) {
        NodeSLL_2511533005 temp_3005 = head;
        NodeSLL_2511533005 prev_3005 = null;
        // jika linked list null
        if (temp_3005 == null)
            return head;
        // kasus 1: head dihapus
        if (position == 1) {
            head = temp_3005.next_3005;
            return head;    }
        // kasus 2: menghapus node di tengah
        // telusuri ke node yang dihapus
        for (int i = 1; temp_3005 != null && i < position; i++) {
            prev_3005 = temp_3005;
            temp_3005 = temp_3005.next_3005;   }
        // jika ditemukan, hapus node
        if (temp_3005 != null) {
            prev_3005.next_3005 = temp_3005.next_3005;
        } else {
            System.out.println("Data tidak ada");        }
        return head;    }
    // fungsi mencetak SLL
    public static void printList(NodeSLL_2511533005 head) {
        NodeSLL_2511533005 curr_3005 = head;
        while (curr_3005.next_3005 != null) {
            System.out.print(curr_3005.data_3005+"-->");
            curr_3005 = curr_3005.next_3005;       }
        if (curr_3005.next_3005==null) {
            System.out.print(curr_3005.data_3005);    }
        System.out.println(); }
    //kelas main
    public static void main(String[] args) {
        // buat SLL 1 -> 2 -> 3 -> 4 -> 5-> 6 -> null
        NodeSLL_2511533005 head = new NodeSLL_2511533005(1);
        head.next_3005 = new NodeSLL_2511533005(2);
        head.next_3005.next_3005 = new NodeSLL_2511533005(3);
        head.next_3005.next_3005.next_3005 = new NodeSLL_2511533005(4);
        head.next_3005.next_3005.next_3005.next_3005 = new NodeSLL_2511533005(5);
        head.next_3005.next_3005.next_3005.next_3005.next_3005 = new NodeSLL_2511533005(6);
        // cetak list awal
        System.out.println("list awal: ");
        printList(head);
        // hapus head
        head = deleteHead(head);
        System.out.println("List setelah head dihapus: ");
        printList(head);
        //hapus node terakhir
        head = removeLastNode(head);
        System.out.println("List setelah simpul terakhir di hapus: ");
        printList(head);
        // Deleting node at position 2
        int position = 2;
        head = deleteNode(head, position);
        // Print list after deletion
        System.out.println("List setelah posisi 2 dihapus: ");
        printList(head);
    }
    
}