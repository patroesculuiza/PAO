package service;
import model.Produs;
import repository.ProdusRepository;
import java.util.ArrayList;
public class ProdusService {
    private ProdusRepository produsRepository;
    private AuditService auditService;
    public ProdusService()
    {
        produsRepository=new ProdusRepository();
        auditService = AuditService.getAuditService();
    }
    public void addProdus(Produs p){
        produsRepository.addProdus(p);

        auditService.writeData("ProdusService:addProdus");

    }
    public void removeProdus(Produs p){
        produsRepository.removeProdus(p);
    }
    //find by id
}
