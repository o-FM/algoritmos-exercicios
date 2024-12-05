package algoritmos.hackerrank;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.text.NumberFormat.getCurrencyInstance;

public class CurrencyFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale usLocale = Locale.US;
        Locale indiaLocale = new Locale("en", "IN");;
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;

        NumberFormat us = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat france = NumberFormat.getCurrencyInstance(franceLocale);

        if (india instanceof DecimalFormat) {
            DecimalFormatSymbols indiaSymbols = ((DecimalFormat) india).getDecimalFormatSymbols();
            indiaSymbols.setCurrencySymbol("Rs.");
            ((DecimalFormat) india).setDecimalFormatSymbols(indiaSymbols);
        }

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
