package AkilliCihaz;
import java.sql.*;
import java.util.*;

public class DatabaseBaglanti {

    private static DatabaseBaglanti instance;
    private static Connection conn;
    private static String isim="";
    private static String parola="";

    private DatabaseBaglanti() {}

    public static Connection getConnection(){
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AkilliCihaz","postgres","melekselin79");
            System.out.println("Veritabani baglantisi saglandi");

        }catch(SQLException e) {
            System.err.println(" Hata bulundu "+e.getMessage());
        }catch(ClassNotFoundException e){
            System.err.println(" Hata bulundu "+e.getMessage());
        }
        return conn;
    }

    public static DatabaseBaglanti getInstance(){
        if(instance==null){
            synchronized (DatabaseBaglanti.class) {
                if (instance==null) {
                    instance=new DatabaseBaglanti();
                }
            }
        }
        return instance;
    }

    public boolean Control(String _isim, String _parola) {
        try {

            Statement st = conn.createStatement();
            String sql = "SELECT *  FROM \"User\" WHERE \"KullaniciIsim\"='" + isim + "' and \"KullaniciSifre\"='" + parola + "'";
            //ResultSet rs = st.executeQuery(sql);
            System.out.println(isim);
        }
        catch(Exception e) {
            System.out.println(e);
        }

        if(isim.equals(_isim)) {
            if(parola.equals(_parola)) {
                System.out.println("Sisteme basariyla giris yapildi!");
                return true;
            }
            else {
                System.out.println("Parolaniz yanlis lütfen tekrar deneyin!");
                return false;
            }
        }
        return true;
    }

}

