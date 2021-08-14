package Java.HW_lesson06.task2.interface2;

import Java.HW_lesson06.task2.interface1.Numerable;

public class MyCalculator implements Numerable {
    int a = 1;
    int b = 1;
    int c;

    @Override
    public void plus() {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);        
    }

    @Override
    public void minus() {
        int c = a - b;
        System.out.println(a + " - " + b + " = " + c);        
    }

    @Override
    public void multiply() {
        int c = a * b;
        System.out.println(a + " * " + b + " = " + c);        
    }

    @Override
    public void divide() {
        int c = a / b;
        System.out.println(a + " : " + b + " = " + c);        
    }
}
