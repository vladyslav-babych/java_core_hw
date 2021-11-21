package hw_lesson23;

import java.util.ArrayList;
import java.util.Iterator;


public class SupremeCouncil {
    private String supremeName;
    private static SupremeCouncil instance;
    ArrayList<Faction> factions = new ArrayList<Faction>();


    private SupremeCouncil(String supremeName, ArrayList<Faction> factions) {
        this.supremeName = supremeName;
        this.factions = factions;
    }

    public static SupremeCouncil getInstance() {
        if (instance == null) {
            instance = new SupremeCouncil("SomeName", new ArrayList<Faction>());
        }
        return instance;
    }

    public void addFaction(String factionName) {
        factions.add(new Faction(factionName, new ArrayList<Deputy>()));
        System.out.println("Faction " + factionName.toString() + " was added to Supreme Council");
    }

    public void deleteFaction(String factionName) {
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction nextFaction = iterator.next();
            if (nextFaction.getFactionName().equalsIgnoreCase(factionName)) {
                iterator.remove();
                System.out.println("Faction " + nextFaction.toString() + " was deleted from Supreme Council");
            }
        }
    }

    public void getAllFactions() {
        factions.forEach(System.out::println);
    }

    public void clearFaction(String factionName) {
        factions.forEach(faction -> {
            if(faction.getFactionName().equalsIgnoreCase(factionName)) {
                faction.clearFaction();
            }
        });
    }

    public void getFaction(String factionName) {
        factions.forEach(faction -> {
            if(faction.getFactionName().equalsIgnoreCase(factionName)) {
                faction.showAllDeputies();
            }
        });
    }

    public void addDeputyToFaction(String deputyFirstName, String deputyLastName, String factionName) {
        factions.forEach(faction -> {
           if(faction.getFactionName().equalsIgnoreCase(factionName)) {
               faction.addDeputy(deputyFirstName, deputyLastName);
           }
           else {
               System.out.println("This faction don't exist");
           }
        });
    }

    public void removeDeputyFromFaction(String deputyFirstName, String deputyLastName, String factionName) {
        factions.forEach(faction -> {
            if(faction.getFactionName().equalsIgnoreCase(factionName)) {
                faction.removeDeputy(deputyFirstName, deputyLastName);
            }
            else {
                System.out.println("This faction don't exist");
            }
        });
    }

    public void getBribersFromFaction(String factionName) {
        factions.forEach(faction -> {
            if(faction.getFactionName().equalsIgnoreCase(factionName)) {
                faction.showBribers();
            }
        });
    }
    public void getLargestBriberFromFaction(String factionName) {
        factions.forEach(faction -> {
            if(faction.getFactionName().equalsIgnoreCase(factionName)) {
                faction.getLargestBriber();
            }
        });
    }

    public void getAllDeputiesFromFaction(String factionName) {
        factions.forEach(faction -> {
           if(faction.getFactionName().equalsIgnoreCase(factionName)) {
               faction.showAllDeputies();
           }
        });
    }

    public void giveBribe(int bribeAmount, String deputyFirstName, String deputyLastName, String factionName) {
        factions.forEach(faction -> {
            if(faction.getFactionName().equalsIgnoreCase(factionName)) {
                faction.giveBribe(bribeAmount, deputyFirstName, deputyLastName);
            }
        });
    }
}