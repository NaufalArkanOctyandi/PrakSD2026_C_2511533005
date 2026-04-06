package pekan2_2511533005;
import java.util.ArrayList;
public class DaftarKata_2511533005 {
	private final ArrayList<String> data;
	// Konstruksi: inisialisasi list kosong
	public DaftarKata_2511533005() {
		this.data = new ArrayList<>();
	}
	/** Menambahkan elemen di akhir list. */
	public void tambah_2511533005(String elemen) {
		data.add(elemen);
	}
	/** Menambahkan elemen pada indeks tertentu (menyisipkan). */
	public void tambahPada_2511533005(int index, String elemen) {
		data.add(index, elemen);
	}
	/**
	 * Mengubah elemen pada posisi 'index' menjadi 'nilaiBaru'. 
	 * Bertindak sebagai "Setter" untul elemen tertentu.
	 */
	public void ubahElement_2511533005(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
	}
	/**
	 * Menghapus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus.
	 */
	public String hapusElement(int index) {
		return data.remove(index);
	}
	/**
	 * Melakukan iterasi dan mencetak setiap elemen dalam format: [index] nilai
	 * (Metode ini tidak mengembalikan nilai; hanya demonstrasi iterasi). 
	 */
	public void iterasiCetak() {
		for(int i=0; i < data.size(); i++) {
			System.out.print(data.get(i)+ " ");
		}
	}
	
	/** Mengambil elemen berdasarkan indeks.*/
	public String get(int index) {
		return data.get(index);
	}
	
	
	// Representasi String agar mudah dicetak
	@Override
	public String toString() {
		return data.toString();
	}

}
