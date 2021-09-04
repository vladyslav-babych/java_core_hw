package hw_lesson12.task1;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List list = new ArrayList();



        boolean app = true;
        Scanner scanner = new Scanner(System.in);
        while(app) {
            System.out.println("Enter 1 to show all objects");
            System.out.println("Enter 2 to fill ArrayList with same object");
            System.out.println("Enter 'exit' to exit application");
            System.out.print("Type here >> ");
            switch(scanner.next()){
                case "1": {
                    list.add(new Car(getRandomValueFromRange(200, 600), getRandomValueFromRange(2000, 2021)));
                    list.add(new Car(getRandomValueFromRange(200, 600), getRandomValueFromRange(2000, 2021)));
                    list.add(new Car(getRandomValueFromRange(200, 600), getRandomValueFromRange(2000, 2021)));
                    list.add(new Car(getRandomValueFromRange(200, 600), getRandomValueFromRange(2000, 2021)));
                    list.add(new Car(getRandomValueFromRange(200, 600), getRandomValueFromRange(2000, 2021)));
                    list.add(new Car(getRandomValueFromRange(200, 600), getRandomValueFromRange(2000, 2021)));
                    for (Object o : list) {
                        System.out.println(o);
                    }
                    break;
                }
                case"2": {
                    list.add(new Car(getRandomValueFromRange(200, 600), getRandomValueFromRange(2000, 2021)));
                    list.add(list.get(0));
                    list.add(list.get(0));
                    list.add(list.get(0));
                    list.add(list.get(0));
                    list.add(list.get(0));
                    for (Object o : list) {
                        System.out.println(o);
                    }
                    break;
                }
                case"exit": {
                    app = false;
                    break;
                }
                default: {
                    System.out.println("You entered something wrong, try again");
                    break;
                }
            }
        }
    }

    public static int getRandomValueFromRange(int min, int max) {
        if(min >= max) {
            throw new IllegalArgumentException("Min value can't be higher than max value");
        }
        Random r = new Random();
        return r.nextInt(max - min + 1) + min; // 1 - 10
    }
}
