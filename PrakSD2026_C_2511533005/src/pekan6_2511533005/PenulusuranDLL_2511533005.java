package pekan6_2511533005;

public class PenulusuranDLL_2511533005 {
	// fungsi penelusuran maju 
		static void forwardTraversal (NodeDLL_2511533005 head) {
			// memulai penelusuran dari head
			NodeDLL_2511533005 curr_3005 = head;
			// lanjutkan sampai akhir 
			while (curr_3005 != null) {
				// print data 
				System.out.print(curr_3005.data_3005 + " <-> ");
				// pindah ke node berikutnya 
				curr_3005 = curr_3005.next_3005;
			}
			// print spasi
			System.out.println();
		}
		// fungsi penelusuran mundur 
		static void backwardTraversal (NodeDLL_2511533005 tail) {
			// mulai dari akhir 
			NodeDLL_2511533005 curr_3005 = tail;
			// lanjut sampai head
			while (curr_3005 != null) {
				// cetak data 
				System.out.print(curr_3005.data_3005 + " <-> ");
				//pindah ke node sebelumnya
				curr_3005 = curr_3005.prev_3005;
			}
			//cetak spasi
			System.out.println();
		}
	public static void main(String[] args) {
		// cetak DLL
		NodeDLL_2511533005 head_3005 = new NodeDLL_2511533005(1);
		NodeDLL_2511533005 second_3005 = new NodeDLL_2511533005(2);
		NodeDLL_2511533005 third_3005 = new NodeDLL_2511533005(3);
		
		head_3005.next_3005 = second_3005;
		second_3005.prev_3005 = head_3005;
		second_3005.next_3005 = third_3005;
		third_3005.prev_3005 = second_3005;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal (head_3005);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal (third_3005);

	}

}
