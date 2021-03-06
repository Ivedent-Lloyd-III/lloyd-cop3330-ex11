package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 11
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int Euros = Euros();
        double exchangeRate = Rate();

        double USdollars = (Euros * exchangeRate);

        double roundDollars = USdollars * 100.0;
        int dollarsRounded = (int) Math.ceil(roundDollars);
        double dollarsFinal = dollarsRounded / 100.0;

        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println(+Euros+" euros at an exchange rate of "+exchangeRate+" is "+format.format(dollarsFinal)+" U.S. dollars.");

    }

    private static int Euros(){

        System.out.print("How many Euros are you exchanging? ");
        String inputEuro = in.nextLine();
        int Euros = Integer.parseInt(inputEuro);

        return Euros;

    }

    private static double Rate(){

        System.out.print("What is the exchange rate ? ");
        String inputRate = in.nextLine();
        double exchangeRate = Double.parseDouble(inputRate);

        return exchangeRate;

    }

}
