package application;

import util.Barter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar = sc.nextDouble();

        System.out.print("How many dollar will be bought? ");
        double value = sc.nextDouble();

        double result = Barter.dollarToReal(dollar, value);
        System.out.print("Amount to be paid in reais = ");
        System.out.printf("%.2f",result);

        sc.close();
    }
}
