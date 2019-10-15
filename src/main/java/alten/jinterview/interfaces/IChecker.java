package alten.jinterview.interfaces;

import alten.jinterview.exceptions.InvalidInputException;

public interface IChecker {

	boolean isValid(int[] values) throws InvalidInputException;

	boolean checkForTheSum(int[] values, int sum);

	boolean checkForTheSumRecursive(int[] values, int sum);

}