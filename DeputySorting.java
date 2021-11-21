package hw_lesson23;

import java.util.Comparator;

public class DeputySorting implements Comparator<Deputy> {
    @Override
    public int compare(Deputy o1, Deputy o2) {
        return  o1.getBribeAmount() > o2.getBribeAmount() ? 1 : -1;
    }
}
