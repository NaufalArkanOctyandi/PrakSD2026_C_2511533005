package pekan4_2511533005;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseData_2511533005 {
	public static void main(String[] args) {
		Queue<Integer> q_3005= new LinkedList<Integer>();
		q_3005.add(1);
		q_3005.add(2);
		q_3005.add(3);
		System.out.println("Sebelum reverse " + q_3005);
		Stack<Integer> s_3005 = new Stack<Integer>();
		while (!q_3005.isEmpty()) { // Q->S
			s_3005.push(q_3005.remove());
		}
		while (!s_3005.isEmpty()) { // S->Q
			q_3005.add(s_3005.pop());
		}
		System.out.println("Sesudah reverse = " +q_3005); //[3, 2, 1]
	}

}
