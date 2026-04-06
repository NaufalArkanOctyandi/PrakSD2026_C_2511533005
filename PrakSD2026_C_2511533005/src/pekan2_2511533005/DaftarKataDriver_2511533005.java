package pekan2_2511533005;

public class DaftarKataDriver_2511533005 {

	public static void main(String[] args) {
	DaftarKata_2511533005 al = new DaftarKata_2511533005();
	
	// Menambah elemen (akhir)
	al.tambah_2511533005("Kami");
	al.tambah_2511533005("Informatika");
	
	// Menyisipkan elemen pada indeks 1
	al.tambahPada_2511533005(1, "Mahasiswa");
	
	// Cetak isi awal
	System.out.println("Awal    : " + al);
	
	//Mengubah elemen (index 1)
	al.ubahElement_2511533005(1, "Departmen");
	System.out.println("Setelah Ubah: " + al);
	
	//Menghapus elemen (hapus index 0)
	String terhapus = al.hapusElement(0);
	System.out.println("Terhapus  :" + terhapus);
	System.out.println("Ssetelah Hapus: " + al);
	
	// Iterasi pada ArrayList (cetak setiap elemen)
	System.out.print("Iterasi:");
	al.iterasiCetak();
	System.out.println();
	}

}
