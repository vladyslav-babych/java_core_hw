package Java.HW_lesson06.task2.interface1;

import Java.HW_lesson06.task2.Divide;
import Java.HW_lesson06.task2.Minus;
import Java.HW_lesson06.task2.Multiply;
import Java.HW_lesson06.task2.Plus;
import Java.HW_lesson06.task2.interface2.MyCalculator;

public interface Numerable extends Plus, Minus, Multiply, Divide {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        mc.plus();
        mc.minus();
        mc.multiply();
        mc.divide();   
    }
}
