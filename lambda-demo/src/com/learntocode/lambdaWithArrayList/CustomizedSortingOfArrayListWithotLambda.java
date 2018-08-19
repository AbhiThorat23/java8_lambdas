package com.learntocode.lambdaWithArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Demo Program to Sort elements of ArrayList according to Customized Sorting
 * Order(Descending Order):
 * 
 * @author Abhijit Thorat
 */
public class CustomizedSortingOfArrayListWithotLambda {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println("Before Sorting:" + l);
		Collections.sort(l, new MyComparator());
		System.out.println("After Sorting:" + l);
	}
}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer I1, Integer I2) {
		if (I1 < I2) {
			return +1;
		} else if (I1 > I2) {
			return -1;
		} else {
			return 0;
		}

		// return (I1>I2)?-1:(I1<I2)?1:0;
	}

}
