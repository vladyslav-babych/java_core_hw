package Java.HW_lesson04.first;

public class Main {
    public static void main(String[] args) {
        
        Robot robot = new Robot();
        CoffeeRobot cfRobot = new CoffeeRobot();
        RobotCoocker ccRobot = new RobotCoocker();
        RobotDancer dnRobot = new RobotDancer();

        robot.work();
        cfRobot.work();
        ccRobot.work();
        dnRobot.work();

        System.out.println();

        Robot [] robotArray = {robot, cfRobot, ccRobot, dnRobot};
        for (int i = 0; i < robotArray.length; i++) {
            Robot work = robotArray[i];
            work.work();
        }
    }
}
