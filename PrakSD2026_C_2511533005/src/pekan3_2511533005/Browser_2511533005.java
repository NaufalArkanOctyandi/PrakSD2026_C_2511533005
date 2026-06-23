package pekan3_2511533005;
import java.util.Scanner;
import java.util.Stack;
public class Browser_2511533005 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    Stack<Website_2511533005> history = new Stack<>();

	    int pilihan;

	    do {
	        System.out.println("\n=== Browser History NIM: 2511533005 ===");
	        System.out.println("1. Kunjungi Website (Push)");
	        System.out.println("2. Tombol Back (Pop)");
	        System.out.println("3. Lihat Halaman Aktif (Peek)");
	        System.out.println("4. Keluar");
	        System.out.print("Pilihan: ");

	        pilihan = Integer.parseInt(input.nextLine());

	        switch (pilihan) {
	        case 1:
	        	
	            System.out.print("Masukkan Judul: ");
	            String judul = input.nextLine();

	            System.out.print("Masukkan URL: ");
	            String url = input.nextLine();

	            history.push(new Website_2511533005(judul, url));
	            System.out.println("Berhasil mengunjungi halaman!");
	            break;

	        case 2:
	            if (!history.isEmpty()) {
	            Website_2511533005 hapus = history.pop();
	            System.out.println("Kembali dari: " + hapus.getJudul());
	          } else {
	              System.out.println("History kosong!");
	             }
	            break;

	        case 3:	
	            if (!history.isEmpty()) {
	                Website_2511533005 atas = history.peek();
	                System.out.println("Halaman aktif:");
	                System.out.println("Judul: " + atas.getJudul());
	                System.out.println("URL: " + atas.getUrl());
	             } else {
	                 System.out.println("Tidak ada halaman aktif!");
	               }
	            break;

	        case 4:
	            System.out.println("Keluar dari program...");
	            input.close();
	            break;
	            
	            default:	
	                System.out.println("Pilihan tidak valid!");
	           }

	       } while (pilihan != 4);
	   }
}


