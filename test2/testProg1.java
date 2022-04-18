public class testProg1 {
    public static void main(String[] args) {
        Stack s;
        int b[] = new int[5];
        // bai 1: s = new ArrayStack(5);
        s = new ListStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        b[0] = s.pop();
        b[1] = s.pop();
        b[2] = s.pop();
        b[3] = s.pop();
        b[4] = s.pop();
        System.out.print("Ngan xep sau khi dao nguoc la: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
