package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[]args) {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19631105";
        mahasiswa.nama = "Tanasya";
        try {
            mahasiswa.tanggalLahir = sdf.parse("17-01-2001");
            mahasiswa.tampilkanAtribut();
        } catch (ParseException e) {
            e.printStackTrace();
            System.err.println("Format tanggal tidak sesuai");
        }
    }
}
