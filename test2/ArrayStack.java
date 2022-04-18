class ArrayStack implements Stack {

    // Variables to represent a stack
    public int[] item;
    public int stackTop;

    /*
     * Constructor: create an array of given size
     */
    public ArrayStack(int size) {
        item = new int[size]; // Make an array of size as stack storage
        stackTop = 0;
    }

    /*
     * The push() method
     */
    public void push(int x) {
        item[stackTop] = x; // Store x in next slot
        stackTop++; // Advance one slot location
    }

    /*
     * The pop() method
     */
    public int pop() {
        int returnItem;
        returnItem = item[stackTop - 1]; // Get last stored item
        stackTop--; // Back up one slot location
        return returnItem;
    }

    public int peek() {
        return item[stackTop - 1]; // Get last stored item
        return returnItem;
    }
}
