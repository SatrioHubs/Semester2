package Jobsheet2;

public class bukuMain_25 {
    public static void main(String[] args) {
        buku_25 bk1 = new buku_25();
        bk1.judul = "Todays Ends Tommorow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stock = 13;
        bk1.harga = 71000;
        
        bk1.tampilinformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilinformasi();

        buku_25 satrio = new buku_25("Self Reward", "Maheera Ayesha", 160, 29, 75000);
        satrio.terjual(4);
        satrio.tampilinformasi();
        satrio.hargaTotal = satrio.hitungHargaTotal(satrio.jum);
        satrio.totalDiskon = satrio.hitungDiskon();
        System.out.println(satrio.hitungHargaBayar());
        
    }
}
