package Java.HW_lesson05.third;

public class Amphibia {
    void eat() {
        System.out.println("Amphibia is eating");
    }

    void sleep() {
        System.out.println("Amphibia is sleeping");
    }

    void swim() {
        System.out.println("Amphibia is swimming");
    }

    void walk() {
        System.out.println("Amphibia is walking");
    }

    public static void main(String[] args) {
        Frog f = new Frog();
        f.eat();
        f.sleep();
        f.swim();
        f.walk();
    }
}
