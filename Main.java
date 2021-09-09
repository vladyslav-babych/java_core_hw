package hw_lesson14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Keyboard> keyboardSet = new HashSet<>();

        keyboardSet.add(new Keyboard("Razer", "BlackWidow", "Mechanical", "Green", 20.1, 49.1, 1.67));
        keyboardSet.add(new Keyboard("Hator", "RockfallEvoTKL", "Optical", "Black", 13.3, 36.0, 0.73));
        keyboardSet.add(new Keyboard("Logitech", "GProGX", "Mechanical", "Brown", 15.3, 36.1, 1.00));
        keyboardSet.add(new Keyboard("Varmilo", "VA87M", "Mechanical", "Red", 13.4, 35.6, 0.85));
        System.out.println("Before sorting");
        for (Keyboard k : keyboardSet) {
            System.out.println(k);
        }

        TreeSet<Keyboard> keyboardSet2 = new TreeSet<>(new KeyboardAllFieldsComparator());

        keyboardSet2.add(new Keyboard("Razer", "BlackWidow", "Mechanical", "Green", 20.1, 49.1, 1.67));
        keyboardSet2.add(new Keyboard("Hator", "RockfallEvoTKL", "Optical", "Black", 13.3, 36.0, 0.73));
        keyboardSet2.add(new Keyboard("Logitech", "GProGX", "Mechanical", "Brown", 15.3, 36.1, 1.00));
        keyboardSet2.add(new Keyboard("Varmilo", "VA87M", "Mechanical", "Red", 13.4, 35.6, 0.85));
        System.out.println();
        System.out.println("After sorting");
        for (Keyboard k : keyboardSet2) {
            System.out.println(k);
        }



    }
}
