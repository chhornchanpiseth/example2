package day3;

// Write a program in C to check whether the given integer as a sum of two prime numbers
// using the function.
import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,i,factor=0;                 
        System.out.println("Enter number: ");
        num = input.nextInt();

        for (i=1;i<=num;i++) {
            if (num%i==0) {
                factor += 1;
            }
        }
        if (factor>2) {
            System.out.println(num+" is not a prime number !");
        }
        else {
            System.out.println(num+ " is a prime number!");
        }

        
    }
}
