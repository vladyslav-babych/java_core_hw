package hw_lesson17;

public interface Iterator {
    public boolean hasNext();
    public Object next();
    public int size();
    public int getIndex();
}

    class Collection{
    private static Object[] arr;

    Collection(Object [] arr) {
        Collection.arr = arr;
    }

    public static class Forward implements Iterator {
        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < arr.length - 1;
        }

        @Override
        public Object next() {
            return arr[count++];
        }

        @Override
        public int size() {
            return arr.length;
        }

        @Override
        public int getIndex() {
            return count++;
        }
    }

    public Forward createForward() {
        return new Forward();
    }

    public class Backward implements Iterator {
        int count = arr.length;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Object next() {
            return arr[count--];
        }

        @Override
        public int size() {
            return arr.length;
        }

        @Override
        public int getIndex() {
            return count--;
        }
    }

    public Backward createBackward() {
        return new Backward();
    }
}