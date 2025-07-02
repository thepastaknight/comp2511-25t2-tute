package restaurant;

import java.util.List;

public class StandardPricing implements PricingStrategy {

    @Override
    public double cost(List<Meal> order, Boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double getCostModifier() {
        return 1;
    }

}
