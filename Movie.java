package hw_lesson24;

public class Movie {
    String titleName;
    Time duration;

    public Movie(String titleName, Time duration) {
        this.titleName = titleName;
        this.duration = duration;
    }

    public Movie() {

    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "titleName='" + titleName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
