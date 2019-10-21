package MoMa2019;

import PizzaProblem.Pizza;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class Museum {

    List<Moma> pieces = new ArrayList<>();

    public Museum() {
        Moma piece1 = new Moma(1, "Guernica", "Painting", 1937, "Pablo Picasso", "Good one");
        Moma piece2 = new Moma(2, "The Starry Night", "Painting, Oil on canvas", 1889, "Vincent van Gogh", "the view from the east-facing window of his asylum room");
        Moma piece3 = new Moma(3, "Untitled", "Screenprint", 2018, "Silberner Ziegelstein", "Felt-tip pen and watercolor on paper");
        Moma piece4 = new Moma(4, "Fiery Sunset", "Acrylic on canvas", 1973, "Alma Woodsey Thomas", "Painting and Sculpture");
        Moma piece5 = new Moma(5, "The Kiss", "Gold leaf, Oil paint", 1907, "Gustav Klimt", "Good one");

        pieces.add(piece1);
        pieces.add(piece2);
        pieces.add(piece3);
        pieces.add(piece4);
        pieces.add(piece5);
    }

    public void displayMenu() {

        for (Moma m : pieces) {
            System.out.println(m.printArtPieces());

        }
    }

    public String getPieces(int input) {

        for (Moma m : pieces) {
            if (m.getId() == input) {
                return m.printFullInfo();
            }
        }
        return "this piece is not available in our museum";
    }
}

