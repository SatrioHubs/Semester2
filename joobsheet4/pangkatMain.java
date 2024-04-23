package joobsheet4;
import java.util.Scanner;

public class pangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.print("Masukan Element Yang Dihitung: ");
        int element = sc.nextInt();

        pangkat[] png = new pangkat[element];
        // for (int i = 0; i < element; i++) {
        //     png[i] = new pangkat();
        //     System.out.println("Masukan Angka Yang Hendak Dipangkatkan: ");
        //     int nilai = sc.nextInt();
        //     png[i].nilai = nilai;
        //     System.out.println("Masukan Nilai Pemangkat: ");
        //     int pangkat = sc.nextInt();
        //     png[i].pangkat = pangkat;

        // modif pengisian atribut menggunakan konstruktor
        for (int i = 0; i < element; i++) {
            png[i] = new pangkat();
            System.out.print("Masukan Angka Yang Hendak Dipangkatkan: ");
            int nilai = sc.nextInt();
            png[i].nilai = nilai;
            System.out.print("Masukan Nilai Pemangkat: ");
            int pangkat = sc.nextInt();
            png[i].pangkat = pangkat;
            png[i] = new pangkat(nilai, pangkat);
        }
        

        System.out.println("Hasil - BRUTE FORCE");
        for (int i = 0; i < element; i++) {
            System.out.println("HAsil dari "
            + png[i].nilai + " Pangkat "
            + png[i].pangkat + " Adalah "
            + png[i].pangkatBF(png[i].nilai, png[i].pangkat)
            );
        }

        System.out.println("Hasil - DEVIDE AND CONQUER");
        for (int i = 0; i < element; i++) {
            System.out.println("HAsil dari "
            + png[i].nilai + " Pangkat "
            + png[i].pangkat + " Adalah "
            + png[i].pangkatDC(png[i].nilai, png[i].pangkat)
            );
        }
    }
}
