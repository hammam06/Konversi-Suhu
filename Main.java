package Suhu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double suhu;
        int choose;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("PROGRAM KONVERSI SUHU AIR");
        System.out.println("Input Data");
        System.out.println("==========");
        System.out.print("Suhu Dalam Celcius : ");
        suhu = input.nextDouble();
        
        do {
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            choose = input.nextInt();
            System.out.println("");
            if(choose == 1){
                System.out.println("Suhu Dalam Celcius     = " + suhu + "°C");
                Konversi.ream(suhu);
                Konversi.faren(suhu);
                Konversi.kelv(suhu);
                if(suhu > 0 && suhu < 100){
                    System.out.println("Kondisi Air Normal.");
                } else if(suhu <= 0){
                    System.out.println("Kondisi Air Beku.");
                } else if(suhu >= 100){
                    System.out.println("Kondisi Air Mendidih.");
                }
                System.out.println("");
            } else if(choose == 2){
                System.out.println("Input Data");
                System.out.println("==========");
                System.out.print("Suhu Dalam Celcius : ");
                suhu = input.nextDouble();
                System.out.println("");
            } else {
                System.out.println("Opsi yang anda inputkan tidak tersedia, coba ulangi lagi!");
                System.out.println("");
            }
        } while(choose != 3);
    }
    
}
