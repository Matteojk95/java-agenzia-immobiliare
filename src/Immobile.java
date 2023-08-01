public class Immobile {

    //ATTRIBUTI

    private String codicealfanumerico;
    private String indirizzo;
    private int cap;
    private String city;
    private int superficie;
    private int contatore;

//COSTRUTTORE

    public Immobile(String codicealfanumerico, String indirizzo, int cap, String city, int superficie) {
        this.codicealfanumerico = codicealfanumerico;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.city = city;
        this.superficie = superficie;
        this.contatore = 0;

    }


//GETTER E SETTER

    public String getCodicealfanumerico() {
        return codicealfanumerico;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int getCap() {
        return cap;
    }

    public String getCity() {
        return city;
    }

    public int getSuperficie() {
        return superficie;
    }

    public int getContatore() {
        return contatore;
    }

    public void reimpostaSuperfici(int superficie) {
        this.superficie = superficie;
    }
//METODO

    public void aggiungiPersona(){
        contatore++;
    }

    @Override
    public String toString() {
        return "Immobile{" +
                "codicealfanumerico='" + codicealfanumerico + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap=" + cap +
                ", city='" + city + '\'' +
                ", superficie=" + superficie +
                ", contatore=" + contatore +
                '}';
    }

}
