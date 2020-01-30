package functions;

public class Function4 {

	public static void main(String[] args) {
		
		float p = percent(52,57,65,81,87);
		
		System.out.println(p);

	}
	
	public static float percent(float PhyMarks, float CheMarks, float MathMarks, float EngMarks, float CSciMarks) {
		
		float totalMarks = PhyMarks + CheMarks + MathMarks + EngMarks + CSciMarks;
		
		float percentage = (totalMarks/500)*100;
		
		return percentage;
	}

}
