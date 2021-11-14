package day3.Assignment1;

import java.util.Scanner;
public class incomeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your income : ");
        int Amount = input.nextInt();
        float tax=0;
        if (Amount>0 && Amount<=100000) {
            System.out.println("No tax");
        }
        else if (Amount>=100001 && Amount<=300000 ) {
            tax = (Amount*10)/100;
        }
        else if (Amount>=300001 && Amount<=500000) {
            tax = (Amount*20)/100 + 1000;
        }
        else if (Amount>=5001 && Amount<=10000 ) {
            tax = (Amount*25)/100 + 2000;
        }
        System.out.println("tax income is " +tax);
        
    }
}
