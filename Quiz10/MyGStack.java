class GStack<T> {
    int size;
    Object arr[];
    public GStack() {
        this(100);
    }
    public GStack(int maxSize) {
        size = 0;
        arr = new Object[maxSize];
    }
    public void push(T item) {
        if (size == arr.length) {
            return;
        }
        arr[size++] = item;
    }
    public Object pop() {
        if (size == 0) {
            return null;
        }
        return (T)arr[--size];
    }
}
public class MyGStack {
    public static void main(String[] args) {
        GStack<String> gs = new GStack<String>();

        gs.push("java");
        gs.push("c++");
        System.out.println(gs.pop());
        gs.push("c");
        
        GStack<Integer> gi = new GStack<Integer>();

        gi.push(1);
        gi.push(2);
        System.out.println(gi.pop());
        gi.push(3);
    }
}
