public class Villa extends Abitazione  {

    //ATTRIBUTI
private int dimensionigiardino;

//COSTRUTTORI

    public Villa(String codicealfanumerico, String indirizzo, int cap, String city, int superficie, int numerovani, int numerobagni, int dimensionigiardino) {
        super(codicealfanumerico, indirizzo, cap, city, superficie, numerovani, numerobagni);
        this.dimensionigiardino = dimensionigiardino;
    }


    //GETTER E SETTER

    public int getDimensionigiardino() {
        return dimensionigiardino;
    }

    public void reimpostaSuperfici(int dimensionigiardino, int superficie) {
        super.reimpostaSuperfici(superficie);
        this.dimensionigiardino= dimensionigiardino;
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
                getNumerovani()+
                getDimensionigiardino();
    }




}

