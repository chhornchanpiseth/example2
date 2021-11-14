package day3;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scanner.nextInt();
        int fac = 1;
        for (int i=1;i<n;i++) {
            fac = fac*i;

        }
        System.out.println(fac);
    }
}
