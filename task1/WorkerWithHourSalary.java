package Java.HW_lesson06.task1;

public class WorkerWithHourSalary implements Salary {
    int workingHoursAWeek = 40;
    int hourPayRate = 10;
    int weeksInMonth = 4;
    
    @Override
    public void salary() {
        System.out.println("I'm working 40 hours a week and get 8$ per hour");
        
        int salary = workingHoursAWeek * hourPayRate * weeksInMonth;
        
        System.out.println("So I get a " + salary + "$ salary");
    }    
}
