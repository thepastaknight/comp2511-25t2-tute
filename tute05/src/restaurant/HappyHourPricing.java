package restaurant;

import java.util.List;

public class HappyHourPricing implements PricingStrategy {

    @Override
    public double cost(List<Meal> order, Boolean isMember) {
        if (isMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        }
    }

    @Override
    public double getCostModifier() {
        return 0.7;
    }

}
