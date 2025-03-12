package bodyIndexCalculator;

import java.util.Scanner;

public class BodyIndexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz ");
        double size= scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz ");
        double weight=scanner.nextDouble();
        scanner.close();

        double calculate=weight/(size*size);
        System.out.println("Vücut kitle indexiniz: "+calculate);

    }
}
