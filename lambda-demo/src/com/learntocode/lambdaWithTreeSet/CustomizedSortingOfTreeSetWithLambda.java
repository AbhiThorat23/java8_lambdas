package com.learntocode.lambdaWithTreeSet;

import java.util.TreeSet;

/**
 * Demo Program to Sort elements of TreeSet according to Customized Sorting
 * Order(Descending Order): with Lambda
 * 
 * @author Abhijit Thorat
 */
public class CustomizedSortingOfTreeSetWithLambda {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>((I1, I2) -> (I1 < I2) ? 1 : (I1 > I2) ? -1 : 0);
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		System.out.println("Sorted TreeSet in Descedning order:" + t);
	}
}
