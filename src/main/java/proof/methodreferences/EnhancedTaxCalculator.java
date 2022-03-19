package proof.methodreferences;

import models.Order;

import java.util.function.DoubleUnaryOperator;

public class EnhancedTaxCalculator {
    public DoubleUnaryOperator taxFunction = d -> d;

    public EnhancedTaxCalculator with(DoubleUnaryOperator f){
        taxFunction = taxFunction.andThen(f);
        return this;
    }

    public double calculate(Order order){
        return taxFunction.applyAsDouble(order.getValue());
    }
}
