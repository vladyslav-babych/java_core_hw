package hw_lesson10.task3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string >> ");
        String someString = scanner.nextLine();

        int wordCount = 0;

        boolean isWord = false;
        int endOfLine = someString.length() - 1;
        char[] characters = someString.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;
            }
            else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;
            }
            else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }
        System.out.println("Words in string >> " + wordCount);
    }
}
