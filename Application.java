package hw_lesson17;

public class Application {
    public static void main(String[] args) {
        Integer[] array = {1, 43, -2, 34, -9, -17, -82, 1, 9};

        Collection collection = new Collection(array);

        Iterator iteratorForward = collection.createForward();
        System.out.println("Task 1");
        while(iteratorForward.hasNext()) {
            int i = (Integer) iteratorForward.next();
            if(i % 2 == 1 || i % 2 == -1) {
                i = 0;
            }
            System.out.println(i);
        }

        System.out.println();

        Iterator iteratorBackward = collection.createBackward();
        System.out.println("Task 2");

        while(iteratorBackward.hasNext()) {
            int i = (Integer) iteratorBackward.getIndex();
            System.out.println((Integer) iteratorBackward.next());
        }
    }
}
