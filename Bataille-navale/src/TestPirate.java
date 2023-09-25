import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPirate {
    
    public void testCombatContrePeche(){
        Pirate pirate = new Pirate(0, 0, 0, false);
        Peche peche = new Peche(0, 0, 0);

        pirate.combat(peche);

        assertFalse("Pirate non enommagé", pirate.estEndommage());
        assertFalse("Pirate n'est pas dedetruit", pirate.estDetruit());
        assertTrue("Peche est detruit", peche.estDetruit());

    }

    public void testCombatContrePirate(){
        Pirate pirate = new Pirate(0, 0, 0, false);
        Peche pirateAutre = new Peche(10, 20, 0);

        pirate.combat(pirate);

        assertTrue("Pirate non enommagé", pirate.estEndommage());
        assertFalse("Pirate n'est pas dedetruit", pirate.estDetruit());
        assertTrue("Pirate non enommagé", pirateAutre.estEndommage());
        assertFalse("Pirate n'est pas dedetruit", pirateAutre.estDetruit());
    }
}
