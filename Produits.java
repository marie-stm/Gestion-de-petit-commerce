package TP7;

public class Produits {
	
	protected String nom;
	protected int stock;
    protected double prixAchat;
    protected double prixVente;
    protected String description;

public Produits(String nom, double prixAchat, double prixVente) {
  this.nom = nom;
  this.prixAchat = prixAchat;
  this.prixVente = prixVente;
  this.description = "Pas de description";


}

public String AfficherProduits() {
	return "Produits [nom=" + nom + ", stock=" + stock + ", prixAchat=" + prixAchat + ", prixVente=" + prixVente
			+ ", description=" + description + "]";
}

public void editer(Produits p) {
	this.nom=p.nom;
	this.description=p.description;
	this.prixAchat=p.prixAchat;
	this.stock=p.stock;
}
 public void augmenter(int qte) {
	 this.stock+= qte;
 }
 public void diminuer(int qte) {
	 if((this.stock -qte)>=0)
	 this.stock-= qte;
 }

public String getNom() {
	return nom;
}

public int getStock() {
	return stock;
}

public double getPrixAchat() {
	return prixAchat;
}

public double getPrixVente() {
	return prixVente;
}

public String getDescription() {
	return description;
}}

