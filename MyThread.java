package hw_lesson20;

import java.util.Scanner;

public class MyThread extends Thread {
    private int delay;

    public MyThread(int delay) {
        this.delay = delay;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers amount for default order >> ");
        int numbersAmount = scanner.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Thread: " );
        for (int i = 1; i <= numbersAmount; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            try {
                Thread.sleep(delay);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread(1000);
        myThread.start();
    }
}