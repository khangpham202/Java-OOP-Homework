import java.util.LinkedList;

class StackUsingLinkedList {

    LinkedList ll = new LinkedList();

    public void push(Object obj) {
        ll.addFirst(obj);
    }

    public Object top() {
        return ll.getFirst();
    }

    public Object pop() {
        return ll.removeFirst();
    }

    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        s.push(5);
        s.push(1);
        s.push(3);
        s.push(9);
        s.push(7);
        System.out.println("The top element of the stack is: " + s.top());
        System.out.println("The stack element that is popped is: " + s.pop());
        System.out.println("The stack element that is popped is: " + s.pop());
        System.out.println("The top element of the stack is: " + s.top());
    }
}
