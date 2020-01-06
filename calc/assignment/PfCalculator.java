package calc.assignment;
import java.util.*;
import java.lang.*;
public class PfCalculator
{
	//PfCalculator begins
	private static final String ADD = "+"; //assigning the binary operators
	private static final String SUB = "-";
	private static final String MUL = "*";
	private static final String DIV = "/";
	private static final String EXP = "^";
	private static final String MOD = "%";

	public static String evaluate(Queue<String> q)throws MyOwnException //method to evaluate the expression
	{
		double ans=0.0;
        
                String answer=" ";
		
				

		Stack<String> operand=new Stack<String>(); //initializing the stack of strings

		String ele,op1,op2; //ele stands for each element in the queue

		int operands=0,operators=0;

		double digit=0.0,operand1=0.0,operand2=0.0;

		ele=q.poll();//Retrieves and removes the head of this queue, or returns null if this queue is empty.

		if(ele==null)

			throw new NullPointerException("null");

		else
		{

			while(ele!=null) // running the loop till the last element of the queue is reached
			{	
				boolean number=true; //variable to detect if the element is a operand or an operator

				try
				{
					digit=Double.parseDouble(ele); 
				}

				catch(NumberFormatException e)
				{
					number=false;
				}

				if(number) //checking if the elements is a operand
				{
					operand.push(ele); //pushing the operand
					operands++;
				}

				else
				{
				//	ele=ele.replaceAll("\\s+",""); //removing all the white spaces before and after the operator 
					if( ele.equals(ADD) || ele.equals(SUB) || ele.equals(MUL) || ele.equals(DIV) || ele.equals(EXP) || ele.equals(MOD)  ) //checking if the element of the queue matches any of the pre-difined operator
					{
						operators++;
						op2=operand.pop(); //removing two elemnts in the stack
						op1=operand.pop();
				                operand2 = Double.parseDouble(op2); //converting them to double
				                operand1 = Double.parseDouble(op1);
				                switch(ele) 
						{
				                    case ADD: {
					                        double local = operand1 + operand2; //performing the operation 
								String temp = Double.toString(local); //converting it back to string
					                        operand.push(temp); //pushing it back to the stack
					                        break;
                    					      }

				                    case SUB: {
								double local = operand1 - operand2;//performing the operation
                                                                String temp = Double.toString(local);//converting it back to string
                                                                operand.push(temp);//pushing it back to the stack
                                                                break;
                    					      }	

				                    case MUL: {
								double local = operand1 * operand2; //performing the operation
                                                                String temp = Double.toString(local); //converting it back to string
                                                                operand.push(temp); //pushing it back to the stack
                                                                break;
						              }

				                    case DIV: {
								double local = operand1 / operand2; //performing the operation
                                                                String temp = Double.toString(local); //converting it back to string
                                                                operand.push(temp); //pushing it back to the stack
                                                                break;
                    					      }

						    case EXP: {
                                                                double local = Math.pow(operand1,operand2); //performing the operation
                                                                String temp = Double.toString(local); //converting it back to string
                                                                operand.push(temp); //pushing it back to the stack
                                                                break;
                                                              }

                  			            case MOD: {
                                                                double local = operand1%operand2; //performing the operation
                                                                String temp = Double.toString(local); //converting it back to string
                                                                operand.push(temp); //pushing it back to the stack
                                                                break;
                                                              }


                				}
            				} 
					else 
					{
						System.out.println("\n        Symbol not detected !!!"); //if any other symbol is present other than the predefined ones
						throw new NumberFormatException();
            				}

					
				  }
				ele=q.poll(); //Retrieves and removes the head of this queue, or returns null if this queue is empty one by one
			}
			if((operators == operands-1) && (operand.size() == 1)) //checking if the number of operators is less than the number of operands and if the resulting stack contains only one element
				return operand.pop(); // returning the answer to the callee i.e. TestClac
			else 
			{
				operand.clear(); //clearing the stack
				throw new MyOwnException("This expression is not correct there is no operator corresponding to the operands\n");
			}
		}
		
	}
		
		
		
}//End of PfCalculator
	
