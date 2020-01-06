package main3.products;
public class Book extends Product
{
	private String author;
	
	public Book()
	{
		author="";
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public String toString()
	{
		return super.toString() + "Author:     "+author+"\n";
	}
}
