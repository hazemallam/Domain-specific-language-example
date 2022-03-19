package proof.methodchaining;

import models.Order;

import static proof.methodchaining.MethodChainingOrderBuilder.forCustomer;

public class Application {
    public static void main(String[] args) {
        Order order = forCustomer("BigBank")
                .buy(80)
                .stock("IBM")
                    .on("NYSE")
                .at(125.00)
                .sell(50)
                .stock("GOOGLE")
                    .on("NASDAQ")
                .at(375.00)
                .end();
    }
}
