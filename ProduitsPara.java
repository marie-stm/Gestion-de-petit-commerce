package TP7;

public class ProduitsPara extends Produits {
	private String codeBarre;
   
    public ProduitsPara(String nom, double prixAchat, String codeBarre) {
        super(nom, prixAchat, prixAchat * 1.3);  
        this.codeBarre = codeBarre;
    }

    public double calculerPrix() {
        this.prixVente = prixAchat * 1.3;  
        return this.prixVente;
    }

    public void afficherProduit() {
        super.AfficherProduits();
        System.out.println("Code Barre: " + codeBarre);
    }
}

