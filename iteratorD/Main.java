package iteratorD;


import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Author go = new Author("George", "Orwell", "1984");
		Author ah = new Author("Aldous", "Huxley", "Brave New World");
		Author eap = new Author("Edgar Allan", "Poe", "The Masqurade of the Red Death");
		Author da = new Author("Durante", "Alighieri", "Divina Commedia");
		Author pkd = new Author("Phillip K.", "Dick", "Second Variety");
		Author fk = new Author("Franz", "Kafka", "Metamorphosis");
		LinkedList<Author> books = new LinkedList<Author>();
		
		books.add(go);
		books.add(ah);
		books.add(eap);
		books.add(da);
		books.add(pkd);
		
		
		MyThread yin = new MyThread(books);
		
		MyThread yang = new MyThread(books);
		
		yin.start();
	
		try { Thread.sleep(10);} catch (Exception e) {}
		yang.start();
		
	}

}
/*		Jos kokoelmaa muokataan toisen prosessin iteraattorilla toiminnolla (iterator.remove) 
 * 			* Toinen säie ilmoittaa toimintansa aikana virheestä seuraavalla tavalla
 * 				ja lopettaa toimitansa:
 * 
 * 		Exception in thread "Thread-1" java.util.ConcurrentModificationException
			at java.base/java.util.LinkedList$ListItr.checkForComodification(LinkedList.java:970)
			at java.base/java.util.LinkedList$ListItr.next(LinkedList.java:892)
			at iteratorC/iteratorC.MyThread.run(MyThread.java:20)
 * 
 * ------------------------------------------------------------------------------------------
 *		Säieluokalla "MyThread" luo jokaiselle säikeelle erillisen
 * 		iteraattorin.
 * 
 *		Mikäli säikeitä ei synkronoida:
 * 			ensimmäinen säie toteuttaa ohjelmansa
 * 			ennen seuraavaa säiettä.
 * 
 * 		Jos säikeet synkronoidaan
 * 			Voimme saada säikeet toteutumaan rinnakkaisesti.
 * 
 * ---->Käytössä synkronoidut säikeet
 * 
 * 
 * 
 * */
