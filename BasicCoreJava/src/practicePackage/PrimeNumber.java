package practicePackage;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 4;
		int flag = 0;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}

		}

		if (flag == 1) {
			System.out.println("Number is not prime");
		} else {
			System.out.println("Number is prime");
		}

	}

}
