package day3;

import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1,x2,x3,n;
        x1 = 0;
        x2 = 1;
        x3 = 0;
        System.out.println("Enter n : ");
        n = input.nextInt();
        for(int i=0;i<n;i++) {
            x3 = x1 + x2;
            System.out.println(x3);
            x1 = x2;
            x2 = x3;
        }



    }
}
