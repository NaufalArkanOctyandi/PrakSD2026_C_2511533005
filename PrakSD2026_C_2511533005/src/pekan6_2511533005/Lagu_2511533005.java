package pekan6_2511533005;

public class Lagu_2511533005 {

    String judul_3005;
    String penyanyi_3005;
    Lagu_2511533005 next_3005;
    Lagu_2511533005 prev_3005;

    public Lagu_2511533005(String judul, String penyanyi) {

        this.judul_3005 = judul;
        this.penyanyi_3005 = penyanyi;
        this.next_3005 = null;
        this.prev_3005 = null;
    }
}