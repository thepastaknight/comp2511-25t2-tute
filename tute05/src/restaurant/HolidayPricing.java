package restaurant;

import java.util.List;

public class HolidayPricing implements PricingStrategy {

    @Override
    public double cost(List<Meal> order, Boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
    }

    @Override
    public double getCostModifier() {
        return 1.15;
    }
    
}
