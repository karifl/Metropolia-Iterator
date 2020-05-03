package iteratorC;

public class Author implements Authors{

	public String firstName;
	public String lastName;
	public String book;
	
	
	public Author(String first, String last, String masterpiece) {
		this.firstName = first;
		this.lastName = last;
		this.book = masterpiece;
	
	}
	
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}
	@Override
	public String getBook() {
		// TODO Auto-generated method stub
		return this.book;
	}
}
