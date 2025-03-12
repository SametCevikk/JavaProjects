package processingPriority;

import java.util.Scanner;

public class ProcessingPriority {

    public static void main(String[] args) {

        int number1,number2,number3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz ");
        number1=scanner.nextInt();
        System.out.print("Sayı giriniz ");
        number2=scanner.nextInt();
        System.out.print("Sayı giriniz ");
        number3=scanner.nextInt();

        int result=number1+number2*number3-number2;
        System.out.println("İşlem sonucu: " + result);


    }
}
