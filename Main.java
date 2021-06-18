package com.company;
import com.company.Puzzle.*;

public class Main {
    public static void main(String[] args) {

        Puzzle harryPotter = new Puzzle();
        System.out.println(harryPotter);

        Puzzle london = new Puzzle(4, 100, 100);
        System.out.println(london);


        Puzzle car = new Puzzle( 100, 100, 100, 100, "type", "name",
                "des", "pro", 100);
        System.out.println(london);
        System.out.println(car);

        System.out.print("Count: ");
        Puzzle.printCount();

        harryPotter.printsCount();

    }
}
