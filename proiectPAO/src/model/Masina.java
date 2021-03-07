package model;

public class Masina {

    private String nr_inregistrare,marca , culoare;
    private Ruta ruta;
    private float capacitate;
    public Masina(String nr_inregistrare,String marca,String culoare,Ruta ruta,float capacitate)
    {
        this.culoare=culoare;
        this.marca=marca;
        this.nr_inregistrare=nr_inregistrare;
        this.ruta=ruta;
        this.capacitate=capacitate;
    }

    public Masina(String string, String string1, String string2, float aFloat) {
        this.nr_inregistrare = string;
        this.marca = string1;
        this.culoare = string2;
        this.capacitate = aFloat;
        this.ruta = null;
    }

    public String getNr_inregistrare()
    {
        return nr_inregistrare;
    }
    public void setNr_inregistrare(String nr_inregistrare)
    {
        this.nr_inregistrare=nr_inregistrare;
    }
    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca=marca;
    }
    public String getCuloare()
    {
        return culoare;
    }
    public void setCuloare(String culoare)
    {
        this.culoare=culoare;
    }
    public Ruta getRuta()
    {
        return ruta;
    }
    public void setRuta(Ruta ruta)
    {
        this.ruta=ruta;
    }
    public float getCapacitate()
    {
        return capacitate;
    }
    public void setCapacitate(String nr_inregistrare)
    {
        this.capacitate=capacitate;
    }

    public String toString()
    {
        return "Masina\n numar inregistrare: "+nr_inregistrare+
                "marca: "+marca+"\n"+
                "culoare: "+culoare+"\n"+
                "capacitate: "+capacitate+"\n"+
                "Ruta: "+ruta.toString()+"\n";
    }
    //aici aparent
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return registration_nr.equals(car.registration_nr);
    }*/
}
