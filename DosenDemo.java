import java.util.Scanner;
public class DosenDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen[] arrayDosen = new Dosen[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nInput Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("L");

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
        }

        DataDosen data = new DataDosen();

        data.dataSemuaDosen(arrayDosen);
        data.jumlahDosenPerJenisKelamin(arrayDosen);
        data.rerataUsiaDosenPerJenisKelamin(arrayDosen);
        data.infoDosenPalingTua(arrayDosen);
        data.infoDosenPalingMuda(arrayDosen);

        sc.close();
    }
}