
package database;

/**
 *
 * @author Taha
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class creatingDatabase {
    private static final String url = "jdbc:mysql://localhost:3306/mynewconnection";// Enter your project database name
                                                                                    // instead of MYNEWCONNECTİON ;
    private static final String user = "root";// ROOT or diffrent path;
    private static final String password = "ŞİFRENİZİ GİRİNİZ";// Enter your password;

    public static void main(String[] args) {
        try (
                var con = DriverManager.getConnection(url, user, password);
                var stmt = con.createStatement()) {

            String query = "CREATE DATABASE myconnection";
            stmt.executeUpdate(query);
            System.out.println("Veritabanı başarıyla oluşturuldu.");

            query = "USE myconnection";
            stmt.executeUpdate(query);

            query = "CREATE TABLE patients (id INT PRIMARY KEY, patientID INT, Name VARCHAR(255), Surname VARCHAR(255),Gender VARCHAR(255),Birim VARCHAR(255), kanGrubu VARCHAR(255),Doktor VARCHAR(255),odaNumarası INT)";
            stmt.executeUpdate(query);
            System.out.println("Tablo başarıyla oluşturuldu.");

            query = "CREATE TABLE doctors (id INT PRIMARY KEY, Name VARCHAR(255), Surname VARCHAR(255), Alan VARCHAR(255))";
            stmt.executeUpdate(query);
            System.out.println("Tablo 2 başarıyla oluşturuldu.");

        } catch (SQLException ex) {
            System.err.println("Hata: " + ex.getMessage());
        }
        try (
                var con = DriverManager.getConnection(url, user, password);
                var stmt = con.createStatement()) {

            String query = "INSERT INTO patients (id,patientID, Name, Surname,Gender,Birim, kanGrubu, Doktor,odaNumarası) VALUES (1, 29932,'Ahmet', 'Tutan','Erkek',NULL,'A',NULL,NULL), (2, 29934,'Büşra', 'Tutamayan','Kadın',NULL,'AB',NULL,NULL),(3, 29934,'Hakkı', 'Özilhan','Erkek',NULL,'0',NULL,NULL),(4, 29935,'Gökçe', 'Yıldız','Kadın',NULL,'B',NULL,NULL)";
            stmt.executeUpdate(query);
            System.out.println("Veriler başarıyla eklendi.");
            String query2 = "INSERT INTO doctors (id,Name, Surname, Alan) VALUES (11,'Melih', 'Ağaçturu','Genel Cerrahi'),(12,'Gülenay', 'Güngör','Psikoloji'),(13,'Atakan', 'Kurtuluş','Nöroloji'),(14,'Emre', 'Keleş','Üroloji'),(15,'Sinem', 'Özbek','Göz Hastalıkları'),(16,'Berzan', 'Gürbüz','Çocuk Hastalıkları'),(17,'Kaan', 'Ordulu','Acil Servis'),(18,'Ömer', 'Dibebatmaz','Çocuk Hastalıkları'),(19,'Gönül', 'Sevenebakmaz','Göz Hastalıkları'),(20,'Suat', 'Hayri','Genel Cerrahi'),(21,'Gökhan', 'Direktutan','Üroloji'),(22,'Hayat', 'Onagüzel','Psikoloji'),(23,'Zeynep', 'Siniribozuk','Nöroloji')";
            stmt.executeUpdate(query2);
            System.out.println("Veriler başarıyla eklendi.");

        } catch (SQLException ex) {
            System.err.println("Hata: " + ex.getMessage());
        }
    }
}
