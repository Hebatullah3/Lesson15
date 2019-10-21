package PizzaProblem;

import java.util.Set;

public class Pizza {
    private String name;
    private double price;
    private String description;
    private Set<Ingredient> ingredients;


    public Pizza(String name, double price, String description, Set<Ingredient> ingredients) {
        this.name = name.toLowerCase();
        this.price = price;
        this.description = description;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String PrintMenuItems() {
        return this.name + "  " + this.price + "€" + "\n" + this.ingredients;
    }


}
