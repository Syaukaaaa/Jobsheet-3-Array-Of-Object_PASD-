public class Dosen {
     String kode;
    String nama;
    Boolean jenisKelamin; // true = Laki-laki, false = Perempuan
    int usia;

    // Constructor
    public Dosen(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan info
    public void tampilInfo() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + 
            (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + usia);
        System.out.println("--------------------------------------");
    }
}
