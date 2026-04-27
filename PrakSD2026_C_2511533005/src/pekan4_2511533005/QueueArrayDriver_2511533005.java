package pekan4_2511533005;

public class QueueArrayDriver_2511533005 {

	public static void main(String[] args) {
		QueueArray_2511533005 queue= new QueueArray_2511533005(1000);
		queue.enqueue_3005(10);
		queue.enqueue_3005(20);
		queue.enqueue_3005(30);
		queue.enqueue_3005(40);
		System.out.println("Item di depan "+ queue.front_3005);
		System.out.println("item paling belakang " + queue.rear_3005());
		System.out.println("tampilan queue");
		queue.display_3005();
		System.out.println();
		System.out.println(queue.dequeue_3005() + " dihapus dari queue ");
		System.out.println("item didepan: " +queue.front_3005());
		System.out.println("item dibelakang: " +queue.rear_3005());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue.display_3005();
	}

}
