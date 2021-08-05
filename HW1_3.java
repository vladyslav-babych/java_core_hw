package Java.HW1;

public class HW1_3 {
    public static void main(String[] args) {
        
        int [] arr = {3, 2, 4, 5, 1, 8, 6, 10, 7, 9};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max value is >> " + max);

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min value is >> " + min);
    }
}
