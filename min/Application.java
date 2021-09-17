package hw_lesson18.min;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void addToList(List list) {
        list.add("some object");
        list.add("some more object");
        list.add("one more object");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addToList(list);
        System.out.println(list);
        // Коли програма починає виконуватися,
        // параметри загального типу стираються
        // і через це List<Integer> стає List,
        // тому до нього можна додати будь-який тип даних.
        // Якщо замінити addToList(List list) на addToList(List<Integer> list),
        // то компілятор не дозволить додавати стрінги
        // використовуючи цей метод
    }
}
