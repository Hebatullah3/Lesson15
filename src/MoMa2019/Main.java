package MoMa2019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Museum m = new Museum();

        m.displayMenu();

        System.out.println("please select ur piece by number ");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println(m.getPieces(input));
    }
}

