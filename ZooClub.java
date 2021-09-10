package hw_lesson15;

import java.util.*;
import java.util.Iterator;

public class ZooClub {
    public static void main(String[] args) {
        Map<Person, List<Pet>> map = new HashMap<>();

        map.put(new Person("Andrew", 20), new ArrayList<>());
        map.put(new Person("Ryuk", 45), new ArrayList<>());
        map.put(new Person("Leonardo", 58), new ArrayList<>());
        map.put(new Person("Mike", 24), new ArrayList<>());
        map.put(new Person("Lumine", 19), new ArrayList<>());

        Scanner scanner = new Scanner(System.in);
        boolean app = true;
        while(app) {
            menu();
            switch (scanner.next()) {
                case "1": {
                    System.out.print("Enter person name >> ");
                    String name = scanner.next();
                    System.out.print("Enter person age >> ");
                    int age = scanner.nextInt();
                    map.put(new Person(name, age), new ArrayList<>());
                    break;
                }
                case "2": {
                    Iterator<Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();

                    while(iterator.hasNext()) {
                        Map.Entry<Person, List<Pet>> next = iterator.next();
                        System.out.print("Enter person name who you want to add a pet >> ");
                        String name = scanner.next();

                        System.out.print("Enter person age who you want to add a pet >> ");
                        int age = scanner.nextInt();

                        if(next.getKey().equals(new Person(name, age))) {
                            System.out.print("Enter pet type (cat/dog/...) >> ");
                            String petType = scanner.next();

                            System.out.print("Enter pet name >> ");
                            String petName = scanner.next();

                            Pet pet = new Pet(petType, petName);

                            List<Pet> value = next.getValue();
                            value.add(pet);
                            next.setValue(value);
                        }
                        else {
                            throw new InputMismatchException("You entered wrong person name or age or this person doesn't exist");
                        }
                        break;
                    }
                    break;
                }
                case "3": {
                    Iterator<Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();

                    while(iterator.hasNext()) {
                        Map.Entry<Person, List<Pet>> next = iterator.next();
                        System.out.print("Enter person name who you want to remove a pet >> ");
                        String name = scanner.next();

                        System.out.print("Enter person age who you want to remove a pet >> ");
                        int age = scanner.nextInt();

                        if(next.getKey().equals(new Person(name, age))) {
                            System.out.print("Enter pet type (cat/dog/...) >> ");
                            String petType = scanner.next();

                            System.out.print("Enter pet name >> ");
                            String petName = scanner.next();

                            Pet pet = new Pet(petType, petName);

                            List<Pet> value = next.getValue();
                            value.remove(pet);
                            next.setValue(value);
                        }
                        else {
                            throw new InputMismatchException("You entered wrong person name or age or this person doesn't exist");
                        }
                        break;
                    }
                    break;
                }
                case "4": {
                    System.out.print("Enter person name >> ");
                    String name = scanner.next();
                    System.out.print("Enter person age >> ");
                    int age = scanner.nextInt();
                    map.remove(new Person(name, age), new ArrayList<>());
                    break;
                }
                case "5": {
                    Iterator<Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();

                    while(iterator.hasNext()) {
                        Map.Entry<Person, List<Pet>> next = iterator.next();

                        System.out.print("Enter pet type (cat/dog/...) >> ");
                        String petType = scanner.next();

                        System.out.print("Enter pet nam >> ");
                        String petName = scanner.next();

                        Pet pet = new Pet(petType, petName);

                        List<Pet> value = next.getValue();
                        value.remove(pet);
                        next.setValue(value);

                        break;
                    }
                    break;
                }
                case "6": {
                    System.out.println(map);
                    break;
                }
                case "exit": {
                    app = false;
                    break;
                }
                default: {
                    System.out.println("You entered something wrong");
                    break;
                }
            }
        }
    }

    static void menu() {
        System.out.println("Enter 1 to add club member");
        System.out.println("Enter 2 to add pet to club member");
        System.out.println("Enter 3 to remove pet from club member");
        System.out.println("Enter 4 to remove club member");
        System.out.println("Enter 5 to remove certain pet from all club members");
        System.out.println("Enter 6 to show all club");
        System.out.println("Enter 'exit' to exit application");
        System.out.print("Type here >> ");
    }
}



