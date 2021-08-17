package Java.HW_lesson07;

public abstract class Plane {
    float planeWidth = 14.7f;
    float planeLength = 21.9f;
    int planeWeight = 23000;
    
    int minEngineStart = 20;
    int maxEngineStart = 88;
    float minTakeoff = 0f;
    float maxTakeoff = 1000f;

    void engineStart() {
        int random_int = (int)Math.floor(Math.random()*(maxEngineStart-minEngineStart+1)+minEngineStart);
        System.out.println("Engine will start in " + random_int + " sec");
    }

    void planeTakeoff() {
        int random_int = (int)Math.floor(Math.random()*(maxTakeoff-minTakeoff+1)+minTakeoff);
        System.out.println("Plane will fly " + random_int + " km with full tank");
    }

    void planeLanding() {
        System.out.println("Plane is landing");
    }
}
