import java.util.Scanner;
public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mata kuliah: ");
    int jumlah = sc.nextInt();
    sc.nextLine();
    MataKuliah[] arrayOfMatakuliah = new MataKuliah[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

       for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------------------");

            arrayOfMatakuliah[i] = new MataKuliah(kode, nama, sks, jumlahJam);
        }
        for(int i = 0; i < jumlah; i++){
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            System.out.println("Kode :" + arrayOfMatakuliah[i].kode);
            System.out.println("Nama :" + arrayOfMatakuliah[i].nama);
            System.out.println("SKS :" + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam :" + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("-----------------------------------------------");
        }
    }
}
