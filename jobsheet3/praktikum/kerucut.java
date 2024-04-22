package jobsheet3.praktikum;

public class kerucut {
    double jariJari,        
           sisiMiring,    
           tinggiKerucut; 
    
    public kerucut(double jari, double sisiMiring) {
        jariJari = jari;
        this.sisiMiring = sisiMiring;
    }

    public double luasPermukaan(){
        
        return (22.0 / 7.0 * jariJari * (jariJari + sisiMiring));
    }

    public double volume(){
        
        tinggiKerucut = Math.sqrt((sisiMiring*sisiMiring) - (jariJari*jariJari));
         
        return 22.0 / 7.0 * jariJari * jariJari * tinggiKerucut / 3.0;
    }
}
