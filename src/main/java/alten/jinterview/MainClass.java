package alten.jinterview;

import alten.jinterview.exceptions.InvalidInputException;

public class MainClass 


{
    public static void main( String[] args )
    {
        int[] values = {5, 7, -2, 10, -1, 3, 32, -10};
        
        int lowerBound = -10;
		int upperBound = 50;
		
		Checker checker = new Checker(lowerBound, upperBound);
		
		try {
			if(checker.isValid(values)) {
				System.out.println("Valid input");
			}
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(checker.checkForTheSum(values, 9));
		System.out.println(checker.checkForTheSumRecursive(values, 0));
    }
}
