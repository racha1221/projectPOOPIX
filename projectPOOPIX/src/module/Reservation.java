package module;



import java.io.*;
import java.util.*;


public class Reservation {
	public Date date_debut;
    public Date date_fin ;
    Client client ;
    Chambre chambre ;
    Sejour sejour ;
   
    public Reservation(Date d ,Date f) {
    	date_debut=d;
    	date_fin=f;	
    }
    
    public Reservation(Date d ,Date f,Client cl, Chambre c ) {
    	date_debut=d;
    	date_fin=f;	
    	client = cl;
    	chambre = c;
    	
    }
    
    public void setSejour(Sejour s) {
    	sejour = s;
    }

    

}