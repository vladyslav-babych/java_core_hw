package hw_lesson24;

public class Seance {
    Movie movie;
    Time movieStartTime;
    Time movieEndTime;

    public Seance(Movie movie, Time movieStartTime, Time movieEndTime) {
        this.movie = movie;
        this.movieStartTime = movieStartTime;
        this.movieEndTime = movieStartTime.addTime(getMovie().getDuration());
    }

    public Seance(Movie next, Time startTime) {
    }


    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getMovieStartTime() {
        return movieStartTime;
    }

    public void setMovieStartTime(Time movieStartTime) {
        this.movieStartTime = movieStartTime;
    }

    public Time getMovieEndTime() {
        return movieEndTime;
    }

    public void setMovieEndTime(Time movieEndTime) {
        this.movieEndTime = movieEndTime;
    }

    public int compareTo(Seance o) {
        if(movieStartTime.getHours() == o.getMovieStartTime().getHours()) {
            if(movieStartTime.getMinutes() != o.getMovieStartTime().getMinutes()) {
                return movieStartTime.getMinutes() - o.getMovieStartTime().getMinutes();
            }
            else {
                return movieStartTime.getHours() - o.getMovieStartTime().getHours();
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", movieStartTime=" + movieStartTime +
                ", movieEndTime=" + movieEndTime +
                '}';
    }
}
