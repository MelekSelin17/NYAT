package AkilliCihaz;

public class Eyleyici {
    private boolean sogutucuDurumu;
    public boolean sogutucuAc()
    {
        this.sogutucuDurumu = true;
        return sogutucuDurumu;
    }
    public boolean sogutucuKapat()
    {
        this.sogutucuDurumu = false;
        return sogutucuDurumu;
    }
}
