package hw_lesson10.task2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string >> ");
        String someString = scanner.nextLine();

        someString = someString.replaceAll("[aeiouAEIOU]", "-");
        System.out.println(someString);
    }
}
