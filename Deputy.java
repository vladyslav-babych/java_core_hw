package hw_lesson13;

import java.util.Scanner;

public class Deputy extends Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean briber;
    private int bribeAmount;

    public Deputy(String firstName, String lastName, int age, int weight, int height,  boolean briber) {
        super(weight, height);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.briber = briber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBriber() {
        return briber;
    }

    public String briberToString() {
        if (this.briber) {
            return "Deputy is briber";
        }
        else {
            return "Deputy is not briber";
        }
    }

    public void setBriber(boolean briber) {
        this.briber = briber;
    }

    public int getBribeAmount() {
        return bribeAmount;
    }

    public void setBribeAmount(int bribeAmount) {
        this.bribeAmount = bribeAmount;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", briber=" + briber +
                ", bribeAmount=" + bribeAmount +
                '}';
    }

    public void giveBribe() {
        if(!this.briber) {
            System.out.println("Deputy don't take bribes");
        }
        if(this.briber) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter bribe amount you want to give >> ");
            int bribeSize = scanner.nextInt();
            if(bribeSize >= 5000) {
                System.out.println("Police will arrest deputy");
            }
            else {
                this.bribeAmount = bribeSize;
            }
        }
    }
}
