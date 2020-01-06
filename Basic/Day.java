import java.lang.Math;
public class Day
{
	enum Days
	{   
		MONDAY(1), TUESDAY(2),WEDNESDAY(3), THURSDAY(4), FRIDAY(5),SATURDAY(6),SUNDAY(7);   
		private int value;  
		private Days(int value)
		{  
		this.value=value;  
		}  
		public int getDays()
		{
			return this.value;
		}
	}
	  
	public static void calc(int day,int month,int year)
	{ 
		int k=day;
		int m=month;
		int d;
		d=year%100;
		int c,f;
		c=year/100;	
		int inter1,inter2,inter3;
		inter1=Math.round((13*m-1)/5);
		inter2=Math.round(d/4);
		inter3=Math.round(c/4);
		f=k+inter1+d+inter2+inter3-(2*c);
		int z,a=0;
		if(f<=0)
		{
			System.out.println("f="+f);
			while((f+a)<0){
				a=a+7;
			}
			z=f+a;
		}
		else
			z=f%7;
		if(z==Days.MONDAY.getDays())
			System.out.println("Monday");
		else if(z==Days.TUESDAY.getDays())
			System.out.println("Tuesday");
		else if(z==Days.WEDNESDAY.getDays())
			System.out.println("Wednesday");
		else if(z==Days.THURSDAY.getDays())
			System.out.println("Thursday");
		else if(z==Days.FRIDAY.getDays())
			System.out.println("Friday");
		else if(z==Days.SATURDAY.getDays())
			System.out.println("Saturday");
		else if(z==Days.SUNDAY.getDays())
			System.out.println("Sunday");
	}
		
	public static void main(String args[])
	{  
		while(true)
		{	
		System.out.println("                       This programgives the day given the month and date");
		int day,year;
		int month;
		day=Validator.getInt("Enter the day of the month:",0,32);
		month=Validator.getInt("Enter the month:",0,13);
		year=Validator.getInt("Enter the year form 1900 onwards:");
		if(month<=2)
		{
			month=month+10;
			year=year-1;
		}
		else
			month=month-2;
		System.out.println(month);
		calc(day,month,year);
		}
	}
}
  
