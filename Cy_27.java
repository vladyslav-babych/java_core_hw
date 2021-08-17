package Java.HW_lesson07;

public class Cy_27 extends Plane implements SpecialAbilities {
    int maxSpeed;
    String color;
    
    public Cy_27(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void turboAcceleration() {
        int random_int = (int)Math.floor(Math.random()*(1500-1001+1)+1001);
        System.out.println("Turbo acceleration turned on and now flying with speed " + random_int + " km/h");
    }

    @Override
    public void stealthTechnology() {
        int random_int = (int)Math.floor(Math.random()*(180-120+1)+120);
        System.out.println("Stealth technology turned on and now plane will be invisible for radars next " + random_int + " seconds");
    }

    @Override
    public void nuclearStrike() {
        int random_int = (int)Math.floor(Math.random()*(10-4+1)+4);
        System.out.println("Cy-27 will release " + random_int + " nuclear warheads");
    }

}
