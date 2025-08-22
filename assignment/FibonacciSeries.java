package week1.day2.assignment;

public class FibonacciSeries {
	public static void main(String[] args) {
		 int a=-1;
		int b=1;
				System.out.println("First 15 Fibonnaci Series:");
				for (int i = 0; i < 15; i++) {
					int c=a+b;
					System.out.println(c);
					 a=b;
					 b=c;
				}
				
				
	}

}
