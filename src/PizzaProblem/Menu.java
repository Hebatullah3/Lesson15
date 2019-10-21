package PizzaProblem;

import java.util.*;

public class Menu {
    Map<String, Pizza> pizzas = new HashMap<>();

    public Menu() {
        Set<Ingredient> margheritaIngredient = new HashSet<>();
        Set<Ingredient> tunaIngredients = new HashSet<>();
        Set<Ingredient> chickenIngredients = new HashSet<>();

        margheritaIngredient.add(Ingredient.BLACK_OLIVES);
        margheritaIngredient.add(Ingredient.PINEAPPLE);

        tunaIngredients.add(Ingredient.TUNA);
        tunaIngredients.add(Ingredient.MUSHROOMS);
        tunaIngredients.add(Ingredient.GREEN_PEPPERS);
        tunaIngredients.add(Ingredient.SPINACH);

        chickenIngredients.add(Ingredient.EXTRA_CHEESE);
        chickenIngredients.add(Ingredient.SPINACH);
        chickenIngredients.add(Ingredient.ONIONS);
        chickenIngredients.add(Ingredient.CHICKEN);



        Pizza margherita = new Pizza("Margherita", 5, "good PizzaProblem.Pizza ", margheritaIngredient);
        Pizza tuna = new Pizza("Tuna", 7.5, " Verygood PizzaProblem.Pizza ", tunaIngredients);
        Pizza chicken = new Pizza("Chicken", 6.5, " delicious PizzaProblem.Pizza ", chickenIngredients);

        pizzas.put(margherita.getName(), margherita);
        pizzas.put(tuna.getName(), tuna);
        pizzas.put(chicken.getName(), chicken);
    }

    public void displayMenu() {
        for (Map.Entry<String, Pizza> entry : pizzas.entrySet()) {
            Pizza pizzaEntry = entry.getValue();
            System.out.println(pizzaEntry.PrintMenuItems());
        }
    }

    public void getPizzaMenu() {


        System.out.println("please select ur pizza ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        Pizza ChosenPizza = pizzas.get(input);
        if (ChosenPizza != null) {
            System.out.println(ChosenPizza.PrintMenuItems());
        } else {
            System.out.println("Sorry this pizza is not in our menu ,do u need to make your own pizza!? Please answer with yes/no");
            Scanner scanner2 = new Scanner(System.in);
            String input2 = scanner2.nextLine();
            if (input2.equalsIgnoreCase("yes")) {
                createPizza();

            } else {
                for (Map.Entry<String, Pizza> entry : pizzas.entrySet()) {
                    Pizza pizzaEntry = entry.getValue();
                    System.out.println("Please Select ur pizza \n:" + pizzaEntry.PrintMenuItems());
                }


            }
        }
    }

    public void createPizza() {
        System.out.println("Please Enter your PizzaProblem.Pizza name ..");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        System.out.println("Please Enter your PizzaProblem.Pizza ingredients, Note:separate between each ingredients with ','");
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner2.nextLine().toLowerCase();
        String[] ingredients = input2.split(",");
        HashSet<Ingredient> userIngredients = new HashSet<>();
        for (String ingredient : ingredients) {
            try {
                Ingredient userIngredient = Ingredient.valueOf(ingredient.trim().toUpperCase());
                userIngredients.add(userIngredient);
            } catch (IllegalArgumentException e) {
                System.out.println(String.format("%s is not available!", ingredient));
            }
        }

        if (userIngredients.size() > 0) {
            Pizza userPizza = new Pizza(input, 15, "custom PizzaProblem.Pizza", userIngredients);
            pizzas.put(userPizza.getName(), userPizza);
            System.out.println("Your created pizza is: ");
            Pizza createdPizza = pizzas.get(input);
            System.out.println(createdPizza.PrintMenuItems());
        } else {
            System.out.println("You did not select any ingredient! please try again");
            displayMenu();
            getPizzaMenu();
        }

    }


  /*  public void editPizzaIngredients() {
        String editedpizza = "Margrita";
        PizzaProblem.Pizza pizza = pizzas.get(editedpizza.toLowerCase());
        HashSet<PizzaProblem.Ingredient> ingredients = new HashSet<>();
        for (PizzaProblem.Ingredient ingredient : pizza.getIngredients()) {
            ingredients.add(ingredient); */


    public Double avgPrice() {
        Double pizzaPrices = 0.0;

        for (Map.Entry<String, Pizza> entry : pizzas.entrySet()) {
            Pizza pizzaEntry = entry.getValue();

            pizzaPrices += pizzaEntry.getPrice();

        }

        return pizzaPrices / pizzas.size();


    }


}


