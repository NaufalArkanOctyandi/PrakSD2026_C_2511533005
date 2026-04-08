package pekan3_2511533005;

public class stackArrayDriver_2511533005 {

	public static void main(String[] args) {
		stackArray_2511533005 s = new stackArray_2511533005();
		s.push_3005(10);
		s.push_3005(20);
		s.push_3005(30);
		System.out.println(s.pop_3005() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah:" + s.peek_3005());
		System.out.println("Elemen pada stack:");
		s.print_3005();
	}
}
