package service;
import model.Masina;
import repository.MasinaRepository;
public class MasinaService {

    private MasinaRepository masinaRepository;
    public MasinaService()
    {
        System.out.println("MasinaService creata");
        masinaRepository=new MasinaRepository();
    }
    public void addMasina(Masina m){
        masinaRepository.removeMasina(m);
    }
    public void removeMasina(Masina m)
    {
        masinaRepository.removeMasina(m);
    }
    public String Masini()
    {
        StringBuilder b = new StringBuilder();
        for(Masina masina:masinaRepository.getMasina())
        {
            b.append(b.toString());
        }

        return b.toString();
    }

}
