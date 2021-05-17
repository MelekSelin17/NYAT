package AkilliCihaz;

public class MerkeziIslemBirimi implements IObservableMerkeziIslemBirimi{
    private boolean sogutucuDurum;
    Eyleyici eyle = new Eyleyici();
    SicaklikAlgilayici sicaklikAlgila = new SicaklikAlgilayici();
    @Override
    public void sogutucuAcik(IObserver observer)
    {
        if (this.sogutucuDurum) //true ise
        {
            System.out.println("Soğutucu acik,tekrar acamazsiniz.");
        }else {
            this.sogutucuDurum = eyle.sogutucuAc();
            sicaklikAlgila.sicaklikAta(sogutucuDurum);
            System.out.println("Soğutucu Acildi!");
        }
    }
    @Override
    public void sogutucuKapali(IObserver observer)
    {
        if (!this.sogutucuDurum) //false ise
        {
            System.out.println("Soğutucu kapali,tekrar acamazsiniz.");
        }else
        {
            this.sogutucuDurum = eyle.sogutucuKapat();
            sicaklikAlgila.sicaklikAta(sogutucuDurum);
            System.out.println("Soğutucu Kapali!");
        }
    }
    @Override
    public void sicaklikGoster(IObserver observer)
    {
        System.out.println("Sicaklik:  " + sicaklikAlgila.sicaklikOku());

    }
}
