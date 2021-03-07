package model;

public class Sofer extends Persoana {
    private float salariu;
    private Masina masina;
    private Ruta ruta;


    public Sofer(int id, String nume, String CNP, String telefon,Masina masina,float salariu,Ruta ruta) {
        super(id, nume, CNP, telefon);
        this.masina=masina;
        this.salariu=salariu;
        this.ruta=ruta;
    }
    public float getSalariu()
    {
        return salariu;
    }
    public void setSalariu(float salariu)
    {
        this.salariu=salariu;
    }
    public Masina getMasina()
    {
        return masina;
    }
    public void setMasina(Masina masina)
    {
        this.masina=masina;
    }
    public Ruta getRuta()
    {
        return ruta;
    }
    public void setRuta(Ruta ruta)
    {
        this.ruta=ruta;
    }

    public String toString()
    {
        return "Sofer: "+ super.toString()+
                "Salariu: "+salariu+"\n"+
                "Masina: "+masina+"\n";// (car !=null ? car.getRegistrationNr() : "No car assigned")
        //e imp?

    }
}
