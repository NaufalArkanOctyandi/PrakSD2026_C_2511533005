package pekan4_2511533005;

public class Queue_2511533005 {
    int front, rear, max;
    String queue[];

    public Queue_2511533005(int max) {
        this.max = max;
        queue = new String[max];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        return (rear == max - 1);
    }

    void enqueue(String data) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty()) front = 0;
            rear++;
            queue[rear] = data;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue[front] + " telah dilayani");
            front++;
            if (front > rear) front = rear = -1;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            for (int i = front; i <= rear; i++) {
                System.out.println((i - front + 1) + ". " + queue[i]);
            }
        }
    }

    void reverse() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            for (int i = front, j = rear; i < j; i++, j--) {
                String temp = queue[i];
                queue[i] = queue[j];
                queue[j] = temp;
            }
            System.out.println("Antrian berhasil dibalik");
        }
    }
}