package day2;

import java.util.Scanner;
public class Submission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        int sum = 0;   // float sum
        int i;
        for (i=1; i <= num; i++) 
        {
            sum += (i) ;  // sum += i**2
        
        }
        System.out.print(sum);
    }
}
