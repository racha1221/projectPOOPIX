package module;


import java.io.*;
import java.util.*;


public class Client {
	
	public String nom;
    public String prenom;
    public int tel_client;
    public String email_client;
    public String adresse_client;
    public int contact_urg_tel;
    
	public Hotel hotel ;
	public Vector<Reservation>listeRes=new Vector<Reservation>();

    
    public Client(String n,String p ,int t,String e,String a,int c) {
    	nom = n ;
    	prenom = p;
    	tel_client = t ;
    	email_client = e ;
    	adresse_client = a ;
    	contact_urg_tel = c ;
    	
    }

    public Client(String n,String p ,int t,String e,String a,int c,Hotel h) {
    	nom = n ;
    	prenom = p;
    	tel_client = t ;
    	email_client = e ;
    	adresse_client = a ;
    	contact_urg_tel = c ;
    	hotel = h ;
    	
    }
    
    public  void ajouterRes(Reservation x) {
    	listeRes.add(x);
    }
    
    

}
