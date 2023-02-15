/**
 * 
 * @apiNote Ceci est notre classe principale
 * 
 */

import java.util.Scanner;

public class TestNumber{

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number please ");
        int a=input.nextInt();
        System.out.println("Enter an other number please ");
        int b=input.nextInt();

        DivNumber isDiv=new DivNumber();
        isDiv.isDivisibly(a, b);

        input.close();
    }
}