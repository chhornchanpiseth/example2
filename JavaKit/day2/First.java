package day2;

import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        int rem;
        while (num!=0) 
        {
            rem = num%10;
            System.out.print(rem);
            num = num/10;
        }
        
    }
}   


