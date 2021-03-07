package service;
import model.Client;
import model.CSVService;
import repository.ClientRepository;
import java.io.*;
public class ClientCSVService implements CSVService {

    private static ClientCSVService clientCSVService=null;
    private ClientRepository clientRepository=new ClientRepository();
    private ClientCSVService(){
    }
    public static ClientCSVService getClientCSVService(){
        if(clientCSVService==null)
            clientCSVService=new ClientCSVService();
        return clientCSVService;
    }

    @Override
    public void loadData() {
        try{
            File file;
            file = new File("clientdata.csv");

            //Check if file is new
            if(!file.exists())
                return;

            BufferedReader input = new BufferedReader(new FileReader(file));
            String line;
            while((line = input.readLine()) != null)
            {
                String[] value = line.split(",");
                Client client = new Client(Integer.parseInt(value[0]),value[1],value[2],value[3]);
                clientRepository.addClient(client);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void writeData() {
        try {
            File file = new File("clientdata.csv");

            BufferedWriter output = new BufferedWriter(new FileWriter(file));

            for (Client client : clientRepository.getClienti()) {
                output.write(Integer.toString(client.getByid()));
                output.write(",");
                output.write(client.getNume());
                output.write(",");
                output.write(client.getCNP());
                output.write(",");
                output.write(client.getTelefon());
                output.newLine();
                output.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
