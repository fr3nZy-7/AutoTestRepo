package practicePackage;

public class PrimeNnumberArray {

	public static void main(String[] args) {
		int a[] = { 2, 4, 5, 6, 12, 19, 23, 11, 7, 8, 10, 4 };
		int flag;

		for (int i = 0; i < a.length; i++) {
			flag=0;
			for (int f = 2; f <=a[i] / 2; f++) {
				if (a[i] % f == 0) {
					flag = 1;
					break;
				}
			}

			if (flag == 1) {
				System.out.println(a[i] + " is not prime");
			} else {
				System.out.println(a[i] + " is prime");
			}

		}

	}

}
