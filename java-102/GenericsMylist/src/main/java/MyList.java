public class MyList<T> {
    private Object[] data;
    private int size;
    private int capacity;

    // Default constructor
    public MyList() {
        this(10);
    }

    // Constructor with initial capacity
    public MyList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        this.data = new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        ensureCapacity(size + 1); // Check if array needs resizing
        this.data[size] = data;
        size++;
    }


    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range.");
        }
        return (T) data[index];
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > capacity) {
            int newCapacity = capacity * 2;
            Object[] newData = new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
            capacity = newCapacity;
        }
    }
}
