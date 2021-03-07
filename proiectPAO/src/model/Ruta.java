package model;
//poate scot orase intermediare
public class Ruta {
    private String plecare, destinatie;
    public  Ruta(String plecare, String destinatie)
    {
        this.destinatie=destinatie;
        this.plecare=plecare;
    }


    public String getDestinatie()
    {
        return destinatie;
    }
    public void setDestinatie(String destinatie)
    {
        this.destinatie=destinatie;
    }
    public String getPlecare()
    {
        return plecare;
    }
    public void setPlecare(String plecare)
    {
        this.plecare=plecare;
    }

    public String toString() {

        return " Plecare: " +plecare +"\n"+
                " Destinatie: " + destinatie+"\n";

    }
}
