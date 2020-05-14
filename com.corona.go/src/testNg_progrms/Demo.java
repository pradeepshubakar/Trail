package testNg_progrms;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

//@Listeners(com.actitime.generics.ListenerImplementation.class)
public class Demo  {

	@Test
	public void testDemo() {
		Reporter.log("Hi jo darling",true);
	}
	
	@Test
	public void testDemo1() {
		Reporter.log("Hi Pradi",true);
	}
	@Test
	public void testDemo2() {
		Reporter.log("Hi Ami dear");
		Assert.fail();
		
	}
}
