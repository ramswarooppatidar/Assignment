package com.lct7Arrays;
class Author{
	String name;
	String place;
	Book bk,bk1, bk2;
	 Author(){}
	 Author(String name,String s,Book b,Book b1,Book b2){
		this.name=name;
		place = s;
		bk = b;
		bk1 = b1;
		bk2 = b2;
		
	 }
	 public void setName(String s) {
		 name=s;
	 }
	 public void setPlace(String s) {
		 place=s;
	 }
	 public void setBook(Book b, Book b1, Book b2) {
		 bk = b;
		 bk1 = b1;
		 bk2 = b2;
	 }
	 

	 public String toString() {
		 return "\nauthor name is :"+name+"\nauthor birth place is : "+place+bk+bk1+bk2;
	 }
	 
}
class Book{
	String bookName;
	String pubName;
	int year;
	Book(){}
	Book(String s,String s1,int y){
		bookName = s;
		pubName = s1;
		year=y;
	}
	public void setBookName(String s) {
		bookName=s;
	}
	public void setPubName(String s) {
		pubName=s;
	}
	public void setYear(int y) {
		year=y;
	}
	public String toString() {
		return "\n\nAuthor book name is: "+bookName+"\nname of publication is : "+pubName+
				"\nyear of pulish :"+year;
	}
	
	
}

public class AuthorPubliaction {
	public static void main(String[]args) {
		Book b0 = new Book("Saidiku","Oxfford",1963);
		Book b1 = new Book("The art of Study","TMH",1974);
		Book b2 = new Book("Habit","Pearshon",1995);
		Author aut = new Author("Mr.paul","lucknow",b0,b1,b2);
		System.out.println("Using CONSTRUCTOR__________________ !");
		System.out.println(aut);
		
		Book b = new Book();
		b.setBookName("Time managment");
		b.setPubName("Thomson");
		b.setYear(1998);
		Book b3 = new Book();
		b3.setBookName("Art");
		b3.setPubName("RELX");
		b3.setYear(2004);
		Book b4 = new Book();
		b4.setBookName("Life Goal");
		b4.setPubName("Random house");
		b4.setYear(2007);
		Author a = new Author();
		a.setName("Mr.BR.Ready");
		a.setPlace("India");
		a.setBook(b,b3,b4);
		System.out.println("\nUsing setter method__________________");
		System.out.println(a);
		
		
	}

}
