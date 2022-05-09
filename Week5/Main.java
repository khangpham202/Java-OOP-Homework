
import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();

        String query = "SELECT * FROM books";

        Statement stm = null;
        try {
            stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                double price = rs.getDouble("price");
                int qty = rs.getInt("qty");

                System.out.println(id + " - " + title + " - " + author + " - " + price + " - " + qty);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query3 = "DELETE FROM books WHERE id = ?";

        PreparedStatement delete = null;
        try {
            delete = conn.prepareStatement(query3);

            delete.setInt(1, 1006);

            int row3 = delete.executeUpdate();
            if (row3 != 0) {
                System.out.println("Xóa thành công " + row3);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // insert
        String query1 = "INSERT INTO books(id, title, author, price, qty) " + "VALUES(?, ?, ?, ?, ?)";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query1);

            pstm.setString(1, "1006");
            pstm.setString(2, "Areca");
            pstm.setString(3, "Khang");
            pstm.setString(4, "66.66");
            pstm.setString(5, "66");

            int row = pstm.executeUpdate();
            if (row != 0) {
                System.out.println("Thêm thành công " + row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // update
        String query2 = "UPDATE books SET qty = ? WHERE id = ?";

        PreparedStatement update = null;
        try {
            update = conn.prepareStatement(query2);

            update.setInt(1, 88);
            update.setInt(2, 1005);

            int row2 = update.executeUpdate();
            if (row2 != 0) {
                System.out.println("Cập nhật thành công " + row2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query4 = "SELECT * FROM books";

        Statement stm1 = null;
        try {
            stm1 = conn.createStatement();

            ResultSet rs = stm1.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                double price = rs.getDouble("price");
                int qty = rs.getInt("qty");

                System.out.println(id + " - " + title + " - " + author + " - " + price + " -" + qty);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}