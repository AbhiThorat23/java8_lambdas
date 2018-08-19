package com.learntocode.lambdaWithTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Demo Program to Sort elements of TreeSet according to Customized Sorting
 * Order(Descending Order): Without Lambda
 * 
 * @author Abhijit Thorat
 */
public class CustomizedSortingOfTreeSetWithotLambda {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		System.out.println("Sorted TreeSet using Comparator in descending order:" + t);
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
