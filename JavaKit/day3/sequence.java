package day3;

// write a program to generate the following sequence until the last value is less than
// 1000.
// 1,3,7,15,31,...........

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n;
        double x3 = 0;
        double x1 = 0;

        System.out.println("Enter the n: ");
        
        n = input.nextInt();
        if (n<1000) {
            for (i=0;i<n;i++) {
           
                double power = Math.pow(2, i);
                x3 = x1 + power;
                System.out.println(x3);
               
                x1 = x3;
                
            }
    
        }
       
    }
}
