package pekan3_2511533005;
import java.util.ArrayList;
class Siswa_2511533005 {
	String nama_3005;
	int nim_3005;
	
	public Siswa_2511533005(String nama_3005, int nim_3005) {
		this.nama_3005= nama_3005;
		this.nim_3005= nim_3005;
	}
	
	@Override
	public String toString() {
		return "Nim:" + nim_3005 + ", Nama: "+ nama_3005;
	}

}
public class SiswaStack_2511533005 {
	private ArrayList<Siswa_2511533005> stack;
	
	public SiswaStack_2511533005() {
		stack= new ArrayList<> ();
	}
	
	public void push(Siswa_2511533005 mhs) {
		stack.add(mhs);
	}

public Siswa_2511533005 pop() {
	if (!isEmpty()) {
		return stack.remove (stack.size() -1);
	}
	return null;
}

public Siswa_2511533005 peek() {
	if (!isEmpty()) {
		return stack.get(stack.size() -1);
	}
	return null;
}

public boolean isEmpty() {
	return stack.isEmpty();
}
public void tampilkanSiswa() {
	for (int i = stack.size() - 1; i >= 0; i--) {
		System.out.println(stack.get(i));
	}
}
public static void main(String[] args) {
	SiswaStack_2511533005 studentStack = new SiswaStack_2511533005();
	
	Siswa_2511533005 mhs1 = new Siswa_2511533005 ("Ali", 1);
	Siswa_2511533005 mhs2 = new Siswa_2511533005 ("Bobby", 2);
	Siswa_2511533005 mhs3 = new Siswa_2511533005 ("Charles", 3);
	
	studentStack.push(mhs1);
	studentStack.push(mhs2);
	studentStack.push(mhs3);
	
	System.out.println("Siswa didalam Stack: ");
	studentStack.tampilkanSiswa();
	
	System.out.println("siswa teratas " + studentStack.peek());
	System.out.println("mengeluiarkan siswa teratas dari stack: " + studentStack.pop());
	System.out.println("daftar siswa setelah di pop: ");
	studentStack.tampilkanSiswa();
}
}