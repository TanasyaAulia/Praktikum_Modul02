import Model.Mahasiswa;

public class Main {

    public static void main(String[]args){
        Mahasiswa m1 = new Mahasiswa("19631105","Tanasya","17-01-2001");
        m1.tampilkanAtribut();
        System.out.println(m1.getNama());
    }
}
