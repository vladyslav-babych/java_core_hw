package hw_lesson23;

import java.util.Scanner;
import java.util.Random;

public class Deputy extends Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean briber;
    private int bribeAmount = 0;

    public Deputy(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = (int) (Math.random() * 55 + 35);
        this.briber = new Random().nextBoolean();
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

    public void takeBribe(int bribe) {
        if(!this.briber) {
            System.out.println("Deputy" + getFirstName() + " " + getLastName() + " don't take bribes");
        }
        if(this.briber) {
            if(bribe >= 5000) {
                System.out.println("Police will arrest deputy");
            }
            else {
                this.bribeAmount = bribeAmount + bribe;
                System.out.println("Deputy " + getFirstName() + " " + getLastName() + " took bribe of " + bribe + "$");
            }
        }
    }
}