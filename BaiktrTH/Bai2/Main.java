public class Main {
    public static void main(String[] args) {
        String[] author1 = { "J. K. Rowling", "Khang" };
        Sach s1 = new Sach(1, "Harry Potter", author1, 1998, 20);
        System.out.println("******** Sach thu nhat ********");
        s1.display();
        // sach van hoc
        String[] author2 = { "Ngo Thua An", "Mason" };
        SachVanHoc s2 = new SachVanHoc(2, "Tay Du Ky", author2, 1986, 30, "Kich tinh");
        s2.display();
        // sach khoa hoc
        String[] author3 = { "DK", "Lionel" };
        SachKhoaHoc s3 = new SachKhoaHoc(3, "Tri Thuc Ve Van Vat", author3, 2007, 15, "Khoa hoc");
        s3.display();
    }
}
