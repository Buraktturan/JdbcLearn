import java.sql.*;

public class DBConnect {
    public static final String DB_URL = "jdbc:mysql://localhost/garanti";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "";

    public static void main(String[] args) {
        Connection connect = null;
        //String deleteSql = "DELETE FROM customer Where customer_ıd=3";
        //String updateSql = "UPDATE customer SET customer_name='MURAT ÖZ' WHERE customer_ıd=1";
        //String sql = "SELECT * FROM customer";
        //String insertSql = "INSERT INTO customer (customer_name,customer_tckn,customer_age) VALUES ('AYŞE',12345678920,25)";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st =connect.createStatement();
            //st.executeUpdate(deleteSql);
            //st.executeUpdate(updateSql);
            //st.executeUpdate(insertSql);
            /*ResultSet data = st.executeQuery(sql);
            while (data.next()) {
                System.out.println("ID : " + data.getInt("customer_id") );
                System.out.println("Customer Name: " + data.getString("customer_name"));
                System.out.println("Customer TCKN: " + data.getBigDecimal("customer_tckn"));
                System.out.println("Customer Age: " + data.getInt("customer_age"));
            }*/


        }catch (SQLException e ) {
            System.out.println(e.getMessage());
        }
    }
}
