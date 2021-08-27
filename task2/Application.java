package HW_lesson09.task2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws MyException, IllegalAccessException {
        Methods m = new Methods();
        Scanner scanner = new Scanner(System.in);
        boolean app = true;

        while(app) {
            Methods.menu();
            switch (scanner.next()) {
                case "1": {
                    System.out.println("Enter 1 to show where a < 0 and b < 0");
                    System.out.println("Enter 2 to show where (a = 0 and b != 0) or (a != 0 and b = 0)");
                    System.out.println("Enter 3 to show where a = 0 and b = 0");
                    System.out.println("Enter 4 to show where a > 0 and b > 0");
                    System.out.print("Type here >> ");
                    switch (scanner.next()) {
                        case "1": {
                            int a;
                            int b;
                            m.setA(-1);
                            m.setB(-1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.addition(a, b);
                            break;
                        }
                        case "2": {
                            int a;
                            int b;
                            m.setA(0);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.addition(a, b);
                            break;
                        }
                        case "3": {
                            int a;
                            int b;
                            m.setA(1);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.addition(a, b);
                            break;
                        }
                        case "4": {
                            int a;
                            int b;
                            m.setA(-1);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.addition(a, b);
                            break;
                        }
                        default: {
                            System.out.println("You entered something wrong");
                            break;
                        }
                    }
                }
                case "2": {
                    System.out.println("Enter 1 to show where a < 0 and b < 0");
                    System.out.println("Enter 2 to show where (a = 0 and b != 0) or (a != 0 and b = 0)");
                    System.out.println("Enter 3 to show where a = 0 and b = 0");
                    System.out.println("Enter 4 to show where a > 0 and b > 0");
                    System.out.print("Type here >> ");
                    switch (scanner.next()) {
                        case "1": {
                            int a;
                            int b;
                            m.setA(-1);
                            m.setB(-1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.subtraction(a, b);
                            break;
                        }
                        case "2": {
                            int a;
                            int b;
                            m.setA(0);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.subtraction(a, b);
                            break;
                        }
                        case "3": {
                            int a;
                            int b;
                            m.setA(1);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.subtraction(a, b);
                            break;
                        }
                        case "4": {
                            int a;
                            int b;
                            m.setA(-1);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.subtraction(a, b);
                            break;
                        }
                        default: {
                            System.out.println("You entered something wrong");
                            break;
                        }
                    }
                }
                case "3": {
                    System.out.println("Enter 1 to show where a < 0 and b < 0");
                    System.out.println("Enter 2 to show where (a = 0 and b != 0) or (a != 0 and b = 0)");
                    System.out.println("Enter 3 to show where a = 0 and b = 0");
                    System.out.println("Enter 4 to show where a > 0 and b > 0");
                    System.out.print("Type here >> ");
                    switch (scanner.next()) {
                        case "1": {
                            int a;
                            int b;
                            m.setA(-1);
                            m.setB(-1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.multiplication(a, b);
                            break;
                        }
                        case "2": {
                            int a;
                            int b;
                            m.setA(0);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.multiplication(a, b);
                            break;
                        }
                        case "3": {
                            int a;
                            int b;
                            m.setA(1);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.multiplication(a, b);
                            break;
                        }
                        case "4": {
                            int a;
                            int b;
                            m.setA(-1);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.multiplication(a, b);
                            break;
                        }
                        default: {
                            System.out.println("You entered something wrong");
                            break;
                        }
                    }
                }
                case "4": {
                    System.out.println("Enter 1 to show where a < 0 and b < 0");
                    System.out.println("Enter 2 to show where (a = 0 and b != 0) or (a != 0 and b = 0)");
                    System.out.println("Enter 3 to show where a = 0 and b = 0");
                    System.out.println("Enter 4 to show where a > 0 and b > 0");
                    System.out.print("Type here >> ");
                    switch (scanner.next()) {
                        case "1": {
                            int a;
                            int b;
                            m.setA(-1);
                            m.setB(-1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.division(a, b);
                            break;
                        }
                        case "2": {
                            int a;
                            int b;
                            m.setA(0);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.division(a, b);
                            break;
                        }
                        case "3": {
                            int a;
                            int b;
                            m.setA(1);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.division(a, b);
                            break;
                        }
                        case "4": {
                            int a;
                            int b;
                            m.setA(-1);
                            m.setB(1);
                            a = m.getA();
                            b = m.getB();
                            System.out.println("a = " + a + " b = " + b);
                            Methods.division(a, b);
                            break;
                        }
                        default: {
                            System.out.println("You entered something wrong");
                            break;
                        }
                    }
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
}
