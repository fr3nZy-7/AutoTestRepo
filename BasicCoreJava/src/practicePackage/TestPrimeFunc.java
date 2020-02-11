package practicePackage;

import practicePackage.PrimeFunction;

public class TestPrimeFunc {

	public static void main(String[] args) {
		
		int arr[] = { 2, 5, 4, 7, 80, 87, 23, 21, 29, 11, 12, 32, 15, 9 , 6, 4};
		int l = arr.length;
		
		PrimeFunction obj = new PrimeFunction();
		
		for (int i = 0; i < l; i++) {
			
			if (obj.checkPrime(arr[i]) == 1) {
				System.out.println(arr[i] + " is not a prime number");
			} 
			
			if(obj.checkPrime(arr[i])==0) {
				System.out.println(arr[i] + " is a prime number");
			}
		}

	}

}
