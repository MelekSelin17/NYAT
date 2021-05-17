package AkilliCihaz;
import java.util.Scanner;
import java.sql.*;
public class Islem implements IObserver{
    boolean cihazDurum;
    @Override
    public void beklemede() {
        System.out.println("Cihaz beklemede...");
        cihazDurum = false;
        System.out.println("---------------------");
    }
    @Override
    public void kontrol() {
        System.out.println("Cihaz kontrol ediliyor...");
        cihazDurum = true;
    }
    Islem() throws SQLException {
        System.out.println("Akıllı cihaz çalıştırıldı!!");
        System.out.println("---------------------");
        MerkeziIslemBirimi ms = new MerkeziIslemBirimi();
        Scanner islem = new Scanner(System.in);
        int islemSec;
        while (true)
        {
            System.out.println("İşlem seçiniz");
            System.out.println("1-Soğutucuyu Aç");
            System.out.println("2-Soğutucuyu Kapat");
            System.out.println("3-Sıcaklık Görüntüle");
            System.out.println("4-Çıkış Yap");
            System.out.print("İşleminiz: ");
            islemSec = islem.nextInt();
            if (islemSec == 1)
            {
                kontrol();
                ms.sogutucuAcik(this);
                beklemede();
            }
            else if (islemSec == 2)
            {
                kontrol();
                ms.sogutucuKapali(this);
                beklemede();
            }
            else if (islemSec == 3)
            {
                kontrol();
                ms.sicaklikGoster(this);
                beklemede();
            }
            else if (islemSec == 4)
            {
                System.out.println("Akıllı cihaz kapanıyor...");
                System.exit(0);
            }
            else
            {
                System.out.println("Listelenen aksiyonlardan birini seçiniz!");
            }
        }
    }
}