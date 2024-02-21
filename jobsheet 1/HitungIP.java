import java.util.Scanner;

public class HitungIP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sks = {2, 2, 3, 2, 2, 2, 3, 2 };
        String[][] array = {
            {"Keselamatan dan Kesehatan kerja", "", "", ""},
            {"Pancasila", "", "", ""},
            {"Matematika Dasar", "", "", ""},
            {"Bahasa Inggris", "", "", ""},
            {"Critical Thinking dan Problem Solving", "", "", ""},
            {"Dasar Pemograman", "", "", ""},
            {"Pratikum Dasar Pemograman", "", "", ""},
            {"Konsep Teknologi Informasi", "", "", ""},
        };

        System.out.println("-------------------");
        System.out.println("Hitung IP anda");
        System.out.println("-------------------");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Masukan Nilai Mata Kuliah" + array[i][0] + ": ");
            array[i][1] = sc.nextLine();

            if (Integer.parseInt(array[i][1]) < 0 || Integer.parseInt(array[i][1]) > 100) {
                System.out.println("Nilai tidak Valid");
                --i;
                continue;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i][1]) > 80) {
                array[i][2] = "A";
                array[i][3] = "4.00";
            } else if (Integer.parseInt(array[i][1]) > 73) {
                array[i][2] = "B+";
                array[i][3] = "3.5";
            } else if (Integer.parseInt(array[i][1]) > 65) {
                array[i][2] = "B";
                array[i][3] = "3.00";
            } else if (Integer.parseInt(array[i][1]) > 60) {
                array[i][2] = "C+";
                array[i][3] = "2.5";
            } else if (Integer.parseInt(array[i][1]) > 50) {
                array[i][2] = "C";
                array[i][3] = "2.00";
            } else if (Integer.parseInt(array[i][1]) > 39) {
                array[i][2] = "D";
                array[i][3] = "1.00";
            } else {
                array[i][2] = "E";
                array[i][3] = "0.00";
            }
        }
        System.out.println("----------------------");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("----------------------");
        System.out.println("Mata Kuliah                     Nilai Angka         Nilai Huruf          Bobot Nilai");

        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array.length; j++) {
                
            }
        }

    }
}