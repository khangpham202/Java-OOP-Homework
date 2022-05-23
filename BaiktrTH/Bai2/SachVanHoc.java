import java.util.Arrays;

public class SachVanHoc extends Sach {
    protected String loai;

    public SachVanHoc() {
    };

    public SachVanHoc(int maSach, String tenSach, String[] tacGia, int namXB, int lanAB, String loai) {
        super(maSach, tenSach, tacGia, namXB, lanAB);
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    @Override
    public void display() {
        System.out.println("******** Sach van hoc ********");
        System.out.println("Ma sach la: " + getMaSach());
        System.out.println("Ten sach la: " + tenSach);
        System.out.println("Tac gia cua sach la: " + Arrays.toString(tacGia));
        System.out.println("Nam xuat ban la: " + namXB);
        System.out.println("So an ban la: " + lanAB);
        System.out.println("The loai cua sach la: " + loai);
    }
}
