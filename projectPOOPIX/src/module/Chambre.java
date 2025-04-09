package module;

import java.io.*;
import java.util.*;

public class Chambre {
    public int num; 
    public int etage; 
    public float cout;
    
	Hotel hotel ;
	Vector<Reservation>listRes= new Vector<Reservation>();
	Vector <Client> listeClient = new Vector<Client>();
	
    public Chambre(int n , int e,float c) {
    	num = n ;
    	etage = e;
    	cout = c ;	
    }
    
    public Chambre(int n , int e,float c,Hotel h) {
    	num = n ;
    	etage = e;
    	cout = c ;	
    	hotel = h ;
    }
    
    public void ajouterRes(Reservation x) {
    	listRes.add(x);
    }

    


}