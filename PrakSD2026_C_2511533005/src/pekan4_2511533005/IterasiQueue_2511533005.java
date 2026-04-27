package pekan4_2511533005;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class IterasiQueue_2511533005 {
	public static void main(String[] args) {
		{
			Queue<String> q_3005= new LinkedList<>();
			
			q_3005.add("Praktikum");
			q_3005.add("Struktur");
			q_3005.add("Data");
			q_3005.add("Dan");
			q_3005.add("Algoritma");
			Iterator<String> iterator = q_3005.iterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
		}

	}

}
