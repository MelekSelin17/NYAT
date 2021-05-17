package AkilliCihaz;
import java.sql.*;
import java.util.Scanner;

public class Main {


    static Connection dbConn = DatabaseBaglanti.getConnection();
    static DatabaseBaglanti dbinstance = DatabaseBaglanti.getInstance();
    static Scanner sc = new Scanner(System.in);

    public static boolean KullaniciGiris() {
        int count = 0;
        while(count < 3) {
            System.out.println("İsminiz: ");
            String _isim = sc.nextLine();
            System.out.println("Parola: ");
            String _parola = sc.nextLine();
            System.out.println("Kontrol saglaniyor...");
            if (dbinstance.Control(_isim, _parola)) {
                return true;
            }
            count++;
        }
        System.out.println("Cok fazla giris yapildi. Sistem kapatiliyor.");
        return false;
    }


    public static void main(String[] args) throws SQLException {

        if(KullaniciGiris())
            System.out.println("GIRIS BASARILI !!");
        System.out.println("---------------------");
        Islem islem = new Islem();

    }
}
