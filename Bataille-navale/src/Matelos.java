public class Matelot {
    
    private String _nom;
    private String _poste;
    
    public Matelot(String unNom, String unPoste){
        this._nom = unNom;
        this._poste = unPoste;
    }
    
    public boolean estCapitaine(){
        boolean resultat = false;
        if(this._poste == "Capitaine"){
            resultat = true;
        }
        return resultat;
    }
    
    public String toString(){
        return _nom;
    }
}
