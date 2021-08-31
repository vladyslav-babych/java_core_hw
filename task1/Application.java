package hw_lesson10.task1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word >> ");
        String input = scanner.next();

        StringBuffer sb = new StringBuffer(input);

        String reversed = sb.reverse().toString();
        int firstHalfLength = sb.length() / 2;
        int secondHalfLength = reversed.length() / 2;

        System.out.println("First half of word >> " + input.substring(0, firstHalfLength));
        System.out.println("Second half of world >> " + reversed.substring(0, secondHalfLength));

        String firstHalf = input.substring(0, firstHalfLength);
        String secondHalf = reversed.substring(0, secondHalfLength);

        if(firstHalf.equalsIgnoreCase(secondHalf)) {
            System.out.println("Word is palindrome");
        }
        else {
            System.out.println("Word is not palindrome");
        }
    }
}
