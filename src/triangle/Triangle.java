package triangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Üçgen kaç katlı olsun ");
        int number=scanner.nextInt();

        for(int i=number;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
