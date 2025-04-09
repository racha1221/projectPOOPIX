package module;



import java.io.*;
import java.util.*;


public class Sejour {
	
	public float facturation ;
	public int idSejour;
	Reservation reservation ;
    Vector<Conso>listeConso = new Vector<Conso>();
    
    public Sejour(int i , float f) {
    	idSejour=i;
    	facturation=f;
	
    }
    
    public void setRes(Reservation x) {
    	reservation = x ;
    }
    
    public void ajouterConsomation(Conso x) {
    	listeConso.add(x);
    }

    
   

}