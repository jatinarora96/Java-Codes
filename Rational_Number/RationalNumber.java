

/**
 * A rational number given by a numerator and denominator.
 */
public class RationalNumber {

	/**
	 * The numerator is given as an integer number.
	 * It is always 0 if this RationalNumber is 0.
	 */
	private int numerator;
	/**
	 * The denominator is given as an integer number greater than zero.
	 * It is always 1 if this RationalNumber is 0.
	 */
	private int denominator;

	private int gcd;

	/**
	 * Creates a new RationalNumber with given numerator and denominator.
	 * @param numerator an arbitry integer number
	 * @param denominator an integer not equal to zero
	 */
	public RationalNumber(int num, int den) {
		this.numerator = num;
		if (num == 0) {
			denominator = 1;
		}
		if (den == 0) {
			throw new RuntimeException("Denominator is Zero");
		}else{
			this.denominator = den;
		}
		reduceFraction();
	}
	
	//Default constructor

	public RationalNumber() {
		this(0);
		
	}

	//contructor taking numerator as arguments - constuctor chaining

	public RationalNumber(int num) {
		this.numerator = num;
		this.denominator = 1;
	}

		
	/**
	 * Returns the greates common divisor of two positive integer numbers.
	 */

	private int getGcd(int p, int q) {
			p = Math.abs(p);
			q = Math.abs(q);
			int r = p%q;
			while (r > 0) {
				p = q;
				q = r;
				r = p%q;
			}
			//System.out.println("GCD::"+q);
			return q;
	}

	/**
	 * Reduces the fraction of numerator and denominator by their
	 * greatest common divisor.
	 */
	private void reduceFraction() {
		this.gcd = getGcd(Math.abs(numerator), denominator);
		//int num, den;

		if (gcd > 0) {
			numerator = numerator / gcd;
			denominator = denominator / gcd;

		}

	}

	public int getGcd(){
		return this.gcd;
	}


	/**
	 * Returns the denominator of this RationalNumber.
	 * It is zero, if this RationalNumber is zero.
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Returns the numerator of this RationalNumber.
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Returns the value of this RationalNumber as a double value.
	 */
	public double getDoubleValue() {
		return (double) numerator / (double) denominator;
	}
	
	/**
	 * Returns the value of this RationalNumber as a double value.
	 */

	//This method returns the reciprocal of a rational number

	public  RationalNumber reciprocal()
	{	//toString();
		return new RationalNumber(getDenominator(),getNumerator());
	}

	//this method multiplies two rational numbers

	public RationalNumber multiply(RationalNumber obj2)
	{	//toString();
		int num = getNumerator()*obj2.getNumerator();
		int den = getDenominator()*obj2.getDenominator();
		return new RationalNumber(num,den);
	}

	//this method adds two rational numbers

	public RationalNumber add(RationalNumber obj2)
	{
		int den1= getDenominator()*obj2.getDenominator(); 
		int num1= getNumerator()*obj2.getDenominator();
		int num2= getDenominator()*obj2.getNumerator();
		int num = num1+num2;
		//toString();
		return new RationalNumber(num,den1);
	}
	
	//this method subtracts two rational numbers

	public RationalNumber subtract(RationalNumber obj2)
	{	
		int den1= getDenominator()*obj2.getDenominator();
                int num1= getNumerator()*obj2.getDenominator();
                int num2= getDenominator()*obj2.getNumerator();
                int num = num1-num2;
                return new RationalNumber(num,den1);
	}
	//this method divides using reciprocal method

	public RationalNumber divide(RationalNumber obj2)
	{
		return multiply(obj2.reciprocal());
	}	
	
	//This method overrides the tostring() function
	
	public void toString(RationalNumber obj)
	{	String s1,s2;
		if(obj.getNumerator()=='0'){
			s1= Integer.toString(obj.getNumerator());
			System.out.println("The converted string is: "+s1);}
		else if (obj.getNumerator() !='0'&& obj.getDenominator()=='1'){
			s1= Integer.toString(obj.getNumerator());
			System.out.println("The converted string is: "+s1);}
		else if (obj.getNumerator() !='0'&& obj.getDenominator() !='1'){
			s1= Integer.toString(obj.getNumerator());
			s2= Integer.toString(obj.getDenominator());
			System.out.println("The converted string is: "+s1+"/"+s2);
		}
	
	}		

}
