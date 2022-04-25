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
 * input n = 25 k = 3
 * 
 * factor: 1, 5, 5, 25
 * 
 * use for loop to find the factor of sqrt n
 * 
 * the factor of sqrt n: list[ 1, 5 ] k = 1
 * 
 * 25 is perfect square k + 1 = 2
 * 
 * ans = 25/ index of list 2(list size) - 2(k)  = 25 / 1 = 25
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */

public class ThekthFactorOfN1492 {
	
	public int kthFactor(int n, int k) {
		
		List<Integer> divisors = new ArrayList<>(); // store the factor of sqrt n
		
		// sqrt() : return the square root of a number
		int sqrtN = (int) Math.sqrt(n); // find number of factor in sqrt n
		
		for(int x = 1; x < sqrtN + 1; x++) {
			
			// if n % x == 0, which means x is the factor of n
			if(n % x == 0) {
				k--; 
				divisors.add(x); // add x in the list
				
				if(k == 0) { // if k == 0, which means we found the kth factor
					return x; // so return the answer
				}
			}
			
		}
		
		// if n is the perfect square, need to add 1 in k 
		if(sqrtN * sqrtN == n) {
			k++;
		}
		
		int nDiv = divisors.size();
		
		// if the remaining k is less than the size of divisor
		// n / (divisor's size - k)
		return (k <= nDiv) ? n / divisors.get(nDiv - k) : -1;
	}

}


/**
 * time: O(sqrt n)
 * 
 * space: O(min(k, sqrt n)) to store the list of divisors.
 */
