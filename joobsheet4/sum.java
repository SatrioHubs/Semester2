package joobsheet4;

public class sum {
    int element;
    double keuntungan[], total;

    sum(int element){
        this.element = element;
        this.keuntungan = new double[element];
        this.total = 0;
    }

    double totalBF(double arr[]){
        for (int i = 0; i < element; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        if (l == r ) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid]; 
        }
        return 0;
    }
}
