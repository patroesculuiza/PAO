package service;
import model.Client;
import model.Produs;
import model.CSVService;
import model.Ruta;
import repository.ClientRepository;
import repository.ProdusRepository;
import java.io.*;
public class ProdusCSVService implements CSVService {
    private static ProdusCSVService produsCSVService=null;
    private ProdusRepository produsRepository=new ProdusRepository();
    private ProdusCSVService(){
    }
    public static ProdusCSVService getProdusCSVService(){
        if(produsCSVService==null)
            produsCSVService=new ProdusCSVService();
        return produsCSVService;
    }
    @Override
    public void loadData() {
        try{
            File file = new File("produsdata.csv");

            //Check if file is new
            if(!file.exists())
                return;

            BufferedReader input = new BufferedReader(new FileReader(file));
            String line;
            while((line = input.readLine()) != null)
            {
                String[] value = line.split(",");
                Client client=new Client(Integer.parseInt(value[6]),value[7],value[8],value[9]);
                Produs produs = new Produs(value[0],Float.parseFloat(value[1]),Float.parseFloat(value[2]),Float.parseFloat(value[3]),Float.parseFloat(value[4]),Float.parseFloat(value[5]),client,value[10],value[11]);
                produsRepository.addProdus(produs);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void writeData() {
        try {
            File file = new File("produsdata.csv");

            BufferedWriter output = new BufferedWriter(new FileWriter(file));

            for (Produs produs : produsRepository.getProduse()) {
                output.write(produs.getNume());
                output.write(",");
                output.write(Float.toString(produs.getLatime()));
                output.write(",");
                output.write(Float.toString(produs.getPret()));
                output.write(",");
                output.write(Float.toString(produs.getLungime()));
                output.write(",");
                output.write(Float.toString(produs.getInaltime()));
                output.write(",");
                Client client=new Client(produs.getClient());
                output.write(Integer.toString(client.getByid()));
                output.write(",");
                output.write(client.getNume());
                output.write(",");
                output.write(client.getCNP());
                output.write(",");
                output.write(client.getTelefon());
                output.write(",");
                output.newLine();
                output.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
