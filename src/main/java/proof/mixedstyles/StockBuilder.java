package proof.mixedstyles;

import models.Stock;
import models.Trade;

public class StockBuilder {

    private final TradeBuilder builder;
    private final Trade trade;
    private final Stock sotck = new Stock();
    public StockBuilder(TradeBuilder builder, Trade trade, String symbol) {
        this.builder = builder;
        this.trade = trade;
        this.sotck.setSymbol(symbol);
    }
    public TradeBuilder on(String market){
        this.sotck.setMarket(market);
        return builder;
    }
}
