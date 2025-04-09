package module;



import java.io.*;
import java.util.*;


public class Hotel {
	public String nom_hotel;
    public String adresse_hotel;
    public int nbr_etoile;
    public int tel_hotel;
    public String email_hotel;
    
   Vector <Chambre>listeChambre = new Vector<Chambre>();
   Vector <Client>listeClient = new Vector<Client>();
   Vector <Produit>listeProd = new Vector<Produit>();
    
    public Hotel(String n ,String a ,int ne ,int t ,String e) {
    	nom_hotel = n ;
    	adresse_hotel = a ;
    	nbr_etoile = ne ;
    	tel_hotel = t ;
    	email_hotel = e ;	
    }
    
   public  void ajouterChambre(Chambre c) {
	   listeChambre.add(c);  	
    }

   public  void ajouterClient(Client c) {
	   listeClient.add(c);
    }
   public  void ajouterProduit(Produit p) {
	   listeProd.add(p);
	   
  }
    
    

}
