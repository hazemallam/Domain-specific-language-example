package proof.mixedstyles;

import models.Order;
import proof.methodreferences.EnhancedTaxCalculator;
import proof.methodreferences.Tax;
import proof.methodreferences.TaxCalculator;

import static proof.mixedstyles.MixedBuilder.*;

public class Application {
    public static void main(String[] args) {
        Order order = forCustomer("BigBank",
                buy(t ->
                        t.quantity(80)
                                .stock("IBM")
                                .on("NYSE")
                                .at(120.00)

                ),
                sell(t ->
                        t.quantity(80)
                                .stock("IBM")
                                .on("NYSE")
                                .at(120.00)
                )
        );
        double calculate = new TaxCalculator().withTaxRegional()
                .withTaxRegional()
                .calculate(order);

        //using method reference
        double calculate1 = new EnhancedTaxCalculator().with(Tax::regional)
                .with(Tax::general)
                .calculate(order);
    }

}
