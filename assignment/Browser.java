package week1.day2.assignment;

public class Browser {
	public void launchBrowser(String browserName)
	{
	System.out.println(browserName);	
	}
	
	public String loadUrl()
	{
		return "Url loaded successfully";
	}
	
	public static void main(String[] args) {
	 Browser br=new Browser();
	 br.launchBrowser("Chrome");
	System.out.println(br.loadUrl());
	}

}


	

