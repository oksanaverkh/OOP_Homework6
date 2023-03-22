package View;

import java.util.List;
import java.util.Scanner;

import Controller.BeerBuilder;
import Controller.WineBuilder;
import Model.Beer;
import Model.Wine;

public class UserView {
    private int nextChoice;
    private int choice;
    Scanner scan = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);

    public void chooseFromMenu() {
        System.out
                .println("Enter a number of operation: 1 - view drinks list, 2 - add new drink");
        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("Enter a number of drink to view: 1 - beer, 2 - wine:");
            nextChoice = scan.nextInt();
            if (nextChoice == 1) {
                printDrinksList(new Beer().getBeerList());
            } else if (nextChoice == 2) {
                printDrinksList(new Wine().getWineList());
            } else
                System.err.println("Wrong number, try again");

        } else if (choice == 2) {
            System.out.println("Enter a number of drink to add: 1 - beer, 2 - wine:");
            nextChoice = scan.nextInt();
            System.out.println("Enter a drink's name: ");
            String name = sc.nextLine();
            System.out.println("Enter a drink's color: ");
            String color = sc.nextLine();
            if (nextChoice == 1) {

                System.out.println("Enter a type: ");
                String type = sc.nextLine();

                Beer beer = BeerBuilder.getInstance().setName(name).setColor(color).setType(type).build();
                List<Beer> listOfBeer = new Beer().getBeerList();
                listOfBeer.add(beer);
                printDrinksList(listOfBeer);
            } else if (nextChoice == 2) {

                System.out.println("Enter sugar volume: ");
                String sugar = sc.nextLine();

                Wine wine = WineBuilder.getInstance().setName(name).setColor(color).setSugar(sugar).build();
                List<Wine> listOfWine = new Wine().getWineList();
                listOfWine.add(wine);
                printDrinksList(listOfWine);

            } else
                System.err.println("Wrong number, try again");
        } else
            System.err.println("Wrong number, try again");
        scan.close();
    }

    public void printDrinksList(List drinkslist) {
        int i = 1;
        System.out.println("List of drinks:\n");
        for (var drink : drinkslist) {
            System.out.print(i + " ");
            System.out.println(drink);
            i++;
        }
        System.out.println();
    }
}
