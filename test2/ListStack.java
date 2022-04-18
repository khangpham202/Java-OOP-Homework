class ListStack implements Stack {
    public class ListElem {
        int item;
        ListElem next;

        public ListElem(int x) {
            item = x;
        }
    }

    ListElem head;

    public ListStack() {
        head = null;
    }

    public void push(int x) {

        ListElem e = new ListElem(x);
        e.next = head;
        head = e;
    }

    public int pop() {
        int returnItem;
        returnItem = head.item;
        head = head.next;
        return returnItem;
    }

    public int peek() {
        return head.item;
    }
}
