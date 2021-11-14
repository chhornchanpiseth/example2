package day3.Assignment1;

import java.util.Scanner;

import javax.swing.text.TabExpander;
public class Commission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter DD amount : ");
        int Amount = input.nextInt();
        float com=0;
        if (Amount>0 && Amount<=500) {
            com = (Amount*10)/100;
        }
        else if (Amount>=501 && Amount<=1000 ) {
            com = (Amount*15)/100;
        }
        else if (Amount>=1001 && Amount<=5000) {
            com = (Amount*20)/100;
        }
        else if (Amount>=5001 && Amount<=10000 ) {
            com = (Amount*25)/100;
        }
        System.out.println("Commission is " +com);
        float total = Amount + com;
        System.out.println("Total amount that you need to pay back : "+total);
    }
}
