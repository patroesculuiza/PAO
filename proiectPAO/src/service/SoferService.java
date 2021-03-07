package service;
import model.Sofer;
import repository.SoferRepository;
import java.util.ArrayList;
public class SoferService {
    private SoferRepository soferRepository;
    public SoferService(){
        soferRepository = new SoferRepository();
    }
    public void addSofer(Sofer s){
        soferRepository.addSofer(s);
    }
    public void removeSofer(Sofer s){
        soferRepository.removeSofer(s);
    }

}
