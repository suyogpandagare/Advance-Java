package study.rest;

public class Book {

	private String bookName;
	private String author;
	private double cost;
	
	public Book() { System.out.println("book constructor called"); }
	
	public Book(String bookName, String author, double cost) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.cost = cost;
	}
	
	public Book(String author) {
		this.author=author;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
