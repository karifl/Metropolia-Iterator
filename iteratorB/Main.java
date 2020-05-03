package iteratorB;


import java.util.Iterator;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Author go = new Author("George", "Orwell", "1984");
		Author ah = new Author("Aldous", "Huxley", "Brave New World");
		Author eap = new Author("Edgar Allan", "Poe", "The Masqurade of the Red Death");
		Author da = new Author("Durante", "Alighieri", "Divina Commedia");
		Author pkd = new Author("Phillip K.", "Dick", "Second Variety");
		
		LinkedList<Author> books = new LinkedList<Author>();
		
		books.add(go);
		books.add(ah);
		books.add(eap);
		books.add(da);
		books.add(pkd);
		Iterator<Author> itr = books.iterator();
		
		MyThread yin = new MyThread(books, itr);
		MyThread yang = new MyThread(books, itr);
		
		yin.start();
		try { Thread.sleep(10);} catch (Exception e) {}
		yang.start();
		
	}
	

}
/*		Säieluokka "MyThread" vastaanottaa säikeiden yhteisen
 * 		iteraattorin.
 * 
 *		Mikäli säikeitä ei synkronoida toimimaan vuorotellen:
 * 			
 * 			.Säikeet toimivat epäjärjestyksessä, jolloin
 * 			kokoelman sisältö tulostetaan epämääräisessä
 * 			järjestyksessä.
 * 
 * 		
 * 		Mikäli säikeet synkronoidaan toimimaan vuorotellen:
 * 
 * 		- Pääohjelma käyttää kumpaakin säiettä vuorotellen tulostaakseen
 * 			kokoelman järjestyksessä
 * 
 * 
 * ---->Käytössä synkronoidut säikeet
 * 
 * 
 * 
 * */

