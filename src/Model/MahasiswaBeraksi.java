package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[]args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(polaTanggal);

        //instance - pembuatan object
        Mahasiswa mahasiswa = new Mahasiswa("19631105","Tanasya","17-01-2001");
        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa("19635001","Aulia","07-07-2007");
        mahasiswa2.tampilkanAtribut();
        mahasiswa2.menyapa();
        System.out.println("Usiaku : " + mahasiswa2.hitungUsia() + " tahun");
        }
    }
