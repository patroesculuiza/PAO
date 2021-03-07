package repository;
import model.Produs;
import java.util.List;
import java.util.ArrayList;
public class ProdusRepository {
    private ArrayList<Produs> produse;
    private int index;
    public ProdusRepository()
    {
        index=0;
        produse=new ArrayList<>();
    }
    public ArrayList<Produs> getProduse()
    {
        return produse;
    }
    public void addProdus(Produs p)
    {
        produse.add(p);
        index++;
    }
    public void removeProdus(Produs p)
    {
        produse.remove(p);
    }
    public int getIndex()
    {
        return index;
    }
}
