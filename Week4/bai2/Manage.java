import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Manage {
    public static ArrayList<Student> inputData(int n) {
        ArrayList<Student> list = new ArrayList<Student>(n);
        Student sv;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho sinh vien:" + i);
            list.add(new Student());
        }

        return list;
    }

    public static void writeListToFile(String filename, ArrayList<Student> list) throws IOException {
        File file = new File(filename);
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        fos.close();
        oos.close();
    }

    public static ArrayList<Student> readListFromFile(String filename) throws Exception {
        ArrayList<Student> list = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            File file = new File(filename);
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            list = (ArrayList<Student>) ois.readObject();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            fis.close();
            ois.close();
        }
        return list;
    }

    public static void display(ArrayList<Student> list) {
        for (Student sv : list)
            sv.display();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so sinh vien:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ten tap tin:");
        String filename = sc.nextLine();
        ArrayList<Student> dssv = inputData(n);
        writeListToFile(filename, dssv);
        dssv = readListFromFile(filename);
        System.out.println("Danh sach sinh vien:");
        display(dssv);

    }
}
