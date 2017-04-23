package unq;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> numbers = new ArrayList<>();
	
	public void addNumber(int i) {
		numbers.add(i);
	}
	
	public int sumNumbers() {
		int res = 0;
		for (int n:numbers) {
			res = res + n; 
		}
		return (res);
	}
	
	public int restNumbers() {
		int res = 0;
		for (int n:numbers) {
			if (numbers.indexOf(n) == 0) {
				res = n;	
			}
			else {
				res = res - n;
			}
		}
		return (res);
	}
	
	public int multiplyNumbers() {
		int res = 0;
		for (int n:numbers) {
			if (numbers.indexOf(n) == 0) {
				res = n;	
			}
			else {
				res = res * n;
			}
		}
		return (res);
	}
}
