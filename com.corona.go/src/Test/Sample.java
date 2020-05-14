package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.Baseclass1;

//@Listeners(com.actitime.generics.ListenerImplementation.class)
public class Sample extends Baseclass1 {

	@Test
	public void test() {
		Reporter.log("hi",true);
	}
}
