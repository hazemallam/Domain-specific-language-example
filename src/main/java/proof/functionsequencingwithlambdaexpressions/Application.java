package proof.functionsequencingwithlambdaexpressions;

import models.Order;

import static proof.functionsequencingwithlambdaexpressions.LambdaOrderBuilder.order;

public class Application {
    public static void main(String[] args) {
        Order order = order(o -> {
            o.forCustomer("BigBank");
            o.buy(t -> {
                t.quantity(80);
                t.price(120.00);
                t.stock(s -> {
                    s.symbol("IBM");
                    s.market("NYSE");
                });
            });
            o.sell(t -> {
                t.quantity(50);
                t.price(375.00);
                t.stock(s -> {
                    s.symbol("GOOLGE");
                    s.market("NASDAQ");
                });
            });
        });

    }
}
