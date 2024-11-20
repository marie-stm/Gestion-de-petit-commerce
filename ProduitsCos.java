package TP7;

public class ProduitsCos extends Produits {
	
	private String reference;

	public ProduitsCos(String nom, double prixAchat, String reference) {
		super(nom, prixAchat, prixVente);
		this.reference=reference;
	}
	
    public double calculerPrix() {
        this.prixVente = prixAchat * 1.2;  
        return this.prixVente;
    }

    
    public void AfficherProduits() {
        super.AfficherProduits();
        System.out.println("Référence: " + reference);
    }
}

