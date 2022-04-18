public class testProg1 {
    public static Integer[] reverse(Integer[] a) {
        ArrayStack s = new ArrayStack(a.length);
        Integer[] b = new Integer[a.length];
        for (int i = 0; i < a.length; i++)
            s.push(a[i]);
        for (int i = 0; i < a.length; i++)
            b[i] = (Integer) (s.pop());
        return b;
    }

    public static void show(Integer[] a) {
        System.out.print("Ngan xep sau khi dao nguoc la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack s;
        s = new ArrayStack(5);
        // s = new ListStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.peek());

        Integer[] c = { 1, 2, 3, 4, 5 };
        show(reverse(c));
    }
}
