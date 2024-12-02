package com.iabdinur.tdd.taxcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculationServiceTest {
    private TaxCalculationService underTest;

    @Test
    void testWhenLessThanOrEqual11500(){
        // Given
        ScottishTaxCalculator scottishTaxCalculator = new ScottishTaxCalculator ();
        // When
        // Then
        double income = scottishTaxCalculator.getTaxRate(11000);
        assertEquals(0, scottishTaxCalculator.getTaxRate(income));
    }

    @Test
    void testWhenGreaterThan11501AndLessThanOrEqual13850(){
        // Given
        ScottishTaxCalculator scottishTaxCalculator = new ScottishTaxCalculator ();
        // When
        // Then
        double income = scottishTaxCalculator.getTaxRate(11501);
        assertEquals(19, income);
    }

    @Test
    void testWhenGreaterThan13851AndLessThanOrEqual24000(){
        // Given
        ScottishTaxCalculator scottishTaxCalculator = new ScottishTaxCalculator ();
        // When
        // Then
        double income = scottishTaxCalculator.getTaxRate(13851);
        assertEquals(20, income);
    }
    @Test
    void testWhenGreaterThn24001AndLessThanOrEqual44273(){
        // Given
        ScottishTaxCalculator scottishTaxCalculator = new ScottishTaxCalculator ();
        // When
        // Then
        double income = scottishTaxCalculator.getTaxRate(24001);
        assertEquals(21, income);
    }

    @Test
    void testWhenGreaterThan44274AndLessThanOrEqual150000(){
        // Given
        ScottishTaxCalculator scottishTaxCalculator = new ScottishTaxCalculator ();
        // When
        // Then
        double income = scottishTaxCalculator.getTaxRate(44274);
        assertEquals(41, income);
    }

    @Test
    void testWhenGreaterThan150000(){
        // Given
        ScottishTaxCalculator scottishTaxCalculator = new ScottishTaxCalculator ();
        // When
        // Then
        double income = scottishTaxCalculator.getTaxRate(150001);
        assertEquals(46, income);
    }
}
