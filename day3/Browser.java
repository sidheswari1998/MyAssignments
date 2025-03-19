package week1.day3;

public class Browser {

	public void launchBrowser()
	{
		System.out.println("Browser launched");
	}
	
	public void loadUrl()
	{
		System.out.println("URL was Loaded");
	}
	
	
	public static void main(String[] args) {
		
		Browser obj = new Browser();
		obj.launchBrowser();
		obj.loadUrl();

	}

}
