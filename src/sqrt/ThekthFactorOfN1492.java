package sqrt;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 1492. The kth factor of n
 * 
 * - you are given 2 positive integers n and k.
 * - factor: is defined as an integer i where n % i == 0.
 * 
 * - Considering a list of all factors of n sorted in ascending order,
 *   return the kth factor in the list
 *   or return -1 if n has less than k factors.
 *   
 *   
 *   Input: n = 12, k = 3
 *   Output: 3
 *   Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
 * 
 * 
 * Approach : Math O(sqrt(N)) time
 * 
 * 
 * 
 *
 */

public class ThekthFactorOfN1492 {
	
	public int kthFactor(int n, int k) {
		
		List<Integer> divisors = new ArrayList<>();
		
		// sqrt() : return the square root of a number
		int sqrtN = (int) Math.sqrt(n); // find number of factor in n
		
		for(int x = 1; x < sqrtN + 1; x++) {
			
			if(n % x == 0) {
				k--;
				divisors.add(x);
				
				if(k == 0) {
					return x;
				}
			}
			
		}
		
		
		if(sqrtN * sqrtN == n) {
			k++;
		}
		
		int nDiv = divisors.size();
		
		return (k <= nDiv) ? n / divisors.get(nDiv - k) : -1;
	}

}
