package main3;
import main3.utility.*;
import main3.products.*;
import main3.products.db.*;
import java.util.Scanner;
import java.util.*;
public class ProductApp1 
{
        public static void main(String args[])
        {
	        int c;
        	String prcode;
	        char ch='y',ch1='y';
        	String s;
		Product p1;
	        List<Product> pl = new LinkedList<Product>();
		do
	 	{   
			prcode=Validator.getString("Enter the Product Code: ");
			p1=ProductDB.getProduct(prcode);

		        if(p1==null)
			        System.out.println("No product matches this product code.");

		        else
        		{
			        pl.add(p1);
	
		        }
		        Scanner scanner = new Scanner(System.in);

			System.out.println("Do you want to enter a product code y/n:");

			ch = scanner.next().charAt(0);

	        }while((ch=='y'||ch=='Y')&&(ch1=='y'));
		
		if(pl.isEmpty())
		{
			System.out.println("\nNo product entered\n");
		}
		else
		{
			Collections.sort(pl);
		
	        	for(Product p : pl)
			{
				s=p.toString();
				System.out.println(s);
			}
		
			Collections.sort(pl, p1.getCodeComparator());
			
			System.out.println("\nSorting it by Product Code\n");
		
			for(Product p : pl)
        	        {
                	        s=p.toString();
                        	System.out.println(s);
                	}

			Collections.sort(pl, p1.getPriceComparator());
		
			System.out.println("\nSorting it by Product Price\n");

                	for(Product p : pl)
                	{
                        	s=p.toString();
	                        System.out.println(s);
        	        }
		
			Collections.sort(pl,  p1.getPriceComparatorDescending());
	
			System.out.println("\nSorting it by Product Price in descending order\n");

        	        for(Product p : pl)
                	{
                        	s=p.toString();
	                        System.out.println(s);
        	        }

		}
	}
}

