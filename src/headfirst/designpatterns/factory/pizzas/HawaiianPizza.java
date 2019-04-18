package headfirst.designpatterns.factory.pizzas;

public class HawaiianPizza extends Pizza {
    public HawaiianPizza() {
        name = "Hawaiian Pizza";
        dough = "Crust";
        sauce = "Tomato sauce";
        toppings.add("Ham");
        toppings.add("Sliced Pineapple");
        toppings.add("Grated parmesan cheese");
    }
}
