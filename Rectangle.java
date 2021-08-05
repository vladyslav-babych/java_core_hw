package Java.HW2;

public class Rectangle {

    private float width;
    private float height;
    
    Rectangle() {
        this.width = 5.5f;
        this.height = 7.5f;
    }

    Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }
    
    public void setWidth(float width) {
        this.width = width;
    }
    
    public float getHeight() {
        return height;
    }
    
    public void setHeight(float height) {
        this.height = height;
    }
    
    public float getSquare() {
        float square = width * height;
        return square;
    }
    
    public float getPerimeter() {
        float perimeter = width * 2 + height * 2;
        return perimeter;
    }

    public String toString() {
        return "Rectangle [Width >> " + width + ", Height >> " + height + ", Square >> " + getSquare() + ", Perimeter >> " + getPerimeter() + "]";
    }
}
