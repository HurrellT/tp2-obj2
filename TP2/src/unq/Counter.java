package unq;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> counter = new ArrayList<>();

	public void addNumber(int i) {
		counter.add(i);
	}
/*
	public int getEvenOcurrences() {
		int total = 0;
		for (int n:counter) {
			if (n % 2 == 0) {
				total = +n;
			}
		}
		return total;
	}
*/
	public int getEvenOcurrences() {
		int total = 0;
		for (int n:counter) {
			if (n % 2 == 0) {
				total++;
			}
		}
		return total;
	}
	
	public int getUnevenOcurrences() {
		int total = 0;
		for (int n:counter) {
			if (n % 2 == 1) {
				total++;
			}
		}
		return total;
	}
	
	public int getMultiplesOcurrences(int x) {
		int total = 0;
		for (int n:counter) {
			if (n % x == 0) {
				total++;
			}
		}
		return total;
	}
	
	
}