package headfirst.designpatterns.factory.pizzafm;

public class ChicagoStyleHawaiian extends Pizza {
    public ChicagoStyleHawaiian() {
        name = "Chicago Style Hawaiian Pizza";
        dough = "Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("Ham");
        toppings.add("Sliced Pineapple");
        toppings.add("Grated parmesan cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
