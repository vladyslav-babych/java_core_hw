package hw_lesson23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Faction {
    private String factionName;
    ArrayList<Deputy> deputies = new ArrayList<Deputy>();


    public String getFactionName() {
        return factionName;
    }

    public void setFactionName(String factionName) {
        this.factionName = factionName;
    }

    public Faction(String factionName, ArrayList<Deputy> deputies) {
        super();
        this.factionName = factionName;
        this.deputies = deputies;
    }

    public void giveBribe(int bribe, String deputyFirstName, String deputyLastName) {
        deputies.forEach(Deputy -> {
            if (Deputy.getFirstName().equals(deputyFirstName) && Deputy.getLastName().equals(deputyLastName)) {
                Deputy.takeBribe(bribe);
            }
            else {
                System.out.println("This deputy don't exist");
            }
        });
    }

    public void addDeputy(String deputyFirstName, String deputyLastName) {
        deputies.add(new Deputy(deputyFirstName, deputyLastName));
        System.out.println("Deputy was added");
        deputies.forEach(System.out::println);
    }

    public void removeDeputy(String firstName, String lastName) {
        if(deputies.isEmpty()) {
            System.out.println("There aren't deputies");
        }
        else {
            Iterator<Deputy> iterator = deputies.iterator();
            while (iterator.hasNext()) {
                Deputy nextDeputy = iterator.next();
                if (nextDeputy.getLastName().equalsIgnoreCase(lastName) && nextDeputy.getFirstName().equalsIgnoreCase(firstName)) {
                    iterator.remove();
                    System.out.println(nextDeputy.toString() + " was deleted from faction");
                }
                else {
                    System.out.println("Deputy don't exist");
                }
            }
        }
    }


    public void showBribers() {
        deputies.forEach(deputy -> {
           if (deputy.isBriber()) {
               System.out.println(deputy.toString());
           }
        });
    }

    public void getLargestBriber() {
        Collections.sort(deputies, new DeputySorting());
        System.out.println(deputies.get(deputies.size() - 1) + " is largest briber");
    }

    public void showAllDeputies() {
        deputies.forEach(System.out::println);
    }

    public void clearFaction() {
        deputies.clear();
        System.out.println("All deputies was deleted from faction");
    }

    @Override
    public String toString() {
        return "Faction \"" + deputies + "\"";
    }
}