public class DataDosen {

    // a. Tampilkan semua dosen
    public void dataSemuaDosen(Dosen[] arrayOfDosen) {
        System.out.println("=== DATA SEMUA DOSEN ===");
        for (Dosen d : arrayOfDosen) {
            d.tampilInfo();
        }
    }

    // b. Jumlah dosen per jenis kelamin
    public void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Laki-laki : " + pria);
        System.out.println("Jumlah Dosen Perempuan : " + wanita);
    }

    // c. Rata-rata usia per jenis kelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jumlahPria++;
            } else {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Laki-laki : " +
                (jumlahPria > 0 ? (totalPria / jumlahPria) : 0));

        System.out.println("Rata-rata Usia Dosen Perempuan : " +
                (jumlahWanita > 0 ? (totalWanita / jumlahWanita) : 0));
    }

    // d. Dosen paling tua
    public void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        Dosen tertua = arrayOfDosen[0];

        for (Dosen d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\n=== DOSEN PALING TUA ===");
        tertua.tampilInfo();
    }

    // e. Dosen paling muda
    public void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        Dosen termuda = arrayOfDosen[0];

        for (Dosen d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\n=== DOSEN PALING MUDA ===");
        termuda.tampilInfo();
    }
}