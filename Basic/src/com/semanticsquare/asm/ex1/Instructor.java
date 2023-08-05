package com.semanticsquare.asm.ex1;

public class Instructor {
    public long id;
	public String name;
	public String title;
	public String department;
	public Book[] books;
	
	public Instructor(long id, String name, String title, String department, Book[] books) {
		// your code
		this.id = id;
		this.name = name;
		this.title = title;
		this.department = department;
		this.books = books;
	}
	
	public Instructor(long id, String name, String title, String department) {
		// your code
		this(id, name, title, department, null);
	}
	
	public Instructor(long id, String name, String title) {
		// your code
		this(id, name, title, null);
	}
	
	public Instructor(long id, String name) {
		// your code
		this(id, name, null);
	}
	
	public String getMostRecentBookTitle() {
		// your code
		return books[books.length - 1].getTitle();
	}
	
	public Book updateBook(int index, String title) {
		// your code
		String oldTitle = books[index].getTitle();
		books[index].setTitle(title);
		return new Book(oldTitle);

	}
	
	public Book updateBook(int index, Book book) {
		// your code
		return updateBook(index, book.getTitle());

	}
	
	public static void main(String[] args) {
		Book book1 = new Book("Java for Beginners");
        Book book2 = new Book("Scala for Beginners");
        Book book3 = new Book("Effective Python");
		
		Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science", new Book[]{book1, book2, book3});
		System.out.println(instructor.getMostRecentBookTitle());
		System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());
				
		Book book4 = new Book("Introduction to Data Mining");
		System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());
	}
}