package Java.HW_lesson06.task1;

public class SalaryCalculating {
    public static void main(String[] args) {
        WorkerWithHourSalary wwhs = new WorkerWithHourSalary();
        wwhs.salary();

        System.out.println("--------------------------------------------");


        WorkerWithMonthSalary wwms = new WorkerWithMonthSalary();
        wwms.salary();
    }
}
