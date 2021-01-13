package klaseVozilo;

/*
 * vozilo  - Napisati klasu Automobil. Automobil ima 
1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku        Napisati klasu Voznja iz koje ce program moci da se pokrene. 
U njoj ce se kreirati najmanje dva automobila. Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.

 */

public class Voznja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automobil toyota =new Automobil("Toyota","Avensis",21004900,"Boring Person");
		Automobil GAZ = new Automobil ("GAZ", "BRDM-2", 9999999, "Cool Person");
		Automobil moskvich = new Automobil ("Moskvich", "Aleko", 1241434,"Slav person");
		Automobil messerschmitt = new Automobil ("messerschmitt", "kr200",342347,"Hipster Person");
	

	System.out.println(toyota.getModel());
	toyota.setVlasnik("New Person");
	System.out.println("Novi vlasnik auta " +  toyota.getMarka() + " modela " + toyota.getModel() + " je " + toyota.getVlasnik());
	GAZ.getModel();
	GAZ.voznja();
	
	
	}
}
