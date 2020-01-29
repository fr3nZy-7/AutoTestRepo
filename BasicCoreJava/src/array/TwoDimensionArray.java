package array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		int rowCount = 4;
		int colCount =2;
				
		
		String[][] arr = new String[rowCount][colCount];
		// Row 1
		arr[0][0] = "UserName";
		arr[0][1]= "Password";
		
		for(int r=1; r<4;r++) {
			
			for(int c=0;c<2;c++) {
				
				if(c ==0) {
					arr[r][c]="User"+r;
				}else
				{
					arr[r][c]="Pass"+r;
				}
				
			}
		}
		
		
		
		for(int r=0;r<arr.length;r++) {					//length is used to dynamically
			for(int c=0;c<arr[r].length;c++) {			//get the length
				System.out.print(arr[r][c]);
			}
			System.out.println();
		}
		

	}

}
