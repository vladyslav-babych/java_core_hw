package hw_lesson23;

import java.util.Locale;
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
        System.out.println("Enter 9 to show the biggest briber");
        System.out.println("Enter 10 to give bribe");
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
                    System.out.print("Enter faction name >> ");
                    String factionName = scanner.next();
                    SupremeCouncil.getInstance().addFaction(factionName);
                    break;
                }
                case"2": {
                    System.out.print("Enter faction name >> ");
                    String factionName = scanner.next();
                    SupremeCouncil.getInstance().deleteFaction(factionName);
                    break;
                }
                case"3": {
                    SupremeCouncil.getInstance().getAllFactions();
                    break;
                }
                case"4": {
                    System.out.print("Enter faction name >> ");
                    String factionName = scanner.next();
                    SupremeCouncil.getInstance().clearFaction(factionName);
                    break;
                }
                case"5": {
                    System.out.print("Enter faction name >> ");
                    String factionName = scanner.next();
                    SupremeCouncil.getInstance().getFaction(factionName);
                    break;
                }
                case"6": {
                    System.out.print("Enter faction name >> ");
                    String factionName = scanner.next();
                    System.out.print("Enter deputy first name >> ");
                    String firstName = scanner.next();
                    System.out.print("Enter deputy last name >> ");
                    String lastName = scanner.next();
                    SupremeCouncil.getInstance().addDeputyToFaction(firstName, lastName, factionName);
                    break;
                }
                case"7": {
                    System.out.print("Enter faction name >> ");
                    String factionName = scanner.next();
                    System.out.print("Enter deputy first name >> ");
                    String firstName = scanner.next();
                    System.out.print("Enter deputy last name >> ");
                    String lastName = scanner.next();
                    SupremeCouncil.getInstance().removeDeputyFromFaction(firstName, lastName, factionName);
                    break;
                }
                case"8": {
                    System.out.print("Enter faction name >> ");
                    String factionName = scanner.next();
                    SupremeCouncil.getInstance().getBribersFromFaction(factionName);
                    break;
                }
                case"9": {
                    System.out.print("Enter faction name >> ");
                    String factionName = scanner.next();
                    SupremeCouncil.getInstance().getLargestBriberFromFaction(factionName);
                    break;
                }
                case"10": {
                    System.out.print("Enter bribe amount >> ");
                    int bribeAmount = scanner.nextInt();
                    System.out.print("Enter faction name >> ");
                    String factionName = scanner.next();
                    System.out.print("Enter deputy first name >> ");
                    String firstName = scanner.next();
                    System.out.print("Enter deputy last name >> ");
                    String lastName = scanner.next();
                    SupremeCouncil.getInstance().giveBribe(bribeAmount, firstName, lastName, factionName);
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