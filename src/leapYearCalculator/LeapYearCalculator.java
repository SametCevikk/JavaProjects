package leapYearCalculator;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz: ");
        int year=scanner.nextInt();

        if((year%4==0 && year%100!=0)|| year%400==0){
            System.out.println(year+" yılı artık yıldır");
        }else
            System.out.println(year+" yılı artık yıl değildir");
    }
}
