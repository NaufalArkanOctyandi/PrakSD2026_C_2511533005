package pekan1_2511533005;

public class Mobil_2511533005 {
	    private String nama;
	    private int tahun;
	    private int cc;
	    private double harga;
	    private String merk;

	    public Mobil_2511533005(String nama, int tahun, int cc, double harga, String merk) {
	        this.nama = nama;
	        this.tahun = tahun;
	        this.cc = cc;
	        this.harga = harga;
	        this.merk = merk;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    public void setTahun(int tahun) {
	        this.tahun = tahun;
	    }

	    public void setCc(int cc) {
	        this.cc = cc;
	    }

	    public void setHarga(double harga) {
	        this.harga = harga;
	    }

	    public void setMerk(String merk) {
	        this.merk = merk;
	    }

	    // Selector (getter)
	    public String getNama() {
	        return nama;
	    }

	    public int getTahun() {
	        return tahun;
	    }

	    public int getCc() {
	        return cc;
	    }

	    public double getHarga() {
	        return harga;
	    }

	    public String getMerk() {
	        return merk;
	    }

	    public void tambahMobil() {
	        System.out.println("Mobil berhasil ditambahkan");
	    }

	    public void hapusMobil() {
	        System.out.println("Mobil berhasil dihapus");
	    }

	    public void tampilMobil() {
	        System.out.println("Nama  : " + nama);
	        System.out.println("Tahun : " + tahun);
	        System.out.println("CC    : " + cc);
	        System.out.println("Harga : " + harga);
	        System.out.println("Merk  : " + merk);
	    }
	}


