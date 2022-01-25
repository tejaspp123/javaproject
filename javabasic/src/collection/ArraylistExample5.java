package collection;

import java.util.ArrayList;
import java.util.List;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class ArraylistExample5 {
public static void main(String[] args) {
	//creating list of books
	List<Book>list=new ArrayList<Book>();
	//creating books
	Book b1=new Book(101,"Let us C","Yashawant kanatakar","BPB",8);
	Book b2=new Book(102,"Data communications and Networking","Forouzan","Mc Graw Hill",4);
	Book b3=new Book(103,"operating system","Galvin","wiley",6);
	//adding Books to list
	list.add(b1);
	list.add(b2);
	list.add(b3);
	//Traversing list 
	for(Book b:list) {
		System.out.println(b.id+""+b.name+""+b.author+""+b.publisher+""+b.quantity);
	}
	
	
}
}	

	


