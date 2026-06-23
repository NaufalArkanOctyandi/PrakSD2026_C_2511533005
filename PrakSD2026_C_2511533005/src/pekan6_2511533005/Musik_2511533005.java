package pekan6_2511533005;

import java.util.Scanner;

public class Musik_2511533005 {

    static Lagu_2511533005 head_3005 = null;
    static Lagu_2511533005 tail_3005 = null;

    // INSERT
    static void tambahLagu_3005(String judul, String penyanyi) {

        Lagu_2511533005 newNode_3005 =
                new Lagu_2511533005(judul, penyanyi);

        if (head_3005 == null) {

            head_3005 = newNode_3005;
            tail_3005 = newNode_3005;

        } else {

            tail_3005.next_3005 = newNode_3005;
            newNode_3005.prev_3005 = tail_3005;

            tail_3005 = newNode_3005;
        }

        System.out.println("Lagu berhasil ditambahkan!");
    }

    // DELETE HEAD
    static void hapusLaguAwal_3005() {

        if (head_3005 == null) {

            System.out.println("Playlist kosong!");
            return;
        }

        System.out.println("Lagu \"" +
                head_3005.judul_3005 +
                "\" berhasil dihapus.");

        if (head_3005 == tail_3005) {

            head_3005 = null;
            tail_3005 = null;

        } else {

            head_3005 = head_3005.next_3005;
            head_3005.prev_3005 = null;
        }
    }

    // DISPLAY MAJU
    static void tampilMaju_3005() {

        if (head_3005 == null) {

            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511533005 temp_3005 = head_3005;

        System.out.println("\n=== Playlist Maju ===");

        while (temp_3005 != null) {

            System.out.println(
                    temp_3005.judul_3005 +
                    " - " +
                    temp_3005.penyanyi_3005
            );

            temp_3005 = temp_3005.next_3005;
        }
    }

    // DISPLAY MUNDUR
    static void tampilMundur_3005() {

        if (tail_3005 == null) {

            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511533005 temp_3005 = tail_3005;

        System.out.println("\n=== Playlist Mundur ===");

        while (temp_3005 != null) {

            System.out.println(
                    temp_3005.judul_3005 +
                    " - " +
                    temp_3005.penyanyi_3005
            );

            temp_3005 = temp_3005.prev_3005;
        }
    }

    // SEARCH
    static void cariLagu_3005(String judul) {

        if (head_3005 == null) {

            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511533005 temp_3005 = head_3005;

        while (temp_3005 != null) {

            if (temp_3005.judul_3005.equalsIgnoreCase(judul)) {

                System.out.println("\nLagu ditemukan!");
                System.out.println("Judul    : " +
                        temp_3005.judul_3005);

                System.out.println("Penyanyi : " +
                        temp_3005.penyanyi_3005);

                return;
            }

            temp_3005 = temp_3005.next_3005;
        }

        System.out.println("Lagu tidak ditemukan!");
    }

    public static void main(String[] args) {

        Scanner input_3005 = new Scanner(System.in);

        int pilihan_3005;

        do {

            System.out.println("\n=== Playlist Musik NIM: 2511533005 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            pilihan_3005 = input_3005.nextInt();
            input_3005.nextLine();

            switch (pilihan_3005) {

                case 1:

                    System.out.print("Masukkan Judul Lagu : ");
                    String judul_3005 = input_3005.nextLine();

                    System.out.print("Masukkan Penyanyi   : ");
                    String penyanyi_3005 = input_3005.nextLine();

                    tambahLagu_3005(
                            judul_3005,
                            penyanyi_3005
                    );

                    break;

                case 2:

                    hapusLaguAwal_3005();

                    break;

                case 3:

                    tampilMaju_3005();

                    break;

                case 4:

                    tampilMundur_3005();

                    break;

                case 5:

                    System.out.print("Masukkan judul lagu: ");
                    String cari_3005 = input_3005.nextLine();

                    cariLagu_3005(cari_3005);

                    break;

                case 6:

                    System.out.println("Program selesai.");
                    break;

                default:

                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_3005 != 6);
    }
}