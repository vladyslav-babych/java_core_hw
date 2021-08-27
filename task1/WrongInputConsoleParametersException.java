package HW_lesson09.task1;

public class WrongInputConsoleParametersException extends Exception {
    private String month;

    public WrongInputConsoleParametersException(String month) {
        super(month);
        this.month = month;
    }

    public String getMonth() {
        return month;
    }
}
