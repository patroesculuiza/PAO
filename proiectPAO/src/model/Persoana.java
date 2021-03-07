package model;

public abstract class Persoana {

    private int id;
    private String CNP, nume, telefon;
    public Persoana(int id,String nume, String CNP,String telefon){
        this.CNP=CNP;
        this.nume=nume;
        this.id=id;
        this.telefon=telefon;

    }

    public Persoana(Client client) {
        this.CNP=client.getCNP();
        this.nume=client.getNume();
        this.id=client.getByid();
        this.telefon=client.getTelefon();
    }

    public String getNume()
    {
        return nume;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public int getid()
    {
        return id;
    }
    public void setid(int id){
        this.id=id;
    }
    public String getCNP()
    {
        return CNP;
    }
    public void setCNP(String CNP){
        this.CNP=CNP;
    }
    public String getTelefon()
    {
        return telefon;
    }
    public void setTelefon(String telefon){
        this.telefon=telefon;
    }


    public String toString(){
        return "ID: "+id+"\n"+
                "Nume: "+nume+"\n"+
                "CNP: "+CNP+"\n"+
                "Telefon: "+telefon+"\n";

    }

}
