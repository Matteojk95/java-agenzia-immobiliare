public class Box extends Immobile {

    //ATTRIBUTI

    private int numerodipostiauto;


//COSTRUTTORI

    public Box( String codicealfanumerico, String indirizzo, int cap, String city, int superficie, int numerodipostiauto) {
        super(codicealfanumerico,indirizzo,cap,city,superficie);
        this.numerodipostiauto = numerodipostiauto;
    }


//GETTER E SETTER

    public int getNumerodipostiauto() {
        return numerodipostiauto;
    }


//METODI

    @Override
    public String toString() {
        return getCodicealfanumerico()+
                getCity()+
                getCap()+
                getIndirizzo()+
                getSuperficie()+
                getNumerodipostiauto();

    }
}