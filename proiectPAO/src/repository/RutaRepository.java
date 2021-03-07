package repository;
import model.Ruta;
import java.util.ArrayList;
public class RutaRepository {
    private ArrayList<Ruta> rute;
    public RutaRepository()
    {
        rute=new ArrayList<>();
    }
    public void addRuta(Ruta r)
    {
        rute.add(r);
    }
    public void removeRuta(Ruta r)
    {
        rute.remove(r);
    }
    public ArrayList<Ruta> getRute()
    {
        return rute;
    }

}
