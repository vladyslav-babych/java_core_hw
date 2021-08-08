package Java.HW_lesson04.second;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Leopard", 20, 7);
        System.out.println("Animal name >> " + a.getAnimalName() + ", Animal speed >> " + a.getAnimalSpeed() + " km/h, Animal age >> " + a.getAnimalAge());
        
        System.out.println("-------------------------------------------------------------------");
    
        a.setAnimalName("Bool");
        a.setAnimalSpeed(2);
        a.setAnimalAge(14);
        System.out.println("Animal name >> " + a.getAnimalName() + ", Animal speed >> " + a.getAnimalSpeed() + " km/h , Animal age >> " + a.getAnimalAge());
    }
}