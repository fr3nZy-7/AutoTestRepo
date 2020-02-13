package exceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String str = "Amey";
			
			System.out.println(str.charAt(5));	
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}


/*
 * 						Throwable 
 * _______________________________________________________________________________
 * -Error												-Exceptions
 * _______________________________________________________________________________
 * ->StackOverfow					-Checked exception 				-Unchecked exceptions
 * ->JVM related					->InterruptedException			->RunTime exceptions
 * ->Memory related					->SQLException						->ArithmaticExceptions
 * 									->IOException						->NullPOintrException
 * 									->File not found exception			->String Index out of bound
 * 									->etc								->Array index - etc.
 * 
 * 
 * 
 */
