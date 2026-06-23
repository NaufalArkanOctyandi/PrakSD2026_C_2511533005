package pekan2_2511533005;
import java.util.ArrayList;
import java.util.Scanner;
public class Playlist_2511533005 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        ArrayList<Musik_2511533005> playlist = new ArrayList<>();

	        int pilihan;

	        do {
	            System.out.println("\n=== Playlist Musik NIM:2511533005 === ");
	            System.out.println("1. Tambah Lagu");
	            System.out.println("2. Lihat Playlist");
	            System.out.println("3. Hapus Lagu");
	            System.out.println("4. Keluar");
	            System.out.print("Pilihan: ");
	            pilihan = input.nextInt();
	            input.nextLine();

	            switch (pilihan) {
	                case 1:
	                    System.out.print("Masukkan Judul: ");
	                    String judul = input.nextLine();

	                    System.out.print("Masukkan Penyanyi: ");
	                    String penyanyi = input.nextLine();

	                    System.out.print("Masukkan Durasi: ");
	                    int durasi = input.nextInt();
	                    input.nextLine(); 

	                    playlist.add(new Musik_2511533005(judul, penyanyi, durasi));
	                    System.out.println("Data berhasil ditambahkan!");
	                    break;

	                case 2:
	                    if (playlist.isEmpty()) {
	                        System.out.println("Playlist kosong!");
	                    } else {
	                        for (int i = 0; i < playlist.size(); i++) {
	                            Musik_2511533005 m = playlist.get(i);
	                            System.out.println((i + 1) + ". " + m.getJudul() +
	                                    " - " + m.getPenyanyi() +
	                                    " (" + m.getDurasi() + " detik)");
	                        }
	                    }
	                    break;

	                case 3:
	                	System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
	                	int index = input.nextInt();
	                	input.nextLine();
	                	index--;

	                    if (index >= 0 && index < playlist.size()) {
	                        playlist.remove(index);
	                        System.out.println("Lagu berhasil dihapus!");
	                    } else {
	                        System.out.println("Index tidak valid!");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Keluar dari program...");
	                    input.close();
	                    break;

	                default:
	                    System.out.println("Pilihan tidak tersedia!");
	            }

	        } while (pilihan != 4);
	    }
	}

