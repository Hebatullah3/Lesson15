package PizzaProblem;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Menu menu = new Menu();
        menu.displayMenu();
        menu.getPizzaMenu();
        System.out.println("All Pizzas average price is: " +menu.avgPrice());



    }

}
