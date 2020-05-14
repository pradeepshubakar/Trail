package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.Baseclass1;

public class Demo extends Baseclass1 {
	@Test
	public void test() {
		Reporter.log("hi",true);
}
}
