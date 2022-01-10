package Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    private static final String DB_URL = "jdbc:mysql://localhost/tubespbo";
    private static final String USER = "root";
    private static final String PASS = "";
    
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    
    public Database(){
        this.connect();
    }
    
    public void connect(){
        try{
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Success Connect");
        } catch(Exception e) {
            System.out.println("Error: "+e);
        }
    }
    public void insert(String query){
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Success insert");
        } catch (SQLException ex) {
            System.out.println("Failed insert to database");
        }
    }
    public void delete(String query){
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Success delete");
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Failed delete from database");
        }
    }
    public void update(String query){
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Success update");
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Failed update from database");
        }
    }
    public ResultSet getDatabaseItem(String query){
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ResultSet getAllDatabaseItem(){
        String query = "SELECT * FROM barang";
        return getDatabaseItem(query);
    }
    
}
