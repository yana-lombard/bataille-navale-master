public class Pirate extends Bateau{
    
    private boolean _endommage;
    private String _capitaine;
    
	
	public Pirate(int x, int y, int drapeau, boolean endommage){
		super(x, y, drapeau);
		this._endommage = endommage;
                this._capitaine = "Capitaine Pirate";
	};
        
        public String toString(){
            return super.toString() + " avec à son bord " + this._capitaine;
        }
	
	public boolean estEndommage(){
		return _endommage;
	}
	
	public String getNom(){
		return "Bateau pirate";
	}
	
	public String getEtat(){
		if (estDetruit()){
			return "detruit";
		}
		else{
			if (_endommage){
				return "ayant subi des dommages";
			}
			else{
				return "intact";
			}
		}
	}

	@Override
	public boolean estPacifique() {
		return false;
	}

	@Override
	public void recoitBoulet() {
		if (_endommage){
			coule();
		}
		else{
			_endommage = true;
		}
	}
	
	

	@Override
	public void combat(Bateau autre) {
		autre.recoitBoulet();
		if (!autre.estPacifique()){
			recoitBoulet();
		}
	}
}

