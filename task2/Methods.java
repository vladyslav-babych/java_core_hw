package HW_lesson09.task2;

import java.util.Scanner;

public class Methods {
    int a;
    int b;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    static void menu() {
        System.out.println("Enter 1 to make addition");
        System.out.println("Enter 2 to make subtraction");
        System.out.println("Enter 3 to make multiplication");
        System.out.println("Enter 4 to make division");
        System.out.println("Enter 'exit' to exit application");
        System.out.print("Type here >> ");
    }
    static void variableMenu() {
        System.out.println("Enter 1 to show where a < 0 and b < 0");
        System.out.println("Enter 2 to show where (a = 0 and b != 0) or (a != 0 and b = 0)");
        System.out.println("Enter 3 to show where a = 0 and b = 0");
        System.out.println("Enter 4 to show where a > 0 and b > 0");
        System.out.print("Type here >> ");
    }

    static void addition(int a, int b) throws IllegalAccessException, MyException {
        if(a < 0 && b < 0) {
            throw new IllegalArgumentException();
        }
        else if ((a == 0 && b != 0) | (a != 0 && b == 0)) {
            throw new IllegalArgumentException();
        }
        else if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        }
        else if (a > 0 && b > 0) {
            throw new MyException("a and b are higher than 0");
        }
        else {
            int c = a + b;
            System.out.println("a + b = " + c);
        }
    }

    static void subtraction(int a, int b) throws IllegalAccessException, MyException {
        if(a < 0 && b < 0) {
            throw new IllegalArgumentException();
        }
        else if ((a == 0 && b != 0) | (a != 0 && b == 0)) {
            throw new IllegalArgumentException();
        }
        else if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        }
        else if (a > 0 && b > 0) {
            throw new MyException("a and b are higher than 0");
        }
        else {
            int c = a - b;
            System.out.println("a - b = " + c);
        }
    }

    static void multiplication(int a, int b) throws IllegalAccessException, MyException {
        if(a < 0 && b < 0) {
            throw new IllegalArgumentException();
        }
        else if ((a == 0 && b != 0) | (a != 0 && b == 0)) {
            throw new IllegalArgumentException();
        }
        else if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        }
        else if (a > 0 && b > 0) {
            throw new MyException("a and b are higher than 0");
        }
        else {
            int c = a * b;
            System.out.println("a * b = " + c);
        }
    }

    static void division(int a, int b) throws IllegalAccessException, MyException {
        if(a < 0 && b < 0) {
            throw new IllegalArgumentException();
        }
        else if ((a == 0 && b != 0) | (a != 0 && b == 0)) {
            throw new IllegalArgumentException();
        }
        else if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        }
        else if (a > 0 && b > 0) {
            throw new MyException("a and b are higher than 0");
        }
        else {
            int c = a / b;
            System.out.println("a : b = " + c);
        }
    }

    }
