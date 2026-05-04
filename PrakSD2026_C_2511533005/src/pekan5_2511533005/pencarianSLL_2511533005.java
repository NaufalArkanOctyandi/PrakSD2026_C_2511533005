package pekan5_2511533005;

public class pencarianSLL_2511533005 {
	static boolean searchKey (NodeSLL_2511533005 head, int Key) {
		NodeSLL_2511533005 curr_3005= head;
		while (curr_3005 != null) {
			if(curr_3005.data_3005==Key)
				return true;
			curr_3005 = curr_3005.next_3005; }
		return false; }
	public static void traversal (NodeSLL_2511533005 head) {
		//mulai dari head
		NodeSLL_2511533005 curr_3005 = head;
		//telusuri sampai pointer null
		while (curr_3005 != null) {
			System.out.print(" " + curr_3005.data_3005);
			curr_3005 = curr_3005.next_3005;}
		System.out.println(); }
		
		public static void main (String[] args) {
			NodeSLL_2511533005 head_3005 = new NodeSLL_2511533005(14);
			head_3005.next_3005 = new NodeSLL_2511533005(21);
			head_3005.next_3005.next_3005 = new NodeSLL_2511533005(13);
			head_3005.next_3005.next_3005.next_3005 = new NodeSLL_2511533005(30);
			head_3005.next_3005.next_3005.next_3005.next_3005= new NodeSLL_2511533005(10);
			System.out.print("Penelesuran SLL : ");
			traversal (head_3005);
			//data yang akan dicari
			int Key=30;
			System.out.print("cari data " +Key+ " = ");
			if (searchKey(head_3005, Key))
				System.out.println("Ketemu");
			else 
				System.out.println("Tidak ada");
		}
		
		}
		
	


