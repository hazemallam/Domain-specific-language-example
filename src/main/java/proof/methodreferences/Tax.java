package proof.methodreferences;

import models.Order;

public class Tax {
    public static double regional(double value){
        return value * 1.1;
    }

    public static double general(double value){
        return value * 1.3;
    }

    public static double surcharge(double value){
        return value * 1.05;
    }

    public static double calculate(Order order, boolean userRegional, boolean useGeneral, boolean useSurcharge){
        double value = order.getValue();
        if(userRegional) value = Tax.regional(value);
        if(useGeneral) value = Tax.general(value);
        if(useSurcharge) value = Tax.surcharge(value);
        return value;
    }
}
//bad way to use something like that
// double value = calculate(order, true, false, true);