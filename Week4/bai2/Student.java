import java.util.*;
import java.util.Scanner;

public class Student implements java.io.Serializable {
    private int studentCode;
    private String studentName;
    private ArrayList<Subject> subjectList;
    private int n;
    transient Scanner sc = new Scanner(System.in);

    public Student() {
        System.out.print("Nhap vao ma sinh vien:");
        studentCode = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao ten sinh vien:");
        studentName = sc.nextLine();
        System.out.print("Nhap vao so mon hoc:");
        n = sc.nextInt();
        subjectList = new ArrayList<Subject>(n);
        for (int i = 0; i < n; i++) {
            subjectList.add(new Subject());
        }
    }

    public double computeGPA() {
        double tg = 0;
        for (Subject sub : subjectList) {
            tg = tg + sub.computeAvgMark();
        }
        return tg / n;
    }

    public void display() {
        System.out.println("Ma sinh vien:" + studentCode);
        System.out.println("Ten sinh vien:" + studentName);
        System.out.println("Cac mon hoc:");
        for (Subject sub : subjectList)
            sub.display();
        System.out.println("Diem trung binh cac mon hoc:" + computeGPA());

    }

}
