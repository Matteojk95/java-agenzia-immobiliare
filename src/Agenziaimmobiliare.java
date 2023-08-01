import java.util.ArrayList;
import java.util.List;

public class Agenziaimmobiliare {

    //ATTRIBUTI
    private List<Immobile> immobileList;

    //COSTRUTTORI
    public void immobileList() {
        immobileList = new ArrayList<>();
    }

    //METODO

    //metodo per aggiungere un immobile
    public void aggiungiImmobile(Immobile immobile) {
        immobileList.add(immobile);
    }

    //metodo per la ricerca di un immobile a partire dal codice alfanumerico

    public Immobile search (String codicealfanumerico) {
        for (int i = 0; i < immobileList.size(); i++) {
            Immobile immobile = immobileList.get(i);
            if (codicealfanumerico.equals(immobile.getCodicealfanumerico())) {
                return immobile;
            }
        }
        return null;
    }



    //metodo per restituire immobile con il maggior numero di persone interessate

    public Immobile piucliccato(){
        if (immobileList.size()==0){
            return null;
        }

        Immobile preferito= immobileList.get(0);
        for(int i=0; i<immobileList.size(); i++){
            Immobile likeimmobile= immobileList.get(i);
            if (preferito.getContatore()<= likeimmobile.getContatore()){
                preferito=likeimmobile;
            }
        }
        return preferito;
    }

}