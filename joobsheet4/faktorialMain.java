package joobsheet4;
import java.util.Scanner;

public class faktorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.print("Masukan Jumlah Element : ");
        int Jmlh = sc.nextInt();

        faktorial[] fk = new faktorial[10];
        for (int i = 0; i < Jmlh; i++) {
            fk[i] = new faktorial();
            System.out.print("Masukan Nilai Data Ke-" + (i+1) +": ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("Hasil - BRUTE FORCE");
        for (int i = 0; i < Jmlh; i++) {
            System.out.println("Hasil Penghitungan Faktorial Menggunakan Brute Force adalah: " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("Hasil - DEVIDE AND CONQUER");
        for (int i = 0; i < Jmlh; i++) {
            System.out.println("Hasil Perhitunggan Faktorial Menggunakan Devide and Conquer: "+ fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
