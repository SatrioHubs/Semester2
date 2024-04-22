package jobsheet3.praktikum;

public class limasSegiEmpatSamaSisi {
    double sisiAlas,       
    tinggiLimas,     
    luasSisiTegak,   
    tinggiSisiTegak; 


public limasSegiEmpatSamaSisi(double panjangSisiAlas, double tinggiLimas) {
 sisiAlas = panjangSisiAlas;
 this.tinggiLimas = tinggiLimas;
}

public double luasPermukaan(){
 
 tinggiSisiTegak = Math.sqrt((sisiAlas/2.0) * (sisiAlas/2.0) + (tinggiLimas * tinggiLimas));
 
 luasSisiTegak = (sisiAlas * tinggiSisiTegak)/2.0;
 
 return (sisiAlas * sisiAlas) + (4 * luasSisiTegak);
}

public double volume(){
 
 return 1.0 / 3.0 * sisiAlas * sisiAlas * tinggiLimas;
}
}
