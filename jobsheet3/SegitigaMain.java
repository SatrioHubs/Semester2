package jobsheet3;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga[] stArray = new Segitiga[4];
        int [][] data = {
            {10,4},
            {20,10},
            {15,6},
            {25,10}
        };
        for (int i = 0; i < data.length; i++) {
            stArray[i] = new Segitiga(data[i][0], data[i][1]);
            stArray[i].pythagoras();
            System.out.println("Segitiga ke-"+(i+1)); 
            System.out.println("Luas :"+ stArray[i].hitungLuas() + "\nKeliling :"+ stArray[i].hitungKeliling());
        }
    }
}
