package com.learntocode.lambdaWithArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Demo Program to Sort elements of ArrayList according to Customized Sorting
 * Order(Descending Order): with Lambda
 * 
 * @author Abhijit Thorat
 */
public class CustomizedSortingOfArrayListWithLambda {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println("Before Sorting:" + l);

		// As Comparator interface is functional interface and
		// it contains only one public abstract method "compare()" which accepts two
		// parameter and returns int value, We can replace it's implementation with
		// lambda Expression
		Collections.sort(l, (I1, I2) -> (I1 < I2) ? 1 : (I1 > I2) ? -1 : 0);

		System.out.println("After Sorting:" + l);
	}
}
