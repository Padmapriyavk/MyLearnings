package week1.day2.assignment;

public class IsPrime {

	public static void main(String[] args) {
		int n=11;
		int f,i;
		if(n==2)
			System.out.println(n+" is a prime number");
		else if(n%2==0||n==1)
			System.out.println(n+" is not a prime");
		else
		{
			f=0;
			for(i=3;i<n/2;i+=2)
			{
			if(n%i==0)
				{
					f=1;
					break;
				}
			}
		      if(f==0)
		    	  System.out.println(+n+":is a prime number");
		      else
		    	  System.out.println(+n+":is not a prime number");
				
		}
	}

}
