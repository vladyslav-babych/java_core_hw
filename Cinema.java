package hw_lesson24;

import java.util.*;

public class Cinema {
    TreeMap<Days, Schedule> schedules = new TreeMap<>();
    private ArrayList<Movie> moviesLibrary = new ArrayList<>();

    private Time open;
    private Time close;

    public Cinema(TreeMap<Days, Schedule> schedules, ArrayList<Movie> moviesLibrary, Time open, Time close) {
        this.schedules = schedules;
        this.moviesLibrary = moviesLibrary;
        this.open = open;
        this.close = close;
    }

    public Cinema() {

    }

    public TreeMap<Days, Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(TreeMap<Days, Schedule> schedules) {
        this.schedules = schedules;
    }

    public ArrayList<Movie> getMoviesLibrary() {
        return moviesLibrary;
    }

    public void setMoviesLibrary(ArrayList<Movie> moviesLibrary) {
        this.moviesLibrary = moviesLibrary;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    public Cinema(Time open, Time close) {
        this.open = open;
        this.close = close;
    }

    public void addMovie() {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title name >> ");
        String titleName = scanner.nextLine();

        System.out.println("Enter film duration");
        System.out.print("Hours >> ");
        int hrs = scanner.nextInt();
        if(hrs < 0 | hrs > 24)
            System.err.println("Hours can't be < 0 or > 24");

        System.out.print("Minutes >> ");
        int mns = scanner.nextInt();
        if(mns < 0 | mns > 60)
            System.err.println("Minutes can't be < 0 or > 60");

        Time time = new Time(mns, hrs);
        Movie movie = new Movie();
        movie.setTitleName(titleName);
        movie.setDuration(time);
        moviesLibrary.add(counter, movie);

        System.out.println(moviesLibrary);
    }

    public void addSeance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time when film starts");
        System.out.print("Hours >> ");
        int startHrs = scanner.nextInt();
        System.out.print("Minutes >> ");
        int startMns = scanner.nextInt();
        Time startTime = new Time(startMns, startHrs);

        System.out.println("Enter time when film ends");
        System.out.print("Hours >> ");
        int endHrs = scanner.nextInt();
        System.out.print("Minutes >> ");
        int endMns = scanner.nextInt();
        Time endTime = new Time(endMns, endHrs);


        Seance seance = new Seance(getMoviesLibrary().listIterator().next(), startTime);
        System.out.println(seance);

        System.out.println("Enter day when seance take place");
        System.out.print("Day >> ");
        String seanceDay = scanner.next();

        try {
            boolean match = Arrays.stream(Days.values()).anyMatch(Days.valueOf(seanceDay.toUpperCase())::equals);
            if(match) {
                Days day = Days.valueOf(seanceDay.toUpperCase());
            }
        }
        catch (IllegalArgumentException e) {
            System.err.println("You entered wrong day");
        }

        Schedule schedule = new Schedule();
        schedule.seances.add(seance);

        schedules.put(Days.valueOf(seanceDay.toUpperCase()), schedule);
        System.out.println(schedule);
        System.out.println(schedules);
    }

    public void removeMovie() {
        int count = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            Map<Integer, String> filmMap = new HashMap<>();
            for (Movie m : moviesLibrary) {
                filmMap.put(count++, m.getTitleName());
            }
            System.out.println(filmMap);
            System.out.print("Enter film number to remove >> ");
            int filmNumber = scanner.nextInt();
            for (Integer i : filmMap.keySet()) {
                filmMap.remove(filmNumber);
                moviesLibrary.remove(filmNumber);
                System.out.print("Library after removing film >> " + moviesLibrary);
            }
        }
        catch (ConcurrentModificationException e) {

        }
    }

    public void removeSeance() {
        try {
            System.out.println("Enter day when seance take place");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Day >> ");
            String seanceDay = scanner.next();

            if(schedules.containsKey(Days.valueOf(seanceDay.toUpperCase()))) {
                schedules.remove(Days.valueOf(seanceDay.toUpperCase()));
                System.out.print("Schedule after removing seance >> " + schedules);
            }
            else {
                System.err.println("Seance not found");
            }
        }
        catch (IllegalStateException e) {
            System.err.println("You entered wrong day");
        }
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "schedules=" + schedules +
                ", moviesLibrary=" + moviesLibrary +
                ", open=" + open +
                ", close=" + close +
                '}';
    }
}

