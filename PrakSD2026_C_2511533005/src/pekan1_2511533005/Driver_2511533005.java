package pekan1_2511533005;

public class Driver_2511533005 {
	    public static void main(String[] args) {

	        Mobil_2511533005 m1 = new Mobil_2511533005(
	            "Avanza", 2020, 1300, 150000000, "Toyota"
	        );

	        m1.tambahMobil();
	        m1.tampilMobil();

	        System.out.println("\nSetelah diubah:\n");

	        m1.setHarga(160000000);
	        m1.tampilMobil();

	        m1.hapusMobil();
	    }
	}


