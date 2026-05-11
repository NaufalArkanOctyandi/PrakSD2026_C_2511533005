package pekan6_2511533005;

public class InsertDLL_2511533005 {
		// menambahkan node diawal DLL
	static NodeDLL_2511533005 insertBegin (NodeDLL_2511533005 head, int data) {
		// buat node baru 
		NodeDLL_2511533005 new_node_3005= new NodeDLL_2511533005(data);
		// jadikan pointer nextnya head
		new_node_3005.next_3005 = head;
		// jadikan pointer prev head ke new_mode 
		if (head != null) {
			head.prev_3005 = new_node_3005;
		}
		return new_node_3005;
	}
	// fungsi menambahkan node diakhir
public static NodeDLL_2511533005 insertEnd (NodeDLL_2511533005 head, int newData) {
	// buat node baru 
	NodeDLL_2511533005 newNode_3005 = new NodeDLL_2511533005(newData);
	// jika dll null jadikan head
	if (head == null) {
		head= newNode_3005;
	}
	else 	{
			NodeDLL_2511533005 curr_3005 = head;
			while (curr_3005.next_3005 != null) {
				curr_3005 = curr_3005.next_3005;
			}
			curr_3005.next_3005 = newNode_3005;
			newNode_3005.prev_3005 = curr_3005;
		}
		return head;
	}
	// fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511533005 insertAtPosition (NodeDLL_2511533005 head, int pos, int new_data) {
		// buat node baru 
		NodeDLL_2511533005 new_node_3005 = new NodeDLL_2511533005 (new_data);
		if (pos == 1) {
			new_node_3005.next_3005 = head;
			if (head != null) {
				head.prev_3005 = new_node_3005;
			}
			head = new_node_3005;
			return head;
			}
		NodeDLL_2511533005 curr_3005 = head;
	for (int i = 1; i < pos -1 && curr_3005 != null; ++i) {
			curr_3005 = curr_3005.next_3005;
		}
		if (curr_3005 == null) {
			System.out.println("Posisi tdak ada");
			return head;
		}
		new_node_3005.prev_3005 = curr_3005;
		new_node_3005.next_3005 = curr_3005.next_3005;
		curr_3005.next_3005 = new_node_3005;
		if (new_node_3005.next_3005 != null) {
			new_node_3005.next_3005.prev_3005 = new_node_3005;
		}
		return head;
	}
	public static void printList (NodeDLL_2511533005 head) {
		NodeDLL_2511533005 curr_3005 = head;
		while (curr_3005 != null) {
			System.out.print(curr_3005.data_3005 + " <-> ");
			curr_3005 = curr_3005.next_3005;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511533005 head_3005 = new NodeDLL_2511533005(2);
		head_3005.next_3005 = new NodeDLL_2511533005(3);
		head_3005.next_3005.prev_3005 = head_3005;
		head_3005.next_3005.next_3005 = new NodeDLL_2511533005(5);
		head_3005.next_3005.next_3005.prev_3005 = head_3005.next_3005;
		// cetak DLL awal 
		System.out.print("DLL Awal: ");
		printList(head_3005);
		// tambah 1 di awal
		head_3005 = insertBegin(head_3005, 1);
		System.out.print("simpul 1 ditambah awal: ");
		printList(head_3005);
		// head 6 diakhir
		System.out.print("simpul 6 ditambah di akhir: ");
		int data_3005 = 6;
		head_3005 = insertEnd(head_3005, data_3005);
		printList(head_3005);
		// menambahkan node 4 di posisi 4
		System.out.print("tambah node 4 di posisi 4: ");
		int data2_3005 = 4;
		int pos_3005 = 4;
		head_3005 = insertAtPosition (head_3005, pos_3005, data2_3005);
		printList(head_3005);
	}

}
