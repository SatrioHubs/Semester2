package Jobsheet2;

public class buku_25 {

    String judul, pengarang;
    int halaman, stock, harga;

    void tampilinformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stock: " + stock);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml){
        stock -= jml;
    }

    void restock(int jml){
        stock += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;  
    }
}
