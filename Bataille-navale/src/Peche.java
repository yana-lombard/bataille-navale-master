import java.util.ArrayList;

public class Peche extends Bateau {

	private int _nombreMatelots;
	//Collection de type Matelot représentant l'équipe du bateau
	private ArrayList<Matelot> matelots;

	public Peche(int x, int y, int drapeau) {
		super(x, y, drapeau);
		this._nombreMatelots = 12;
		matelots = new ArrayList<Matelot>();
	}

	/**
	 * Méthode permettant d'ajouter un matelot dans la collection
	 * de matelots (représent l'équipe du bateau)
	 * @param monMatelot
	 */
	public void ajouterMatelot(Matelot monMatelot){
		matelots.add(monMatelot);
	}

	/**
	 * Retourne le nombre de matelots dans la collection de matelots
	 * @return
	 */
	public int nombreMatelots(){
		return matelots.size();
	}
	
	public String toString() {
		return super.toString() + " avec à son bord " +
				this._nombreMatelots + " matelots";
	}

	public String getNom() {
		return "Bateau de pêche";
	}

	@Override
	public void recoitBoulet() {
		coule();
	}

	@Override
	public void combat(Bateau autre) {
		if (!autre.estPacifique()) {
			recoitBoulet();
		}
	}

	@Override
	public boolean estPacifique() {
		return true;
	}
	
}
