package hw_lesson22.third;

public class Main {

    public static void main(String[] args) {
        Frog f = new Frog();
        f.eat("Amphibia is eating");
        f.sleep("Amphibia is sleeping");
        f.swim("Amphibia is swimming");
        f.walk("Amphibia is walking");
    }
}

interface Amphibia {
    void eat(String msg);
    void sleep(String msg);
    void swim(String msg);
    void walk(String msg);
}
