package calc.assignment;
public class MyOwnException extends IllegalArgumentException
{

        public MyOwnException() //default constructor
        {
		super("MyOwnException");
	}
        public MyOwnException(String message) // parametrized constructor
        {
		super(message);
		
        }
	public MyOwnException(Throwable o) // parametrized constructor
	{
		super(o);
	}
}
