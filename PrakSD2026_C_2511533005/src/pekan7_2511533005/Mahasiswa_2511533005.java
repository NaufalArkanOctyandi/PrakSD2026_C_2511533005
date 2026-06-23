package pekan7_2511533005;

public class Mahasiswa_2511533005 {
	private String nama_3005;
	private String nim_3005;
	private String prodi_3005;

	public Mahasiswa_2511533005(String nama_3005, String nim_3005, String prodi_3005) {
		this.nama_3005 = nama_3005;
	    this.nim_3005 = nim_3005;
	    this.prodi_3005 = prodi_3005;
	    
	}
	public String getNama_3005() {
		return nama_3005;
	}
	public void setNama_3005(String nama_3005) {
        this.nama_3005 = nama_3005;
    }
    public String getNim_3005() {
        return nim_3005;
    }
    public void setNim_3005(String nim_3005) {
        this.nim_3005 = nim_3005;
    }
    public String getProdi_3005() {
        return prodi_3005;
    }
    public void setProdi_3005(String prodi_3005) {
        this.prodi_3005 = prodi_3005;
    }

    @Override
    public String toString() {
        return nama_3005 + " - " + nim_3005 + " - " + prodi_3005;
    }
}


