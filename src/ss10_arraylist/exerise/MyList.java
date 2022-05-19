package ss10_arraylist.exerise;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];

    }

    public void add(int index, E element) {
        if (index < 0 && index > elements.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }elements[index]=element;

    }
}
