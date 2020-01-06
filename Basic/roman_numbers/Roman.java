public class Roman
{
	public static void main(String[] args){
	String conv;
	int value;
	while(true){
	value=Validator.getInt("Enter the integer");
	conv=ITR.IntToRoman(value);
	System.out.println("The converted number is:"+conv);
	}
	}
	
}
