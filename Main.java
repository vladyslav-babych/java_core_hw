package hw_lesson13;

import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("Enter 1 to add Faction");
        System.out.println("Enter 2 to delete Faction");
        System.out.println("Enter 3 to show all Factions");
        System.out.println("Enter 4 to clear Faction");
        System.out.println("Enter 5 to show Faction");
        System.out.println("Enter 6 to add deputy into Faction");
        System.out.println("Enter 7 to delete deputy from Faction");
        System.out.println("Enter 8 to show all bribers");
        System.out.println("Enter 9 to show the largest briber");
        System.out.println("Enter 'exit' to exit application");
        System.out.print("Type here >> ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean app = true;
        while (app) {
            menu();
            switch (scanner.next()) {
                case"1": {
                    SupremeCouncil.getInstance().addFaction();
                    break;
                }
                case"2": {
                    SupremeCouncil.getInstance().deleteFaction();
                    break;
                }
                case"3": {
                    SupremeCouncil.getInstance().getAllFactions();
                    break;
                }
                case"4": {
                    SupremeCouncil.getInstance().clearFaction();
                    break;
                }
                case"5": {
                    SupremeCouncil.getInstance().getFaction();
                    break;
                }
                case"6": {
                    SupremeCouncil.getInstance().addDeputyToFaction();
                    break;
                }
                case"7": {
                    SupremeCouncil.getInstance().removeDeputyFromFaction();
                    break;
                }
                case"8": {
                    SupremeCouncil.getInstance().getBribersFromFaction();
                    break;
                }
                case"9": {
                    SupremeCouncil.getInstance().getLargestBriberFromFaction();
                    break;
                }
                case"exit":{
                    app = false;
                    break;
                }
                default: {
                    System.out.println("You entered something wrong, try again!");
                    break;
                }
            }
        }
    }
}