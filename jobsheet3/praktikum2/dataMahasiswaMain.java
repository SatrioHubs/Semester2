package jobsheet3.praktikum2;
import java.util.Scanner;

public class dataMahasiswaMain {
    public static void main(String[] args) {
        
        String nama, nim;         
        char jenisKelamin;        
        float ipk;                 
        int jumlahDataMhsw;        
        dataMahasiswa[] dataMhsw;  
        float[] ipkMhsw;           
        int IndexIpkterTinggi;      

        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukan Jumlah Mahasiswa Yang Ingin Di-input: ");
        jumlahDataMhsw = sc.nextInt();

        sc.nextLine(); // ! prevent Scanner bug
            System.out.println();


        dataMhsw = new dataMahasiswa[jumlahDataMhsw];
        ipkMhsw = new float[jumlahDataMhsw];

        for (int i = 0; i < ipkMhsw.length; i++) {
            System.out.printf("MAsukan Data Mahasiswa ke-%d\n", i+1);
            System.out.print("Masukan Nama : ");
            nama = sc.nextLine();
            System.out.print("Masukan NIM : ");
            nim = sc.nextLine();
            System.out.printf("Masukan Jenis Kelamin : ");
            jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukan IPK : ");
            ipk = sc.nextFloat();

            sc.nextLine(); // ! prevent Scanner bug
            System.out.println();


            dataMhsw[i] = new dataMahasiswa(nama, nim, jenisKelamin, ipk);
            ipkMhsw[i] = ipk;
        }

        for (int i = 0; i < dataMhsw.length; i++) {
            System.out.printf("\nData Mahasiswa ke-%d\n", i+1);
            System.out.printf("nama : %s\n", dataMhsw[i].Nama);
            System.out.printf("nim : %s\n", dataMhsw[i].NIM);
            System.out.printf("Jenis kelamin: %s\n", dataMhsw[i].jenisKelamin);
            System.out.printf("Nilai IPK: %.1f\n", dataMhsw[i].IPK);
        }

        dataMahasiswa data = new dataMahasiswa();
        System.out.printf("\nRata-rata IPK mahasiswa: %.2f\n", data.hitungRataIpk(ipkMhsw, ipkMhsw.length - 1));

        IndexIpkterTinggi = data.showIndexIpkTertinggi(ipkMhsw); // cari dan simpan index mhs ipk tertinggi

        System.out.println("\nMahasiswa dengan ipk terbesar diraih oleh data:");
        System.out.printf("nama : %s\n", dataMhsw[IndexIpkterTinggi].Nama);
        System.out.printf("nim : %s\n", dataMhsw[IndexIpkterTinggi].NIM);
        System.out.printf("Jenis kelamin: %s\n", dataMhsw[IndexIpkterTinggi].jenisKelamin);
        System.out.printf("Nilai IPK: %.1f\n", dataMhsw[IndexIpkterTinggi].IPK);

        System.out.printf("\n----------- CONGRATULATION %s! -----------", dataMhsw[IndexIpkterTinggi].Nama);
    }
}
