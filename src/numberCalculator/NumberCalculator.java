package numberCalculator;

import java.util.Scanner;

public class NumberCalculator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz ");
        int number=scanner.nextInt();
        int total=0,counter=0;
        for(int i=1;i<=number;i++){
            if(i%3==0 && i%4==0){
                total+=i;
                counter++;
            }
        }

        int result=total/counter;
        System.out.println("Sayının 3 ve 4'e tam bölünen katlarının ortalaması: " + result);
    }
}
