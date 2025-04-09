package module;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
	 Hotel hotel = new Hotel("Luna" ,"adresse x" ,12,12304 ,"swan");
	 Chambre chambre1 = new Chambre(1, 12, 0,hotel);
	 Chambre chambre4 = new Chambre(1, 2, 0,hotel);
	 Chambre chambre2 = new Chambre(1, 1, 0,hotel);
	 hotel.ajouterChambre(chambre1 );
	 hotel.ajouterChambre(chambre4 );
	 hotel.ajouterChambre(chambre2 );
	 
	 Client cl1 = new Client("titi", "tata", 0, "wh", "qlq", 0,hotel);
	 hotel.ajouterClient(cl1);
	 Reservation res = new Reservation(new Date(),new Date(),cl1,chambre4);
	 
	 Sejour s = new Sejour(3, 0);
	 res.setSejour(s);

	}

}
