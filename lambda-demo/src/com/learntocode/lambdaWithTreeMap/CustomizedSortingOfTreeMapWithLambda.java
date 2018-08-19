package com.learntocode.lambdaWithTreeMap;

import java.util.TreeMap;

/**
 * Demo Program to Sort elements of TreeMap according to Customized Sorting
 * Order(Descending Order): with Lambda
 * 
 * @author Abhijit Thorat
 */
public class CustomizedSortingOfTreeMapWithLambda {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>((I1, I2) -> (I1 < I2) ? 1 : (I1 > I2) ? -1 : 0);
		treeMap.put(1, "Abhijit");
		treeMap.put(6, "Mohan");
		treeMap.put(3, "Shuklendu");
		treeMap.put(8, "Ashish");
		treeMap.put(2, "Kiran");
		treeMap.put(10, "Jhon");
		System.out.println("Sorted TreeSet in Descedning order:" + treeMap);
	}
}
