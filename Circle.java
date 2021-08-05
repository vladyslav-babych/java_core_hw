package Java.HW2;

public class Circle {
    private float radius;
    private float diameter;

    Circle() {
        this.radius = 5.0f;
        this.diameter = radius * 2;
    }

    Circle(float radius, float diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getSquare() {
        float square = 3.14f * ((diameter/2) * (diameter/2));
        return square;
    }

    public float getLength() {
        float lenght = 2 * 3.14f * radius;
        return lenght;
    }

    public String toString() {
        return "Circle [Radius >> " + radius + ", Diameter >> " + diameter + ", Square >> " + getSquare() + ", Length >> " + getLength() + "]";
    }
}
