package model;

import java.net.PortUnreachableException;

public class Produs {
        private String nume;
        private float latime, lungime,inaltime,greutate;
        private Client client;
        private float pret;
        public Produs(String nume, float latime,float pret,float lungime,float inaltime, float greutate,Client client,String plecare, String destinatie)
        {

            this.client=client;
            this.nume=nume;
            this.latime=latime;
            this.lungime=lungime;
            this.inaltime=inaltime;
            this.greutate=greutate;
            this.pret=pret;

        }

        public float getLatime()
        {
         return latime;
        }
        public void setLatime(float latime)
        {
            this.latime=latime;
        }
         public float getLungime()
         {
            return lungime;
          }
          public void setLungime(float lungime)
          {
              this.lungime=lungime;
          }
         public float getInaltime()
         {
           return inaltime;
         }
        public void setInaltime(float inaltime)
        {
          this.inaltime=inaltime;
        }
        public float getGreutate()
        {
          return greutate;
        }
        public void setGreutate(float greutate)
        {
          this.greutate=greutate;
        }

         public void setClient(Client client)
        {
          this.client=client;
        }
        public Client getClient()
        {
          return client;
        }
         public String getNume()
         {
           return nume;
         }
         public void setNume(String nume)
         {
           this.nume=nume;
         }
      ///plecare , destinatie

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }


    public String toString() {
        return  "Produs" + " nume produs: " + nume + "\n" +
                " Dimensiuni: " + latime +" " + lungime + " " + inaltime + " " + greutate + "\n" +
                //  " from:" + from.getName() +
                //   " to:" + to.getName() +
                "Client" + client.toString();


    }
}
