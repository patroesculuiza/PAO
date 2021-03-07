package repository;
import model.Client;

import java.util.ArrayList;
public class ClientRepository {
    private int index;
    private ArrayList<Client> clienti;

    public ClientRepository()
    {
        index=0;
        clienti= new ArrayList<>();
    }

    public void addClient(Client client)
    {
        clienti.add(client);
        index++;
    }
    public void removeClient(Client client)
    {
        clienti.remove(client);
        index--;
    }
    public Client findbyid(int id){
        for(Client c:clienti){
            if(c.getid()==id) return c;
        }
        return null;
    }
    public ArrayList<Client> getClienti(){
        return clienti;
    }
    public int getdim()
    {
        return index;
    }

}
