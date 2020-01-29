package array;

public class IntegerArray {

	public static void main(String[] args) {
		
		int[] arr= new int[10];
		
		// can be also initialised as below
		//int[] arr = {1,2,3,4,5,6,7,8,9,10}
		
		//or
		
		/*
		 * arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4; arr[4]=5; arr[5]=.. so on;
		 */
		
		
		for(int i =0;i<10;i++) {
			arr[i] = i+1;
		}
		
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
