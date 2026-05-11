package pekan6_2511533005;

public class HapusDLL_2511533005 {
	// fungsi mengapus node awal
	public static NodeDLL_2511533005 delHead (NodeDLL_2511533005 head) {
		if (head == null) {
			return null;
		}
		NodeDLL_2511533005 temp_3005 = head;
		head = head.next_3005;
		if (head != null) {
			head.prev_3005 = null;
		}
		return head;
	}
	//fungsi menghapus diakhir
	public static NodeDLL_2511533005 delLast (NodeDLL_2511533005 head) {
		if (head == null) {
			return null;
		}
		if (head.next_3005 == null) {
			return null;
		}
		NodeDLL_2511533005 curr_3005 = head;
		while (curr_3005.next_3005 != null) {
			curr_3005 = curr_3005.next_3005;
		}
		// update pointer previous node
		if (curr_3005.prev_3005 != null) {
			curr_3005.prev_3005.next_3005 = null;
		}
		return head;
	}
	// fungsi menghapus node posisi tertentu
	public static NodeDLL_2511533005 delPos(NodeDLL_2511533005 head, int pos) {
		//jika DLL kosong
		if(head == null) {
			return null;
		}
		NodeDLL_2511533005 curr_3005 = head;
		// telusuri sampai ke node yang akan dihapus 
		for (int i = 1; curr_3005 != null && i < pos; ++i) {
			curr_3005 = curr_3005.next_3005;
		}
		// jika posisi tidak ditemukan 
		if (curr_3005 == null) {
			return head;
		}
		// update pointer 
		if (curr_3005.prev_3005 != null) {
			curr_3005.prev_3005.next_3005 = curr_3005.next_3005;
		}
		if (curr_3005.next_3005 != null) {
			curr_3005.next_3005.prev_3005 = curr_3005.prev_3005;
		}
		// jika tang dihapus head
		if (head == curr_3005)  {
			head = curr_3005.next_3005;
		}
		return head;
	}
	// fungsi mencetak DLL 
	public static void printList (NodeDLL_2511533005 head) {
		NodeDLL_2511533005 curr_3005 = head;
		while (curr_3005 != null) {
			System.out.print(curr_3005.data_3005 + " ");
			curr_3005 = curr_3005.next_3005;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// buat sebuah DLL
		NodeDLL_2511533005 head_3005 = new NodeDLL_2511533005(1);
		head_3005.next_3005 = new NodeDLL_2511533005(2);
		head_3005.next_3005.prev_3005 = head_3005;
		head_3005.next_3005.next_3005 = new NodeDLL_2511533005(3);
		head_3005.next_3005.next_3005.prev_3005 = head_3005.next_3005;
		head_3005.next_3005.next_3005.next_3005 = new NodeDLL_2511533005(4);
		head_3005.next_3005.next_3005.next_3005.prev_3005 = head_3005.next_3005.next_3005;
		head_3005.next_3005.next_3005.next_3005.next_3005 = new NodeDLL_2511533005(5);
		head_3005.next_3005.next_3005.next_3005.next_3005.prev_3005 = head_3005.next_3005.next_3005.next_3005;
		
		System.out.print("DLL Awal: ");
		printList(head_3005);
		
		System.out.print("Setelah head dihapus: ");
		head_3005 = delHead(head_3005);
		printList(head_3005);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_3005 = delLast(head_3005);
		printList(head_3005);
		
		System.out.print("Menghapus node ke 2: ");
		head_3005 = delPos(head_3005, 2);
		
		printList(head_3005);

	}

}
