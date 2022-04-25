/**
 * 
 * Approach:
 * 
 *  - Revert half of the number
 *  
 *  1. x can not less than 0
 *  2. x can not divided by 10 and no reminded
 *  
 *  3. revert half of the number
 *  
 *  3.1 if the element is odd:
 *  
 *  x = 12321
 *  
 *  compare 12 with reverted number 12 (123/10)
 *  
 *  3.2 if the element is even:
 *  
 *  x = 1221
 *  
 *  compare 12 with reverted number 12
 *  
 *  
 *  
 *  x = 12321
 *  
 *  
 *
 */
public class PalindromeNumber9 {
	
	
	public boolean isPalindrome(int x) {
		
		if(x < 0 || x % 10 == 0 & x != 0) {
			return false;
		}
		
		
		int revertedNumber = 0;
		
		
		//reverted hald of the number
		while(x > revertedNumber) {
			
			revertedNumber = revertedNumber * 10 + x % 10;
			
			x = x/10;
		}
		
		// if x has even element, x == reverted number -> reversed is the same
		// if x has odd element, x == reverted number/10 -> reversed is the same
		return x == revertedNumber || x == revertedNumber/10;
		
	
	}

}
