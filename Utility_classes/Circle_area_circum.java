public class Circle_area_circum
{
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("                       This program calculates the area and circumference of Circle             ");
			double r,c;
			int count;
			r=Validator.getDouble("Enter the radius ");
			Circle obj1;
			obj1=new Circle(r);
			c=obj1.getCircumference();
			count=Circle.getObjectCount();
			System.out.println("Number of Objects created:"+count);
		}	
	}
}

