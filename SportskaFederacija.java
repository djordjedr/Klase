package klaseSport;
/*
 * sport - Napisati klasu Sportista. Sportista ima
1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi. 

Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.


 */
public class SportskaFederacija {

	public static void main(String[] args) {
		
		Sportista s1=new Sportista("Saban Salic", "Streljastvo", "Zvezda", 15);
		Sportista s2=new Sportista("Janko Jankovic", "kuglanje", "Partizan", 1);
		Sportista s3=new Sportista("Trta Trtic", "tenis", "MGM", 24);
		
		System.out.println(s1.getBrojDresa() +", " + s1.getImeiPrezime()+ ", " +s1.getKlub()+ ", " + s1.getSport());
		
		s2.setBrojdresa(15); 
		s2.setKlub("Zvezda");

		System.out.println();
		
	}

}
