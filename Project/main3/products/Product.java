package main3.products;
import java.text.NumberFormat;
import java.lang.Comparable;
import java.util.*;
public class Product implements Comparable<Product>
{
		
    private String code;
    private String description;
    private double price;
    public static int count = 0;

    public Product()
    {
	code = "";
        description = "";
        price = 0;
	count++;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public  String getCode(){
        return code;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString()
    {
        return "\nCode:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " + this.getFormattedPrice() + "\n";
    }

    public static int getCount()
    {
        return count;
    }

    public int compareTo(Product p)
    {
	return	code.compareTo(p.code);
    }

    public static Comparator<Product> getPriceComparator()
    {
		return new Comparator<Product>()
		{
				@Override
				public int compare(Product p1,Product p2)
				{
					return (Double.compare(p1.price,p2.price));
				}
		};
		
    }

    public static Comparator<Product> getCodeComparator()
    {
	class Inner implements Comparator<Product>
    	{
        	@Override
		public int compare(Product p1,Product p2)
                {
	                return p1.code.compareTo(p2.code);
                }
        }
	return new Inner();
    }	 
  
    public static Comparator<Product> getPriceComparatorDescending()
    {

	class Local implements Comparator<Product>
    	{ 
		@Override
		public int compare(Product p1,Product p2)
        	{
               		return -(Double.compare(p1.price,p2.price));
        	}
    	}
	return new Local();
    }
    
}


    
