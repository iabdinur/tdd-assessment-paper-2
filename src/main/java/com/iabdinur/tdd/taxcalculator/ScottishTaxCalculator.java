package com.iabdinur.tdd.taxcalculator;

public class ScottishTaxCalculator implements TaxCalculationService{
    @Override
    public double getTaxRate(double income) {
        if (income <= 11500) {
            return 0.00;
        }

        else if (income >= 11501 && income <= 13850) {
            return 19.00;
        }

        else if (income >= 13851 && income <= 24000) {
            return 20.00;
        }

        else if (income >= 24001 && income <= 44273) {
            return 21.00;
        }

        else if (income >= 44_74 && income <= 150000) {
            return 41.00;
        }

        else if (income > 150000) {
            return 46.00;
        }
        else
            throw new IllegalStateException("Invalid tax rate" + income);
    }
}
