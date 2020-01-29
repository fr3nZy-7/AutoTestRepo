package array;

public class ArrayClass {

	public static void main(String[] args) {
		
		
		String[] str = new String[10];
		
		str[0]="Amey";
		str[1]="Gaurav";
		str[2]="Abhi";
		str[3]="Hazel";
		str[4]="Tijil";
		str[5]="Shashank";
		str[6]="Komal";
		str[7]="Anand";
		str[8]="Manoj";
		str[9]="Ankita";
		
		
		/*
		 * for (int i=0;i<10;i++) {
		 * 
		 * System.out.println(str[i]); }
		 */
		
		
		for(String s:str) { //enhanced for loop or for each loop
			System.out.println(s);
		}
		

	}

}
