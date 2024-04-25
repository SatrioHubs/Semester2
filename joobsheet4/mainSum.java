package joobsheet4;
import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================================================");
        System.out.print("Masukan Jumlah Perusahaan Yang Akan Dihitung = ");
        int jumlahPerusahaan = sc.nextInt();
        sum[] sm = new sum[jumlahPerusahaan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("================================================================");
            System.out.println("Perusahaan ke-" + (i+1));
            System.out.print("Masukan Jumlah Bulan: ");
            int element = sc.nextInt();

            sm[i] = new sum(element);
            System.out.println("================================================================");
            for (int j = 0; j < sm[i].element; j++) {
            System.out.print("Masukan Untung Bulan Ke - " + (j+1) +" = ");
            sm[i].keuntungan[j] = sc.nextDouble();

            }
        

        System.out.println("================================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total Keuntungan Perusahaan Selama " + sm[i].element + " Bulan Adalah = "+ sm[i].totalBF(sm[i].keuntungan));
        System.out.println("================================================================");
        System.out.println("Algoritma Devide And Conquer");
        System.out.println("Total Keuntungan Perusahaan Selama " + sm[i].element + " Bulan Adalahh =  "+ sm[i].totalDC(sm[i].keuntungan, 0, sm[i].element-1));

      }  
    }
}
