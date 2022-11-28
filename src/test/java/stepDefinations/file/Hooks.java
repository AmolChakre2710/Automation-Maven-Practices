package stepDefinations.file;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before ("@MobileTest")
	public void beforemobilevalidation()
	{
		System.out.println("Before Mobile validation is done");
	}
	
	@After ("@MobileTest")
	public void afremobilevalidation()
	{
		System.out.println("After Mobile validation is done");
	}
	
	@Before ("@WebTest")
	public void beforewebvalidation()
	{
		System.out.println("Before Web validation is done");
	}
	
	@After ("@WebTest")
	public void afrewebvalidation()
	{
		System.out.println("After Web validation is done");
	}


}
