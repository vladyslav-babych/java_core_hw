package hw_lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Faction {
    private String factionName;

    public Faction(String factionName) {
        this.factionName = factionName;
    }

    public String getFactionName() {
        return factionName;
    }

    public void setFactionName(String factionName) {
        this.factionName = factionName;
    }

    Scanner scanner = new Scanner(System.in);
    ArrayList<Deputy> deputies = new ArrayList<Deputy>();

    public void addDeputy(){
        System.out.print("Enter first name >> ");
        String fName = scanner.next();

        System.out.print("Enter last name >> ");
        String lName = scanner.next();

        System.out.print("Enter age >> ");
        int age = scanner.nextInt();

        System.out.print("Enter weight >> ");
        int weight = scanner.nextInt();

        System.out.print("Enter height >> ");
        int height = scanner.nextInt();

        System.out.print("Enter if deputy is briber (true/false) >> ");
        boolean briber = scanner.nextBoolean();
        Deputy deputy = new Deputy(fName, lName, age, weight, height, briber);

        if(deputy.isBriber()) {
            deputy.giveBribe();
        }

        deputies.add(deputy);
        System.out.println(deputy.toString() + " was added to faction");
    }

    public void removeDeputy() {
        if(deputies.isEmpty()) {
            System.out.println("There aren't deputies");
        }
        else {
            System.out.print("Enter deputy last name >> ");
            String lName = scanner.next();
            System.out.print("Enter deputy first name >> ");
            String fName = scanner.next();

            boolean correctType = isDeputyExist(deputies, lName, fName);

            if(correctType) {
                Iterator<Deputy> iterator = deputies.iterator();

                while (iterator.hasNext()) {
                    Deputy nextDeputy = iterator.next();

                    if (nextDeputy.getLastName().equalsIgnoreCase(lName) && nextDeputy.getFirstName().equalsIgnoreCase(fName)) {
                        iterator.remove();
                        System.out.println(nextDeputy.toString() + " was deleted from faction");
                    }
                }

            }
            else {
                System.out.println("This deputy don't exist");
            }
        }
    }

    public void showBribers() {
        System.out.println("Deputies who take bribes : ");
        for (Deputy deputy : deputies) {
            if(deputy.isBriber()) {
                System.out.print(deputy.toString());
            }
        }
    }

    public void getLargestBriber() {
        int bribeSize = 0;
        int deputyIndex = -1;

        for (int i = 0; i < deputies.size(); i++) {
            if (deputies.get(i).isBriber()) {
                if (deputies.get(i).getBribeAmount() > bribeSize) {
                    bribeSize = deputies.get(i).getBribeAmount();
                    deputyIndex = deputies.indexOf(deputies.get(i));
                }
            }
        }

        if (deputyIndex >= 0) {
            System.out.println("Deputy who took the biggest bribe : " + deputies.get(deputyIndex).toString());
        } else {
            System.out.println("There aren't bribers");
        }
    }

    public void showAllDeputies() {
        System.out.println("Deputies in this faction : ");
        for (Deputy deputy : deputies) {
            System.out.println(deputy.toString());
        }
    }

    public void clearFaction() {
        deputies.clear();
        System.out.println("All deputies was deleted from faction");
    }

    static boolean isDeputyExist(ArrayList<Deputy> deputies, String lName, String fName) {
        boolean flag = false;

        for (Deputy deputy : deputies) {
            if (deputy.getLastName().equalsIgnoreCase(lName) && deputy.getFirstName().equalsIgnoreCase(fName)) {
                flag = true;
            }
        }

        return flag;
    }

    @Override
    public String toString() {
        return "Faction \"" + deputies + "\"";
    }
}