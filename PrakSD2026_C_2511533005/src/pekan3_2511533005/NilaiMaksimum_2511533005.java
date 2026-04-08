package pekan3_2511533005;
import java.util.Stack;
public class NilaiMaksimum_2511533005 {
	public static int max(Stack<Integer> s) {
		Stack<Integer> backup_3005 = new Stack<Integer> ();
		int maxValue = s.pop();
		backup_3005.push (maxValue);
		while (!s.isEmpty()) {
			int next= s.pop();
			backup_3005.push(next);
			maxValue = Math.max (maxValue, next);
		}
		while (!backup_3005.isEmpty()) {
			s.push (backup_3005.pop());
		}
		return maxValue;
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack <Integer>();
		s.push(70);
		s.push(12);
		s.push(20);
		System.out.println("isi stack " +s);
		System.out.println("Stack Teratas "+ s.peek());
		System.out.println("nilai maksimum "+ max(s));

	}

}
