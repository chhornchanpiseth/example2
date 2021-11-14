package day3;

import java.util.Scanner;
public class function1 {
    static void FindPrimeNum(int a) {
        
        int i,factor=0;
        
       
        for (i=1;i<=a;i++) {
            if (a%i==0) {
                factor += 1;
            }
        }
        if (factor>2) {
            System.out.println(a+ " is not a prime number!");

        }
        else {
            System.out.println(a+ "is a prime number!");
        }
    }
        
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num;
       System.out.println("Enter num: ");
       num = input.nextInt();
       FindPrimeNum(num);
    }
}
