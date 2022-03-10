public class StackUsingArray {
    int stck[] = new int[10];
    int tos;

    StackUsingArray() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is underflow");
            return 0;
        } else
            return stck[tos--];
    }

}
