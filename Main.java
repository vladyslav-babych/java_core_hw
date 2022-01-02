package hw_lesson24;

import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("Enter 1 to add film to library");
        System.out.println("Enter 2 to add film seance");
        System.out.println("Enter 3 to remove film");
        System.out.println("Enter 4 to remove film seance");
        System.out.println("Enter 5 to exit program");
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            menu();

            switch (scanner.next()) {
                case "1": {
                    cinema.addMovie();
                    break;
                }
                case "2": {
                    cinema.addSeance();
                    break;
                }
                case "3": {
                    cinema.removeMovie();
                    break;
                }
                case "4": {
                    cinema.removeSeance();
                    break;
                }
                case "5": {
                    flag = false;
                    break;
                }
            }
        }
    }
}
