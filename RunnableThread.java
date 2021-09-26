package hw_lesson20;

import java.util.Scanner;

public class RunnableThread implements Runnable {
    private int delay;

    public RunnableThread(int delay) {
        this.delay = delay;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers amount for reversed order >> ");
        int numbersAmount = scanner.nextInt();
        int [] fibArr = new int[numbersAmount];
        fibArr[0] = 0;
        fibArr[1] = 1;

        for(int i = 2; i < numbersAmount; i++) {
            fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
        }

        System.out.print("Runnable: " );
        for(int i = numbersAmount - 1; i >= 0; i--) {
            System.out.print(fibArr[i] + " ");
            try {
                Thread.sleep(delay);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        RunnableThread myRunnable = new RunnableThread(1000);
        myRunnable.run();
    }
}
