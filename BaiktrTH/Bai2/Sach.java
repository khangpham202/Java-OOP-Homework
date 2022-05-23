import java.util.Arrays;

public class Sach {
    protected int maSach;
    protected String tenSach;
    protected String[] tacGia = new String[10];
    protected int namXB;
    protected int lanAB;

    public Sach() {
    }

    public Sach(int maSach, String tenSach, String[] tacGia, int namXB, int lanAB) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.lanAB = lanAB;
    }

    public int getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String[] getTacGia() {
        return tacGia;
    }

    public int getNamXB() {
        return namXB;
    }

    public int getLanAB() {
        return lanAB;
    }

    public void display() {
        System.out.println("Ma sach la: " + maSach);
        System.out.println("Ten sach la: " + tenSach);
        System.out.println("Tac gia cua sach la: " + Arrays.toString(tacGia));
        System.out.println("Nam xuat ban la: " + namXB);
        System.out.println("So an ban la: " + lanAB);
    }

}
