package AkilliCihaz;

public class SicaklikAlgilayici {
    private double sicaklik;
    SicaklikAlgilayici()
    {
        sicaklik = (Math.random()*10)+18; //18~28
    }
    public void sicaklikAta(boolean sogutucuAcikMi)
    {
        if (sogutucuAcikMi) //true ise
        {
            this.sicaklik = (Math.random()*8)+10; //10~18
        }
        else
        {
            this.sicaklik = (Math.random()*10)+25; //25~35
        }
    }
    public double sicaklikOku()
    {
        return this.sicaklik;
    }
}
