package junit;

public class PalindromeCheck {
	
	
	public boolean isPalindrome(String name) {
		
		String reversedString = "";
		
		for (int i = name.length(); i > 0; i--) {
			reversedString = reversedString + name.charAt(i - 1);
		}
		
		if(name.equals(reversedString)) {
			return true;
		}else {
			return false;
		}
		
	}

}
