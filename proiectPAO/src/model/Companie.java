package model;

import java.util.Objects;

public class Companie {
    private static String nume;
    private static String locatie;

    public Companie(String num, String locat)
    {
        nume=num;
        locatie=locat;
    }

    public String getNume()
    {
        return nume;
    }
    public String getLocatie()
    {
        return locatie;
    }
    public void setLocatie(String locat) {
        locatie = locat;
    }
    public void setNume(String num) {
        nume = num;
    }


    public String toString()
    {
        return "Companie "+"nume: "+nume+"\n"+
                "Locatie: "+locatie+"\n";
    }
//poti pune si la restul ca nu strica


}
