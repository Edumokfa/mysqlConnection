package Application;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();
            int rows1 = st.executeUpdate("UPDATE seller SET baseSalary = 2090 WHERE DepartmentId = 1");

            int x = 1;
            if (x < 2) {
                throw new SQLException("Fake error");
            }

            int rows2 = st.executeUpdate("UPDATE seller SET baseSalary = 3090 WHERE DepartmentId = 1");

            conn.commit();
            System.out.println("Rows1 " + rows1);
            System.out.println("Rows2" + rows2);
        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DbException("Problema na transação: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Erro no rollback! Causado por: " + ex.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }

}
