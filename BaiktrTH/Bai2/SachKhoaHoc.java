import java.util.Arrays;

public class SachKhoaHoc extends Sach {
    protected String theloai;

    public SachKhoaHoc() {
    };

    public SachKhoaHoc(int maSach, String tenSach, String[] tacGia, int namXB, int lanAB, String theloai) {
        super(maSach, tenSach, tacGia, namXB, lanAB);
        this.theloai = theloai;
    }

    public String getTheLoai() {
        return theloai;
    }

    @Override
    public void display() {
        System.out.println("******** Sach khoa hoc ********");
        System.out.println("Ma sach la: " + maSach);
        System.out.println("Ten sach la: " + tenSach);
        System.out.println("Tac gia cua sach la: " + Arrays.toString(tacGia));
        System.out.println("Nam xuat ban la: " + namXB);
        System.out.println("So an ban la: " + lanAB);
        System.out.println("The loai cua sach la: " + theloai);
    }
}
