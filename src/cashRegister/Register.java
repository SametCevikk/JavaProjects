package cashRegister;

import java.util.Scanner;

public class Register {
    public static void main(String[] args){

        double pear=2.14;
        double apple=3.67;
        double tomato=1.11;
        double banana=0.95;
        double aubergine=5;

        double pearKg,appleKg,tomatoKg,bananaKg,aubergineKg;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Armut kaç kilo ? ");
        pearKg=scanner.nextInt();
        System.out.print("Elma kaç kilo ? ");
        appleKg=scanner.nextInt();
        System.out.print("Domates kaç kilo ? ");
        tomatoKg=scanner.nextInt();
        System.out.print("Muz kaç kilo ? ");
        bananaKg=scanner.nextInt();
        System.out.print("Patlıcan kaç kilo ? ");
        aubergineKg=scanner.nextInt();

        double total=(pearKg*pear)+(appleKg*apple)+(tomatoKg*tomato)+(bananaKg*banana)+(aubergineKg*aubergine);
        System.out.println("Toplam tutar = "+total);




    }
}
