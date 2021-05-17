package AkilliCihaz;

public interface IObservableMerkeziIslemBirimi {
    void sogutucuAcik(IObserver observer);
    void sogutucuKapali(IObserver observer);
    void sicaklikGoster(IObserver observer);
}
