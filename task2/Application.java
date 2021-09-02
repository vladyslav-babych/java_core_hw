package hw_lesson11.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(0, 0);
        int rows = getRandomValueFromRange(3, 5);
        int columns = getRandomValueFromRange(3, 5);
        Car [][] array = new Car[rows][columns];
        boolean app = true;


        Scanner scanner = new Scanner(System.in);
        while(app) {
            System.out.println("Enter 1 to show toString()");
            System.out.println("Enter 2 to fill array with same object");
            System.out.println("Enter 'exit' to exit application");
            System.out.print("Type here >> ");
            switch(scanner.next()){
                case "1": {
                    for(int i = 0; i < rows; i++) {
                        for(int j = 0; j < columns; j++) {
                            array[i][j] = new Car(getRandomValueFromRange(200, 600), getRandomValueFromRange(2000, 2021));
                        }
                    }
                    System.out.println(Arrays.deepToString(array));
                    break;
                }
                case"2": {
                    for(Car[] obj : array) {
                        Arrays.fill(array, obj);
                    }
                    System.out.println(Arrays.deepToString(array));
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
