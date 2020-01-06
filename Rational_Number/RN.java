public class RN
{
	public static void main(String[] args)
	{
		while (true)
		{
                System.out.println("                       This program does calculations on RATIONAL NUMBERS             ");
		int n;
                int d;
                n=Validator.getInt("Enter the numerator ");
                d=Validator.getInt("Enter the denominator ");

		RationalNumber obj1;
		obj1=new RationalNumber(n,d);
		RationalNumber obj2;
		obj2=new RationalNumber(6,7);
		RationalNumber obj3;
		//ob1=new RationalNumber();
		obj3=obj1.multiply(obj2);
		System.out.println("\nAfter multiplying with 6/7\n ");
		obj3.toString(obj3);
		System.out.println("\nAfter dividing with 6/7\n ");
		obj3=obj1.divide(obj2);
		obj3.toString(obj3);
		System.out.println("\nAfter adding with 6/7\n ");
		obj3=obj1.add(obj2);
                obj3.toString(obj3);
		System.out.println("\nAfter subtractinging with 6/7\n ");
		obj3=obj1.subtract(obj2);
                obj3.toString(obj3);
		}
	}
}


		
		
		

