package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class palindromeTest {
	
	
	@Test
	public void PostiveTest() {
		
		PalindromeCheck obj1 = new PalindromeCheck();
		Assertions.assertEquals(true, obj1.isPalindrome("madam"));
		
	}
	

	@Test
	public void NegativeTest() {
		
		PalindromeCheck obj1 = new PalindromeCheck();
		Assertions.assertEquals(false, obj1.isPalindrome("nikunj"));
		
	}


}

