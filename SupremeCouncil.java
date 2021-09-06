package hw_lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SupremeCouncil {
    private static SupremeCouncil instance = new SupremeCouncil();

    private SupremeCouncil() {

    }

    public static SupremeCouncil getInstance() {
        if (instance == null) {
            instance = new SupremeCouncil();
        }
        return instance;
    }

    ArrayList<Faction> supremeCouncilArray = new ArrayList<Faction>();

    public void addFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter faction name >> ");
        String factionName = scanner.next();

        Faction faction = new Faction(factionName);

        supremeCouncilArray.add(faction);
        System.out.println("Faction " + faction.toString() + " was added to Supreme Council");
    }

    public void deleteFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter faction name >> ");
        String factionName = scanner.next();

        boolean typeCorrect = isFactionExist(supremeCouncilArray, factionName);

        if (typeCorrect) {

            Iterator<Faction> iterator = supremeCouncilArray.iterator();

            while (iterator.hasNext()) {
                Faction nextFaction = iterator.next();

                if (nextFaction.getFactionName().equalsIgnoreCase(factionName)) {
                    iterator.remove();
                    System.out.println("Faction " + nextFaction.toString() + " was deleted from Supreme Council");
                }
            }

        }
        else {
            System.out.println("There isn't such a faction");
        }
    }

    public void getAllFactions() {
        System.out.println("Found these factions:");
        for (Faction faction : supremeCouncilArray) {
            System.out.println(faction.toString());
        }
    }

    public void clearFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter faction name >> ");
        String factionName = scanner.next();

        boolean typeCorrect = isFactionExist(supremeCouncilArray, factionName);

        if (typeCorrect) {
            for (Faction faction : supremeCouncilArray) {
                if (faction.getFactionName().equalsIgnoreCase(factionName)) {
                    faction.clearFaction();
                }
            }

        }
        else {
            System.out.println("There isn't such a Faction");
        }
    }

    public void getFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter faction name >> ");
        String deputyGroupName = scanner.next();

        for (Faction faction : supremeCouncilArray) {
            if (faction.getFactionName().equalsIgnoreCase(deputyGroupName)) {
                System.out.println(faction.toString());
                faction.showAllDeputies();
            }
        }
    }

    public void addDeputyToFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter faction name >> ");
        String factionName = scanner.next();

        boolean typeCorrect = isFactionExist(supremeCouncilArray, factionName);

        if (typeCorrect) {
            for (Faction faction : supremeCouncilArray) {
                if (faction.getFactionName().equalsIgnoreCase(factionName)) {
                    faction.addDeputy();
                }
            }
        }
        else {
            System.out.println("There isn't such a Faction");
        }
    }

    public void removeDeputyFromFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter faction name >> ");
        String factionName = scanner.next();

        boolean typeCorrect = isFactionExist(supremeCouncilArray, factionName);

        if (typeCorrect) {
            for (Faction faction : supremeCouncilArray) {
                if (faction.getFactionName().equalsIgnoreCase(factionName)) {
                    faction.removeDeputy();
                }
            }

        }
        else {
            System.out.println("There isn't such a Faction");
        }
    }

    public void getBribersFromFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter faction name >> ");
        String factionName = scanner.next();

        boolean typeCorrect = isFactionExist(supremeCouncilArray, factionName);

        if (typeCorrect) {
            for (Faction faction : supremeCouncilArray) {
                if (faction.getFactionName().equalsIgnoreCase(factionName)) {
                    faction.showBribers();
                }
            }

        }
        else {
            System.out.println("There isn't such a Faction");
        }
    }
    public void getLargestBriberFromFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter faction name >> ");
        String factionName = scanner.next();

        boolean correctType = isFactionExist(supremeCouncilArray, factionName);

        if (correctType) {
            for (Faction faction : supremeCouncilArray) {
                if (faction.getFactionName().equalsIgnoreCase(factionName)) {
                    faction.getLargestBriber();
                }
            }

        }
        else {
            System.out.println("There isn't such a Faction");
        }
    }

    public void getAllDeputiesFromFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter faction name >> ");
        String factionName = scanner.next();

        boolean typeCorrect = isFactionExist(supremeCouncilArray, factionName);

        if (typeCorrect) {
            for (Faction faction : supremeCouncilArray) {
                if (faction.getFactionName().equalsIgnoreCase(factionName)) {
                    faction.showAllDeputies();;
                }
            }

        }
        else {
            System.out.println("There isn't such a Faction");
        }
    }

    static boolean isFactionExist(ArrayList<Faction> supremeCouncilArray, String factionName) {
        boolean flag = false;
        for (Faction faction : supremeCouncilArray) {
            if (faction.getFactionName().equalsIgnoreCase(factionName)) {
                flag = true;
            }
        }
        return flag;
    }
}