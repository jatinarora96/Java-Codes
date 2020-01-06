//To calculate the Body-Mass-Index(BMI).
//Author: Jatin Arora.

//----------------------------------------------------------Beginning---------------------------------------------------------------------------------------------//

public class BMI
{
	/**
	 *BMI calculations
	 */
	public static float bmi( )
	{
		double w;
		double h;
		w=Validator.getDouble("Enter the wieght in kgs ");
		h=Validator.getDouble("Enter the hieght in meters ");
		double index;
		index=w/(h*h);
		System.out.println("Your BMI is " + index);
		if(index < 18.5)
			System.out.println("You are Underweight");
		else if((index >= 18.5)&&(index < 25))
			System.out.println("You are Normalweight"); 
		else if((index >= 25)&&(index < 30))
                        System.out.println("You are Overweight");
		else if(index > 30)
                        System.out.println("You are Too Mascular");
			return 0;
	}
	public static void main(String[] args)
	{
		while(true){
		System.out.println("                       This program calculate your BMI            ");
		bmi();
		}
	}
}

//---------------------------------------------------------END------------------------------------------------------------------------------------------------------//
