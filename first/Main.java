package hw_lesson22.first;

public class Main {
    public static void main(String[] args) {
        Pet cat = message -> System.out.println(message);
        Pet dog = message -> System.out.println(message);
        Pet cow = message -> System.out.println(message);

        cat.voice("I'm a cat Meow-Meow!!!");
        dog.voice("I'm a dog Bark-Bark!!!");
        cow.voice("I'm a cow Moo-Moo!!!");
    }
}

interface Pet {
    void voice(String msg);
}