import java.util.Scanner;
public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mahasiswa27 [] arrayofMahasiswa27 = new Mahasiswa27[3];
        String dummy;

    for(int i=0; i<3;i++){
         arrayofMahasiswa27[i]= new Mahasiswa27();
         System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
         System.out.println("NIM :");
         arrayofMahasiswa27[i].nim = sc.nextLine();
          System.out.println("Nama :");
         arrayofMahasiswa27[i].nama = sc.nextLine();
          System.out.println("Kelas :");
         arrayofMahasiswa27[i].kelas = sc.nextLine();
          System.out.println("IPK :");
          dummy = sc.nextLine();
         arrayofMahasiswa27[i].ipk = Float.parseFloat(dummy);
         System.out.println("---------------------------------");

    }
        /////////////////////////////////////////////////////
       for (int i = 0; i < 3; i++) {
        System.out.println("Data Mahasiswa ke-" +(i+1));
        arrayofMahasiswa27[i].cetakinfo();
        System.out.println("--------------------------");
           
       }
       
    }
}
