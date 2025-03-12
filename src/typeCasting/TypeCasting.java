package typeCasting;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı giriniz ");
        int integerNumber=scanner.nextInt();
        System.out.print("Lütfen bir ondalıklı sayı giriniz ");
        double doubleNumber=scanner.nextDouble();

        double changedIntegerNumber = integerNumber;

        int changedDoubleNumber = (int)doubleNumber;

        System.out.println("Değiştirilmiş tam sayının değeri: " + changedIntegerNumber);
        System.out.println("Değiştirilmiş ondalıklı sayının değeri: " + changedDoubleNumber);


    }
}
