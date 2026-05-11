package pekan6_2511533005;

public class NodeDLL_2511533005 {
	// mendefinisikan kelas node
	int data_3005; // data
	NodeDLL_2511533005 next_3005; // Pointer ke next node
	NodeDLL_2511533005 prev_3005; // Pointer ke previous node
	
	// konstruktor 
	public NodeDLL_2511533005(int data) {
		this.data_3005 = data;
		this.next_3005 = null;
		this.prev_3005 = null;
	}
}