package service;
import model.Client;
import model.Ruta;
import model.CSVService;
import repository.ClientRepository;
import repository.RutaRepository;
import java.io.*;
public class RutaCSVService implements CSVService {
    private static RutaCSVService rutaCSVService=null;
    private RutaRepository rutaRepository=new RutaRepository();
    private RutaCSVService(){
    }
    public static RutaCSVService getRutaCSVService(){
        if(rutaCSVService==null)
            rutaCSVService=new RutaCSVService();
        return rutaCSVService;
    }
    @Override
    public void loadData() {
        try{
            File file = new File("rutadata.csv");

            //Check if file is new
            if(!file.exists())
                return;

            BufferedReader input = new BufferedReader(new FileReader(file));
            String line;
            while((line = input.readLine()) != null)
            {
                String[] value = line.split(",");
                Ruta ruta = new Ruta(value[0],value[1]);
                rutaRepository.addRuta(ruta);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void writeData() {
        try {
            File file = new File("rutadata.csv");

            BufferedWriter output = new BufferedWriter(new FileWriter(file));

            for (Ruta ruta: rutaRepository.getRute()) {
                output.write(ruta.getPlecare());
                output.write(",");
                output.write(ruta.getDestinatie());
                output.write(",");
                output.newLine();
                output.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
