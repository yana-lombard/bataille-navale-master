public abstract class Bateau {
    
    private int x;
	private int y;
	private int drapeau;
	private boolean detruit;
	
	public Bateau(int px, int py, int drapeau){
		x = px;
		if (x < 0){
			x = 0;
		}
		if (x > BatailleNavale.MAX_X){
			x = BatailleNavale.MAX_X;
		}
		y = py;
		if (y < 0){
			y = 0;
		}
		if (y > BatailleNavale.MAX_Y){
			y = BatailleNavale.MAX_Y;
		}
		this.drapeau = drapeau;
		this.detruit = false;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getDrapeau(){
		return drapeau;
	}
	public boolean estDetruit(){
		return detruit;
	}
	public String getEtat(){
		if (detruit){
			return "detruit";
		}
		else{
			return "intact";
		}
	}
	
	public String toString(){
		return getNom() + " avec drapeau " + getDrapeau() + " en (" + x + "," + y + ") -> " + getEtat();
	}
	
	public double distance(Bateau autre) {
		return Math.sqrt(Math.pow((x - autre.x), 2) + Math.pow((y - autre.y), 2));
	}
	
	public void avance(int unitsX, int unitsY){
		x += unitsX;
		if (x < 0){
			x = 0;
		}
		if (x > BatailleNavale.MAX_X){
			x = BatailleNavale.MAX_X;
		}
		y += unitsY;
		if (y < 0){
			y = 0;
		}
		if (y > BatailleNavale.MAX_Y){
			y = BatailleNavale.MAX_Y;
		}
	}
	
	public void coule() {
		detruit = true;
	}
	
	public String getNom(){
		return "Bateau";
	}
	
	public void rencontre(Bateau autre){
		if (distance(autre) < BatailleNavale.RAYON_RENCONTRE && drapeau != autre.drapeau){
			combat(autre);
		}
	}
	
	public abstract void combat(Bateau autre);
	
	public abstract boolean estPacifique();
	
	public abstract void recoitBoulet();
}