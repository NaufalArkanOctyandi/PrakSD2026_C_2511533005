package pekan3_2511533005;

public class stackArray_2511533005 {
	static final int MAX_3005=1000;
	int top;
	int a[] = new int[MAX_3005];
	boolean isEmpty_3005()
	{
		return (top <0);
	}
	stackArray_2511533005()
	{
		top=-1;
	}
	boolean push_3005(int x)
	{
		if (top >= (MAX_3005 -1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x + " Dimasukkan dalam stack");
			return true;
		}
	}
	int pop_3005()
	{
		if (top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	int peek_3005()
	{
		if (top <0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	void print_3005 () {
		for(int i = top; i >-1; i--) {
			System.out.print(" " + a[i]);
		}
	}
}
