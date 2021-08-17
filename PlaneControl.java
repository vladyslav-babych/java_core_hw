package Java.HW_lesson07;


public class PlaneControl {
    int min = 0;
    int max = 50;

    void moveUp() {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Plane moved UP on " + random_int + " km");
    }

    void moveDown() {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Plane moved DOWN on " + random_int + " km");
    }

    void moveLeft() {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Plane moved LEFT on " + random_int + " km");
    }

    void moveRight() {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Plane moved RIGHT on " + random_int + " km");
    }
}
