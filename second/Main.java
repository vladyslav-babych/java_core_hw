package Java.HW_lesson05.second;

public class Main {
    int a;
    int b;
    int c;
    
    public Main(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Main(int a, int b, int c){
        this(a, b);
        this.c = c;
    }
}