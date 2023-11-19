package org.example;
//DRY do not repeat yourself
public class Main {
    public static void main(String[] args) {

        CreditManager creditManager = new CreditManager();

        creditManager.add();
        creditManager.calculate();

        MortgageManager mortgageManager = new MortgageManager();
        mortgageManager.add();
        mortgageManager.calculate();

        CreditManager[] credits = new CreditManager[2];
        credits[0] = new MortgageManager();
        credits[1] = new VehicleManager();

        for (CreditManager credit:credits
             ) {

            credit.calculate();

        }

    }

}