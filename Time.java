package hw_lesson24;

public class Time {
    int minutes;
    int hours;

    public Time(int minutes, int hours) {
        if (minutes < 0 | hours < 0) {
            System.err.println("Time can't be < 0");
        } else {
            if (minutes < 60) {
                this.minutes = minutes;
            } else if (minutes >= 60) {
                hours += minutes / 60;
                this.minutes = minutes % 60;
            }

            if (hours < 24) {
                this.hours = hours;
            } else {
                this.hours = hours % 24;
                System.err.println("Hours can't be > 24");
            }
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Time addTime(Time addedTime) {
        int addedMinutes = this.getMinutes() + addedTime.getMinutes();
        int addedHours = this.getHours() + addedTime.getHours();
        return new Time(addedMinutes, addedHours);
    }

    @Override
    public String toString() {
        return "Time{" +
                "minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }
}