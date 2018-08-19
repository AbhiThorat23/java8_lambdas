package com.learntocode.lambdaWithTreeMap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Demo Program to Sort elements of TreeMap according to Customized Sorting
 * Order(Descending Order): Without Lambda
 * 
 * @author Abhijit Thorat
 */
public class CustomizedSortingOfTreeMapWithotLambda {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(new MyComparator());
		treeMap.put(1, "Abhijit");
		treeMap.put(6, "Mohan");
		treeMap.put(3, "Shuklendu");
		treeMap.put(8, "Ashish");
		treeMap.put(2, "Kiran");
		treeMap.put(10, "Jhon");
		System.out.println("Sorted TreeSet in Descedning order:" + treeMap);
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
