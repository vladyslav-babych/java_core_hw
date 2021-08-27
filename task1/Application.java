/*
* Logos It Academy java core homework from lesson 09
* */


package HW_lesson09.task1;

import java.util.Scanner;


/**
 * @since java 1.8
 * @author Vlad
 * @version 1.1
 * */
public class Application {
    /* enum including seasons */
    enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    /* enum including months */
    enum Month {
        DECEMBER(Season.WINTER, 31), JANUARY(Season.WINTER, 31), FEBRUARY(Season.WINTER, 28),
        MARCH(Season.SPRING, 31), APRIL(Season.SPRING, 30), MAY(Season.SPRING, 31),
        JUNE(Season.SUMMER, 30), JULY(Season.SUMMER, 31), AUGUST(Season.SUMMER, 31),
        SEPTEMBER(Season.FALL, 30), OCTOBER(Season.FALL, 31), NOVEMBER(Season.FALL, 30);

        Season season;
        int days;

        private Month(Season season, int days) {
            this.season = season;
            this.days = days;
        }

        public Season getSeason() {
            return this.season;
        }

        public int getDays() {
            return this.days;
        }
    }

    /* menu interface */
    static void menu() {
        System.out.println("Enter 1 to check existence of this month");
        System.out.println("Enter 2 to show all months with same season");
        System.out.println("Enter 3 to show all months with same days amount");
        System.out.println("Enter 4 to show all months with less days");
        System.out.println("Enter 5 to show all months with more days");
        System.out.println("Enter 6 to show next season");
        System.out.println("Enter 7 to show previous season");
        System.out.println("Enter 8 to show all months with pair days");
        System.out.println("Enter 9 to show all months with odd days");
        System.out.println("Enter 10 to show if month have pair days");
        System.out.println("Enter 'exit' to exit from application");
        System.out.print("Type here >> ");
    }

    public static void main(String[] args) throws WrongInputConsoleParametersException {
        /* months array */
        Month [] monthArr = Month.values();

        /* seasons array */
        Season [] seasonArr = Season.values();

        /* scanner for menu cases */
        Scanner scanner = new Scanner(System.in);

        /* boolean variable for endless while cycle */
        boolean app = true;


        while(app){
            /* prints menu interface */
            menu();

            /* switch-case construction */
            switch (scanner.next()) {
                case "1": {
                    System.out.print("Enter month >> ");
                    scanner = new Scanner(System.in);
                    String month = scanner.next().toUpperCase();
                    boolean flag = isMonthPresent(monthArr, month);

                    if(!flag) {
                        throw new WrongInputConsoleParametersException("This month doesn't exist");
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter season >> ");
                    scanner = new Scanner(System.in);
                    String seasonScanner = scanner.next().toUpperCase();

                    boolean flag = false;

                    for (Month m : monthArr) {
                        if (m.getSeason().name().equals(seasonScanner)) {
                            flag = true;
                        }
                    }

                    if (flag) {
                        for(Month month : monthArr) {
                            if(month.getSeason().toString().equalsIgnoreCase(seasonScanner)) {
                                System.out.println(month);
                            }
                        }
                    }

                    if(!flag) {
                        throw new WrongInputConsoleParametersException("This season doesn't exist");
                    }
                    break;
                }
                case "3": {
                    System.out.print("Enter days amount >> ");
                    scanner = new Scanner(System.in);
                    String daysScanner = scanner.next();

                    boolean flag = false;

                    for (Month days : Month.values()) {
                        if (Integer.toString(days.getDays()).equals(daysScanner)) {
                            flag = true;
                        }
                    }

                    if (flag) {
                        for(Month days : Month.values()) {
                            if(Integer.toString(days.getDays()).equals(daysScanner)) {
                                System.out.println(days);
                            }
                        }
                    }

                    if(!flag) {
                        throw new WrongInputConsoleParametersException("This days amount doesn't exist");
                    }
                    break;
                }
                case "4": {
                    for (Month days : Month.values()) {
                        if (days.getDays() != 31) {
                            System.out.println(days);
                        }
                    }
                    break;
                }
                case "5": {
                    for (Month days : Month.values()) {
                        if (days.getDays() == 31) {
                            System.out.println(days);
                        }
                    }
                    break;
                }
                case "6": {
                    System.out.print("Enter Season >> ");
                    scanner = new Scanner(System.in);
                    String season = scanner.next().toUpperCase();

                    boolean flag = isSeasonPresent(seasonArr, season);

                    if(flag) {
                        Season season1 = Season.valueOf(season);
                        int ordinal = season1.ordinal();
                        if(ordinal == seasonArr.length - 1) {
                            ordinal = 0;
                            System.out.println(seasonArr[ordinal]);
                        }
                        else{
                            System.out.println(seasonArr[ordinal + 1]);
                        }
                    }

                    if(!flag) {
                        throw new WrongInputConsoleParametersException("This season doesn't exist");
                    }
                    break;
                }
                case "7": {
                    System.out.print("Enter Season >> ");
                    scanner = new Scanner(System.in);
                    String season = scanner.next().toUpperCase();

                    boolean flag = isSeasonPresent(seasonArr, season);

                    if(flag) {
                        Season season1 = Season.valueOf(season);
                        int ordinal = season1.ordinal();
                        if(ordinal == seasonArr.length - 1) {
                            ordinal = 0;
                            System.out.println(seasonArr[ordinal]);
                        }
                        else{
                            System.out.println(seasonArr[ordinal - 1]);
                        }
                    }

                    if(!flag) {
                        throw new WrongInputConsoleParametersException("This season doesn't exist");
                    }
                    break;
                }
                case "8": {
                    for (Month days : Month.values()) {
                        if (days.getDays() % 2 == 0) {
                            System.out.println(days);
                        }
                    }
                    break;
                }
                case "9": {
                    for (Month days : Month.values()) {
                        if (days.getDays() % 2 != 0) {
                            System.out.println(days);
                        }
                    }
                    break;
                }
                case "10": {
                    System.out.print("Enter month >> ");
                    scanner = new Scanner(System.in);
                    String month = scanner.next().toUpperCase();

                    boolean flag = true;

                    for(Month m : monthArr) {
                        if(m.name().equals(month)) {
                            flag = false;
                            if(Integer.toString(m.getDays()).equals("30") | Integer.toString(m.getDays()).equals("28")) {
                                System.out.println("Month have pair days");
                            }
                            else{
                                System.out.println("Month have odd days");
                            }
                        }
                    }
                    if(flag) {
                        throw new WrongInputConsoleParametersException("Month doesn't exist");
                    }
                    break;
                }
                case "exit": {
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

    /* method that check if month exists */
    private static boolean isMonthPresent(Month[] monthArr, String month) {
        boolean flag = false;
        for(Month m : monthArr) {
            if(m.name().equals(month)) {
                System.out.println("Month exists");
                flag = true;
            }
        }
        return flag;
    }

    /* method that check if season exists */
    private static boolean isSeasonPresent(Season[] seasonArr, String season) {
        boolean flag = false;
        for(Season s : seasonArr) {
            if(s.toString().equals(season)) {
                System.out.println("Season exists");
                flag = true;
            }
        }
        return flag;
    }
}
