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
        if (stock == 0) {
            System.out.println("Stock Habis");
        } else if (stock < jml) {
            System.out.println("Stock Tidak Tersedia");
        } else{
            stock -= jml;
        }
    }

    void restock(int jml){
        stock += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;  
    }

    public buku_25(String jud, String pg, int hal, int stok, int har) {
        this.judul = jud;
        this.pengarang = pg;
        this.halaman = hal;
        this.stock = stok;
        this.harga = har;
    }

    public buku_25() {
    }
    
}
