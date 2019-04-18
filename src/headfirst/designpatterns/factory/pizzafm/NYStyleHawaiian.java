package headfirst.designpatterns.factory.pizzafm;

public class NYStyleHawaiian extends Pizza{
    public NYStyleHawaiian() {
        name = "NY Style Hawaiian Pizza";
        dough = "Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("Ham");
        toppings.add("Sliced Pineapple");
        toppings.add("Grated parmesan cheese");
    }
}
