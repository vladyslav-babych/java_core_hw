package hw_lesson12.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List list = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        boolean app = true;
        while (app) {
            System.out.println("Enter 1 to add object");
            System.out.println("Enter 2 to delete object by index");
            System.out.println("Enter 3 to show all objects");
            System.out.println("Enter 'exit' to exit application");
            System.out.print("Type here >> ");
            switch (scanner.next()) {
                case"1": {
                    System.out.print("Enter object here >> ");
                    String obj = scanner.next();
                    list.add(obj);
                    break;
                }
                case"2": {
                    if(list.isEmpty()) {
                        System.out.println("List is empty");
                    }
                    else {
                        System.out.print("Enter index here >> ");
                        int index = scanner.nextInt();
                        list.remove(index);
                    }
                    break;
                }
                case"3": {
                    if(list.isEmpty()) {
                        System.out.println("List is empty");
                    }
                    else {
                        for (Object o : list) {
                            System.out.println(o);
                        }
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
}
