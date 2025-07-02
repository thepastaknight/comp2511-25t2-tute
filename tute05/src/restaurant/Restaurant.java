package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class Restaurant {
    private PricingStrategy chargingStrategy = new StandardPricing();
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();

    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public double cost(List<Meal> order, String payee) {
        return chargingStrategy.cost(order, members.contains(payee));
    }

    public void displayMenu() {
        double modifier = chargingStrategy.getCostModifier();

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();
        r.setChargingStrategy(new PrizeStrategy());
        r.displayMenu();
    }

    public void setChargingStrategy(PricingStrategy chargingStrategy) {
        this.chargingStrategy = chargingStrategy;
    }
}
