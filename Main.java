package Java.HW2;

public class Main {
    public static void main(String[] args) {
        
        // Rectangle

        Rectangle r1 = new Rectangle();
        System.out.println(r1);

        Rectangle r2 = new Rectangle(6.2f, 10.9f);
        System.out.println(r2);

        r1.setWidth(5.0f);
        r1.setHeight(10.0f);
        System.out.println(r1);

        // Circle          
        System.out.println();

        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(2.2f, 4.4f);
        System.out.println(c2);

        c1.setRadius(10.0f);
        c1.setDiameter(20.0f);
        System.out.println(c1);
    }
}
