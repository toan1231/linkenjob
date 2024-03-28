package interview;

import org.testng.annotations.DataProvider;

public class DataiProvider {
	@DataProvider(name="hug")
	public Object[][]method(){
		return new Object[][] {
			                   {"toan","sdet"},
			                   {"hung","nailtech"},
			                   {"tan","developer"}
			                   };
		
	}

}
