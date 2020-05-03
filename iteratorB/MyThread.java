package iteratorB;

import java.util.Iterator;
import java.util.LinkedList;



public class MyThread extends Thread {
		private LinkedList <Author> lista = new LinkedList <Author>();
		Iterator<Author> it;
		
	public MyThread(LinkedList <Author> x, Iterator<Author> y) {
		this.lista = x;
		this.it = y;
	}	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(it.hasNext()) {
			Author ark = it.next();
			System.out.println("Author: " +ark.firstName +" " +ark.lastName + ", Book: "+ ark.book);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
