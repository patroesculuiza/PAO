package repository;
import model.Sofer;
import model.Persoana;
import java.util.ArrayList;
//mai pune actiuni
public class SoferRepository {
    private ArrayList<Sofer> soferi;

    public SoferRepository()
    {

        soferi=new ArrayList<>();
    }

    public SoferRepository(ArrayList<Sofer> soferi){
        this.soferi=soferi;
    }
    public void addSofer(Sofer s)
    {
        soferi.add(s);
    }
    public void removeSofer(Sofer s)
    {
        soferi.remove(s);
    }
    public ArrayList<Sofer> getSoferi()
    {
        return soferi;
    }
    public Sofer findBySoferId(int id) {
        for (Sofer c : soferi) {
            if (c != null) {
                if (id == c.getid())
                    return c;
            }
        }
        return null;
    }
}
