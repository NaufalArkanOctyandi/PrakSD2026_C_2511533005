package pekan4_2511533005;

public class QueueArray_2511533005 {
	int front_3005, rear_3005, size_3005;
	int capacity_3005;
	int array[];
	
	public QueueArray_2511533005(int capacity_3005) {
		this.capacity_3005= capacity_3005;
		front_3005= this.size_3005=0;
		rear_3005=capacity_3005-1;
		array = new int[this.capacity_3005];
		}

	boolean isFull(QueueArray_2511533005 queue) {
		return (queue.size_3005==queue.capacity_3005);
	}
	
	boolean isEmpty(QueueArray_2511533005 queue) {
		return (queue.size_3005==0);
	}
	
	void enqueue_3005(int item) {
		if (isFull(this))
			return;
		this.rear_3005= (this.rear_3005+1) % this.capacity_3005;
		this.array[this.rear_3005] = item;
		this.size_3005= this.size_3005+1;
		System.out.println(item + " enqueued to Queue");
	}
	
	int dequeue_3005() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		int item= this.array[this.front_3005];
		this.front_3005 = (this.front_3005+1) % this.capacity_3005;
		return item;
	}
	int front_3005() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array[this.front_3005];
	}
	int rear_3005() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array[this.rear_3005];
	}
		//mencetak elemen antrian
	void display_3005() {
		int i;
		if (front_3005==rear_3005) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		// kunjungi dari belakang dan cetak
		for(i= front_3005; i<rear_3005; i++) {
			System.out.printf("%d<-- ", array[i]);
		}
		return;
	}
 }
