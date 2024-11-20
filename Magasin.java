package TP7;

import java.util.ArrayList;

public class Magasin {
    private double solde;

    private ArrayList<Produits> stock;

    public Magasin() {
        stock=new ArrayList<>();
    }

    public void ajouterProduit(String nom, double prixAchat, double prixVente) {
        stock.add(new Produits(nom,prixAchat,prixVente));
    }
    public void acheterProduit(Produits p, int nbre) {
       /* if(stock.contains(p.getNom()))
            p.augmenter(nbre);
        else {
            stock.add(p);
            p.augmenter(nbre);*/

        if(!stock.contains(p.getNom()))
            stock.add(p);
        p.augmenter(nbre);
        }
    public Produits RechercherProduit(String nom) {
        for(Produits p:stock)
            if(p.getNom().equals(nom))
                return p;
        return null;

    }

    public void VendreProduit(Produits p, int nbre) {
        if(this.RechercherProduit(p.getNom())==null)
            System.out.println("Vente impossible");
        else if(p.getNbrestock()-nbre)>=0){
        	p.diminuer(nbre);
        }
    }

	public String toString() {
		return "Magasin [solde=" + solde + ", stock=" + stock + "]";
	}}
   public void calculerPrix() {
	   for(Produit p:)
   }


