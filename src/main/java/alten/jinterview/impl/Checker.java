package alten.jinterview.impl;

import java.util.Arrays;

import alten.jinterview.exceptions.InvalidInputException;
import alten.jinterview.interfaces.IChecker;

public class Checker implements IChecker {
	
	private int lowerBound;
	private int upperBound;
	
	public Checker(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	public boolean isValid(int[] values) throws InvalidInputException {
		
		if(values == null) {
			throw new IllegalArgumentException("The input array cannot be null");
		}
		for (int value : values) {
			if(value < this.lowerBound || value > this.upperBound) {
				throw new InvalidInputException("The input array contains invalid values");
			}
		}
		return true;
	}
	
	public boolean checkForTheSum(int[] values, int sum) {
		int left = 0;
		int right = values.length - 1;
		Arrays.sort(values);
		
		while(left < right) {
			if(values[left] + values[right] < sum) {
				left++;
			} else if (values[left] + values[right] > sum) {
				right--;
			} else {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkForTheSumRecursive(int[] values, int sum) {
		Arrays.sort(values);
		return checkForTheSumRecursiveHelper(values, sum, 0, values.length - 1);
	}
	
	private boolean checkForTheSumRecursiveHelper(int[] values, int sum, int left, int right) {
		if(left >= right) {
			return false;
		}
		if(values[left] + values[right] == sum) {
			return true;
		}
		if (values[left] + values[right] < sum) {
			left++;
		}
		if (values[left] + values[right] > sum) {
			right--;	
		}
		return checkForTheSumRecursiveHelper(values, sum, left, right);
	}
}
