import org.junit.Test;

public class PecheTest {


    @Test
    public void testRecoitBoulet() {
        //test méthode recoitBoulet de la classe Peche
        //test si le bateau est coulé
        Peche peche = new Peche(0, 0, 1);
        peche.recoitBoulet();
        assert (peche.estDetruit());
    }

    @Test
    public void testAjouterMatelot() {
        //test méthode ajouterMatelot de la classe Peche
        //test si le matelot est bien ajouté à la collection
        Peche peche = new Peche(0, 0, 1);
        Matelot matelot = new Matelot("Jean", "Bon");
        peche.ajouterMatelot(matelot);
        assert (peche.nombreMatelots() == 1);
    }

    @Test
    public void testAjouterPlusieursMatelots(){
        //test méthode ajouterMatelot de la classe Peche
        //test si les matelots sont bien ajoutés à la collection
        Peche peche = new Peche(0, 0, 1);
        Matelot matelot1 = new Matelot("Jean", "Bon");
        Matelot matelot2 = new Matelot("Jean", "Bon");
        Matelot matelot3 = new Matelot("Jean", "Bon");
        peche.ajouterMatelot(matelot1);
        peche.ajouterMatelot(matelot2);
        peche.ajouterMatelot(matelot3);
        assert (peche.nombreMatelots() == 3);
        
    }



}