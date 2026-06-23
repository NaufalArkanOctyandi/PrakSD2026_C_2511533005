package pekan5_2511533005;

import java.util.Scanner;

public class RumahSakit_2511533005 {
    static Pasien_2511533005 head_3005 = null;
    static int counter_3005 = 0;

    // INSERT 
    static void daftarPasien_3005(String nama, String keluhan) {
        counter_3005++;
        Pasien_2511533005 newNode_3005 =
                new Pasien_2511533005(nama, keluhan, counter_3005);

        if (head_3005 == null) {
            head_3005 = newNode_3005;
        } else {
            Pasien_2511533005 temp_3005 = head_3005;
            while (temp_3005.next_3005 != null) {
                temp_3005 = temp_3005.next_3005;
            }
            temp_3005.next_3005 = newNode_3005;
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_3005);
    }

    // DELETE HEAD
    static void panggilPasien_3005() {
        if (head_3005 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Memanggil Pasien: " + head_3005.namaPasien_3005 +
                " | Keluhan: " + head_3005.penyakit_3005);

        head_3005 = head_3005.next_3005;
    }

    // DISPLAY
    static void tampilkanAntrian_3005() {
        if (head_3005 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pasien_2511533005 temp_3005 = head_3005;
        System.out.println("Daftar Antrian Pasien:");
        while (temp_3005 != null) {
            System.out.println(temp_3005.nomorAntrian_3005 + ". " +
                    temp_3005.namaPasien_3005 + " (" +
                    temp_3005.penyakit_3005 + ")");
            temp_3005 = temp_3005.next_3005;
        }
    }

    // SEARCH
    static void cariPasien_3005(String nama) {
        Pasien_2511533005 temp_3005 = head_3005;

        while (temp_3005 != null) {
            if (temp_3005.namaPasien_3005.equalsIgnoreCase(nama)) {
                System.out.println("Pasien ditemukan! Nomor Antrian: " +
                        temp_3005.nomorAntrian_3005);
                return;
            }
            temp_3005 = temp_3005.next_3005;
        }

        System.out.println("Pasien tidak ditemukan!");
    }

    // STATUS
    static void statusAntrian_3005() {
        if (head_3005 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        int jumlah_3005 = 0;
        Pasien_2511533005 temp_3005 = head_3005;

        while (temp_3005 != null) {
            jumlah_3005++;
            temp_3005 = temp_3005.next_3005;
        }

        System.out.println("Jumlah pasien: " + jumlah_3005);
        System.out.println("Pasien terdepan: " + head_3005.namaPasien_3005);
    }

    public static void main(String[] args) {
        Scanner input_3005 = new Scanner(System.in);
        int pilihan_3005;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533005 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3005 = input_3005.nextInt();
            input_3005.nextLine();

            switch (pilihan_3005) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_3005 = input_3005.nextLine();
                    System.out.print("Masukkan Keluhan     : ");
                    String keluhan_3005 = input_3005.nextLine();
                    daftarPasien_3005(nama_3005, keluhan_3005);
                    break;

                case 2:
                    panggilPasien_3005();
                    break;

                case 3:
                    tampilkanAntrian_3005();
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari_3005 = input_3005.nextLine();
                    cariPasien_3005(cari_3005);
                    break;

                case 5:
                    statusAntrian_3005();
                    break;

                case 6:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_3005 != 6);
    }
}