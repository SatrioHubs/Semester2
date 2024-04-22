package jobsheet3.praktikum2;

import java.util.Arrays;

public class dataMahasiswa {

    public String Nama, NIM;
    public char jenisKelamin;
    public float IPK;

    /**
     * dataMahasiswa
     */
    public dataMahasiswa(String nama, String nim, char jenisK, float ipk) {
    this.Nama = nama;
    this.NIM = nim;
    this.jenisKelamin = jenisK;
    this.IPK = ipk;
        
    }

    public dataMahasiswa(){

    }

    public float hitungRataIpk(float[] arrIPK, int arrLastIndexs){
        float[] arr = Arrays.copyOf(arrIPK, arrIPK.length);

        if (arrLastIndexs - 1 == 0) {
            arr[arrLastIndexs - 1] += arr[arrLastIndexs];
            return arr[arrLastIndexs - 1] / arr.length;
        } else{
            arr[arrLastIndexs - 1] += arr[arrLastIndexs];
            return hitungRataIpk(arrIPK, arrLastIndexs - 1);
        }

    }

    public int showIndexIpkTertinggi(float[] arrIPK){
        int IndexIpkterTinggi = 0;
        for (int i = 0; i < arrIPK.length; i++) {
            IndexIpkterTinggi = (arrIPK[IndexIpkterTinggi] > arrIPK[i]) ? IndexIpkterTinggi : i;
        }
        return IndexIpkterTinggi;
    }

}
