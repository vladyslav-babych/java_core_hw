package hw_lesson23;

public class Person {
    private int weight;
    private int height;

    public Person() {
        this.weight = (int) (Math.random() * 50 + 100);
        this.height = (int) (Math.random() * 160 + 200);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
