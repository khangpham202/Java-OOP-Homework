interface Stack {
    public int size();

    public void push(int x) throws StackFullException;

    public boolean isEmpty();

    public int pop() throws StackEmptyException;

    public int peek();
}