public class Abitazione extends Immobile{

    //ATTRIBUTI
 private int numerovani;
 private int numerobagni;


 //COSTRUTTORI

    public Abitazione(String codicealfanumerico, String indirizzo, int cap, String city, int superficie, int numerovani, int numerobagni) {
        super(codicealfanumerico, indirizzo, cap, city, superficie);
        this.numerovani = numerovani;
        this.numerobagni = numerobagni;
    }


    //GETTER E SETTER

    public int getNumerovani() {
        return numerovani;
    }

    public int getNumerobagni() {
        return numerobagni;
    }


    //METODO


    @Override
    public String toString() {
        return getCodicealfanumerico()+
                getCity()+
                getCap()+
                getIndirizzo()+
                getSuperficie()+
                getNumerobagni()+
                getNumerovani();
    }
}
