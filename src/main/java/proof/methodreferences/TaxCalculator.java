package proof.methodreferences;

import models.Order;

public class TaxCalculator {
    private boolean useRegional;
    private boolean useGeneral;
    private boolean useSurcharge;

    public TaxCalculator withTaxRegional(){
        useRegional = true;
        return this;
    }

    public TaxCalculator withTaxGeneral(){
        useRegional = true;
        return this;
    }

    public TaxCalculator withTaxSurcharge(){
        useSurcharge = true;
        return this;
    }

    public double calculate(Order order){
        return Tax.calculate(order, useRegional, useGeneral, useSurcharge);
    }
}
