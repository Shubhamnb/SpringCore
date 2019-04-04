import java.util.Scanner;

public class leapyear 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int yr=s.nextInt();
		if(yr %100== 0)
		{
			if(yr %400==0)
				System.out.println("Given year is leap year");
			else
			System.out.println("Give yr is not leap year");	
		}
		else
			if(yr%4==0)
				System.out.println("Leap year");
			else
				System.out.println("Not leap year");
	}
}
