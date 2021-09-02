package hw_lesson11.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Integer [] intArray = new Integer[50];
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = getRandomValueFromRange(-50, 51);
        }
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(intArray));

        System.out.println("After sorting asc");
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        System.out.println("After sorting desc");
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(intArray));
    }

    public static int getRandomValueFromRange(int min, int max) {
        if(min >= max) {
            throw new IllegalArgumentException("Min value can't be higher than max value");
        }
        Random r = new Random();
        return r.nextInt(max - min + 1) + min; // 1 - 10
    }
}

