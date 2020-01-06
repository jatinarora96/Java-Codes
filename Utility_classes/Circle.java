
import java.text.NumberFormat;
public class Circle
{

	private double radius;
	private static int counter = 0;	
	public Circle(double r)
	{	
		counter++;
		if(r==0)
		{
			throw new RuntimeException("Radius is Zero");
		}
		else
		{
			this.radius=r;
		}
	}
	
	public int getMinimumFractionDigits()
	{
		int min;
		min=Validator.getInt("Enter the number of minimum precision digits: ");
		return min;
	}
	
        public int getMaximumFractionDigits()
	{
		int max;
                max=Validator.getInt("Enter the number of maximum precision digits: ");
                return max;
        }


		
	public double getRadius()
	{
		return radius;
	}

	public double getCircumference()
	{	
		double c,a;
		String s;
		c=2*Math.PI*getRadius();
		s=getFormattedCircumference(c);
		System.out.printf("Formatted with precison of 2 decimal places: Cicumference ="+s+"\n");
		a=getArea();
		return c;
	} 
		
	public String getFormattedCircumference(double c)
	{
		NumberFormat nf =NumberFormat.getInstance();
		nf.setMinimumFractionDigits(getMinimumFractionDigits());
		nf.setMaximumFractionDigits(getMaximumFractionDigits());
		String conv = nf.format(c);
		return conv;
	}
	
	public double getArea()
	{
		double a;
		String s;
                a=Math.PI*Math.pow(getRadius(),2);
           	s=getFormattedArea(a);
            	System.out.printf("Formatted with precison of 2 decimal places: Area ="+s+"\n");
		return a;
	}
	
	public String getFormattedArea(double a)
        {
		NumberFormat nf =NumberFormat.getInstance();
              	nf.setMinimumFractionDigits(getMinimumFractionDigits());
		nf.setMaximumFractionDigits(getMaximumFractionDigits());
                String conv = nf.format(a);
                return conv;

        }

	public static int getObjectCount()
	{
		return counter;
	}
}	
	
