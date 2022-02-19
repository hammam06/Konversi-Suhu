package Suhu;

public class Konversi {
    public static void ream(double suhu){
        double reamur = (4 * suhu)/5;
        System.out.println("Suhu Dalam Reamur      = " + reamur + "°R");
    }
    public static void faren(double suhu){
        double farenhit = (9 * suhu)/5 + 32;
        System.out.println("Suhu Dalam Farenhit    = " + farenhit + "°F");
    }
    public static void kelv(double suhu){
        double kelvin = suhu + 273.15;
        System.out.println("Suhu Dalam Kelvin      = " + kelvin + "K");
    }
}
