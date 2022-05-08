
import java.util.Scanner;

public class Subject implements java.io.Serializable {
    private int subjectCode;
    private String subjectName;
    private double midMark;
    private double finalMark;
    transient Scanner sc = new Scanner(System.in);

    public Subject() {
        System.out.print("Nhap ma mon hoc:");
        subjectCode = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten mon hoc:");
        subjectName = sc.nextLine();
        System.out.print("Nhap diem giua ky:");
        midMark = sc.nextDouble();
        System.out.print("Nhap diem cuoi ky:");
        finalMark = sc.nextDouble();
    }

    public void setSubjectCode(int code) {
        subjectCode = code;
    }

    public double getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectName(String name) {
        subjectName = name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setMidMark(double m) {
        midMark = m;
    }

    public double getMidMark() {
        return midMark;
    }

    public void setFinalMark(double f) {
        finalMark = f;
    }

    public double getFinalMark() {
        return finalMark;
    }

    public double computeAvgMark() {
        return 0.5 * midMark + 0.5 * finalMark;
    }

    public void display() {
        System.out.println("Ma mon hoc:" + subjectCode);
        System.out.println("Ten mon:" + subjectName);
        double tb = computeAvgMark();
        System.out.println("Diem mon hoc:" + tb);

    }
}
