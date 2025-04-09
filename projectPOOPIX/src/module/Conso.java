package module;


import java.io.*;
import java.util.*;

/**
 * 
 */
public class Conso {
	public int quantite;
    Produit produit ;
    Sejour sejour ;
    
    public Conso(int q) {
    	quantite = q ;
    }
    
    public Conso(int q, Produit p ,Sejour s) {
    	quantite = q ;
    	produit = p ;
    	sejour = s ;
    }

    
}
