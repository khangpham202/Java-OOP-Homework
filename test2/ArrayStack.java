class ArrayStack implements Stack {

    // Variables to represent a stack
    public int[] item;
    public int stackTop;
    public static final int CAPACITY = 1000;
    protected int capacity;
    private int top = -1;

    /*
     * Constructor: create an array of given size
     */
    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int size) {
        capacity = size;
        item = new int[size]; // Make an array of size as stack storage
        stackTop = 0;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    /*
     * The push() method
     */
    public void push(int x) throws StackFullException {
        if (size() == capacity)
            throw new StackFullException("Stack overflow");
        item[stackTop] = x; // Store x in next slot
        stackTop++; // Advance one slot location
        top++;
    }

    /*
     * The pop() method
     */
    public int pop() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException("Stack empty");
        int returnItem;
        returnItem = item[stackTop - 1]; // Get last stored item
        stackTop--; // Back up one slot location
        top--;
        return returnItem;
    }

    public int peek() {
        return item[stackTop - 1]; // Get last stored item
    }
}
