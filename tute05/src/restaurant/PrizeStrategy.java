package restaurant;

import java.util.List;

public class PrizeStrategy implements PricingStrategy {

    @Override
    public double cost(List<Meal> order, Boolean isMember) {
        return 0;
    }

    @Override
    public double getCostModifier() {
        return 0;
    }

}
