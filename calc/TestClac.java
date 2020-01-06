package calc;
import calc.assignment.*;
import java.lang.*;
import java.util.*;
import java.util.LinkedList; 
import java.util.Queue;
public class TestClac
{
	private static Scanner input = new Scanner( System.in );
	

	public static void main(String args[]) //main function begins
	{
		boolean retry=false; 

		
	 	while(!retry) //loop begins
	 	{
	   	
			try
	   		{
				String inexp ;
				
				System.out.print( "\nType the expression here: " );
				
				inexp=input.nextLine();	//taking the expression
				
				Queue<String> q = new LinkedList<>(); //Initializing the queue of strings
				
				StringTokenizer st = new StringTokenizer(inexp," "); //Tokenizing the given expression
				
				do
				{
					q.add(st.nextToken());
				
				}while(st.hasMoreTokens());
				
				String answer;
				
				answer =  PfCalculator.evaluate(q); //passing the queue to the evaluate function in class PfCalculator	
				
				q.clear();//clearing the queue after the result of the expression has been recieved

				double ans=0.0;
        
		                ans=Double.parseDouble(answer); //converting the answer to double
        
                		System.out.println("\nRESULT OF THE EXPRESSION IS := "+ans); //printing the answer


	   		}
			
			catch(NullPointerException npe) // catches if the string is null
	   		{
				System.out.println("        String is null"+"\n"+"       Please enter again!!!"+"\n");
				npe.printStackTrace();
	   		}
			
			catch(NoSuchElementException noe) // if there are no tokens i.e. string is missing
	   		{
				System.out.println("        No tokens in this tokenizer's string."+"\n"+"        Please enter again!!!"+"\n");
				noe.printStackTrace();
	   		}
			
			catch(NumberFormatException  nfe) //If the format of the expression is wrong
		        {
		                System.out.println("        Expression has wrong format."+"\n"+"        Please enter again!!!"+"\n");
                		nfe.printStackTrace();
           		}

			catch(MyOwnException moe) //if operands < operators || if there are two or more elements in the stack and there are no more operators
           		{
				System.out.println("\n");
                		moe.printStackTrace();
           		}
		   	
			catch(EmptyStackException empse) // if the stack is empty
           		{
				System.out.println("        Wrong Expression."+"\n"+"        Please enter again!!!"+"\n");
                		empse.printStackTrace();
           		}
			
			catch(Exception e) // to catch any error which is not caught by the above ones
			{	
				System.out.println("        Wrong Expression."+"\n"+"        Please enter again!!!"+"\n");
				e.printStackTrace();
			}
	
			System.out.println("\n");
	
			System.out.print( "     Do you want to continue := y/n\n     " ); //offering choice to continue
		
			Scanner c = new Scanner(System.in);
		
			char choice = c.next().charAt(0);
		
			if(choice == 'y' || choice == 'Y')
				retry = false;
			else
				retry = true;
	 	}
	
	}//End of main function 
	
}
