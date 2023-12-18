package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void AdditionTest() {
		
		ActualCalculator cal = new ActualCalculator();
		
		int actResult = cal.Add(5, 6);
		int expResult =11;
		
		Assertions.assertEquals(expResult, expResult);
		
	}

	@Test
   public void SubTest() {
		
		ActualCalculator cal = new ActualCalculator();
		
		int actResult = cal.Sub(11, 6);
		int expResult =5;
		
		Assertions.assertEquals(expResult, expResult);
		
	}
}
