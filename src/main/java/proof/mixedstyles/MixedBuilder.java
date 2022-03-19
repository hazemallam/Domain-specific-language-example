package proof.mixedstyles;

import models.Order;
import models.Trade;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class MixedBuilder {
    public static Order forCustomer(String customer, TradeBuilder... tradeBuilders){
        Order order = new Order();
        order.setCustomer(customer);
        Stream.of(tradeBuilders).forEach(builder -> order.addTrade(builder.trade));
        return order;
    }

    public static TradeBuilder buy(Consumer<TradeBuilder> consumer){
        return buildTrade(consumer, Trade.Type.BUY);
    }

    public static TradeBuilder sell(Consumer<TradeBuilder> consumer){
        return buildTrade(consumer, Trade.Type.SELL);
    }

    private static TradeBuilder buildTrade(Consumer<TradeBuilder> consumer, Trade.Type type) {
        TradeBuilder builder = new TradeBuilder();
        builder.trade.setType(type);
        consumer.accept(builder);
        return builder;

    }
}
