
import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();
        ////////////////////// select
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
        // delete
        // String query3 = "DELETE FROM books WHERE id = ?";
        //
        // PreparedStatement delete = null;
        // try {
        // delete = conn.prepareStatement(query3);
        //
        // delete.setInt(1, 1004);
        //
        // int row3 = delete.executeUpdate();
        // if (row3 != 0) {
        // System.out.println("Xóa thành công ");
        // }
        //
        // } catch (SQLException e) {
        // e.printStackTrace();
        // }

        ////////////////////// insert
         try{
         Statement st = conn.createStatement();

         // note that i'm leaving "date_created" out of this insert statement
         st.executeUpdate("INSERT INTO books (id, title, author,price, qty) "
         +"VALUES (1005, 'Conan', 'Aoyama Gosho',75.5, 3)");

         conn.close();
         }
         catch (Exception e)
         {
         System.err.println("Got an exception!");
         System.err.println(e.getMessage());
         }

        ////////////////////// update
//        String query2 = "UPDATE books SET qty = ? WHERE id = ?";
//
//        PreparedStatement update = null;
//        try {
//            update = conn.prepareStatement(query2);
//
//            update.setInt(1, 20);
//            update.setInt(2, 1004);
//            int row2 = update.executeUpdate();
//            if (row2 != 0) {
//                System.out.println("Cập nhật thành công " + row2);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        //
        System.out.println("-----------------------");
        ////////////////////// select

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

                System.out.println(id + " - " + title + " - " + author + " - " + price + " - " + qty);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}