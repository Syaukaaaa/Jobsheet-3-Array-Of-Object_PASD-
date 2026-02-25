public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Mahasiswa27 [] arrayofMahasiswa27 = new Mahasiswa27[3];
        arrayofMahasiswa27[0]= new Mahasiswa27();
        arrayofMahasiswa27[0].nim= "278762873";
        arrayofMahasiswa27[0].nama = "AGNES TITANIA KINANTI";
        arrayofMahasiswa27[0].kelas = "SIB 1E";
        arrayofMahasiswa27[0].ipk = (float) 3.7;

        arrayofMahasiswa27[1] = new Mahasiswa27();
        arrayofMahasiswa27[1].nim = "252652567";
        arrayofMahasiswa27[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa27[1].kelas = "TI 2A";
        arrayofMahasiswa27[1].ipk = (float) 3.26;

        arrayofMahasiswa27[2] = new Mahasiswa27();
        arrayofMahasiswa27[2].nim = "287236723";
        arrayofMahasiswa27[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayofMahasiswa27[2].kelas = "TI 2E";
        arrayofMahasiswa27[2].ipk = (float) 3.70;
        /////////////////////////////////////////////////////
        System.out.println("NIM       : " + arrayofMahasiswa27[0].nim);
        System.out.println("Nama      : " + arrayofMahasiswa27[0].nama);
        System.out.println("Kelas     : " + arrayofMahasiswa27[0].kelas);
        System.out.println("IPK       : " + arrayofMahasiswa27[0].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM       : " + arrayofMahasiswa27[1].nim);
        System.out.println("Nama      : " + arrayofMahasiswa27[1].nama);
        System.out.println("Kelas     : " + arrayofMahasiswa27[1].kelas);
        System.out.println("IPK       : " + arrayofMahasiswa27[1].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM       : " + arrayofMahasiswa27[2].nim);
        System.out.println("Nama      : " + arrayofMahasiswa27[2].nama);
        System.out.println("Kelas     : " + arrayofMahasiswa27[2].kelas);
        System.out.println("IPK       : " + arrayofMahasiswa27[2].ipk);
        System.out.println("-----------------------------------------");
    }
}
