package repository;
import model.Masina;
import  java.util.ArrayList;
public class MasinaRepository {
    private ArrayList<Masina> masini;
    public MasinaRepository()
    {
        masini=new ArrayList<>();
    }
    public void addMasina(Masina m)
    {
        masini.add(m);
    }
    public ArrayList<Masina> getMasina()
    {
        return masini;
    }
    public void removeMasina(Masina m){
        masini.remove(m);
    }
    public  ArrayList<Masina> getMasini()
    {
        return masini;
    }
}
