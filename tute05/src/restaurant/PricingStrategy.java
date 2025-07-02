package restaurant;

import java.util.List;

public interface PricingStrategy {
    public double cost(List<Meal> order, Boolean isMember);

    public double getCostModifier();
}
