public class Main {
    public static void main(String[] args) {

        Immobile immobile= new Immobile("xyc","via cammello 17 ", 44121, "milano", 200 );
        immobile.aggiungiPersona();
        System.out.println(immobile.getContatore());

        Villa v1=new Villa("43fr","Via Cammello 16", 44121,"Ferrara", 200, 5, 3,200);
        Abitazione a1= new Abitazione("76fd","Via Melone 15", 44121, "Ferrara", 600,12,8);

    }
}
