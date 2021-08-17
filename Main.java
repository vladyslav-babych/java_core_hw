package Java.HW_lesson07;

public class Main {
    public static void main(String[] args) {
        Cy_27 plane = new Cy_27(1000, "Blue, Lightgray");
        PlaneControl movement = new PlaneControl();

        System.out.println("-------------------------------------------");
        
        plane.engineStart();
        System.out.println("-------------------------------------------");
        
        plane.planeTakeoff();
        System.out.println("-------------------------------------------");
        
        movement.moveUp();
        System.out.println("-------------------------------------------");

        movement.moveLeft();
        System.out.println("-------------------------------------------");

        movement.moveDown();
        System.out.println("-------------------------------------------");

        movement.moveRight();
        System.out.println("-------------------------------------------");
        
        plane.stealthTechnology();
        System.out.println("-------------------------------------------");
        
        plane.nuclearStrike();
        System.out.println("-------------------------------------------");
       
        plane.turboAcceleration();
        System.out.println("-------------------------------------------");
        
        System.out.println("Plane is going back");
        System.out.println("-------------------------------------------");
        
        plane.planeLanding();
        System.out.println("-------------------------------------------");

        
    }
}
