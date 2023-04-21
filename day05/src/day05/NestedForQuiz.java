package day05;

public class NestedForQuiz {
	
	public static void main(String[] args) {
			
	for (int x = 1; x <= 15; x++) {
	    for (int y = 1; y <= 12; y++) {
	        int result = 4 * x + 5 * y;
	        if (result == 60) {
	            System.out.println("x = " + x + " , y = " + y );
	        	}
	    	}
		}
	}
}