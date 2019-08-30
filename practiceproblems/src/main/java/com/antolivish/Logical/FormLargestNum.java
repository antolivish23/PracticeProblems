package com.antolivish.Logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Form the largest integer from the array of elements
 */
public class FormLargestNum {

	public static void main( String[] args )
	{
		List<Integer> list = new ArrayList<>();
		list.add(54);
		list.add(546);

		list.add(60);

		list.add(548);

		list.sort(( o1, o2 ) -> o1.toString().compareTo(o2.toString()) * -1);

		list.forEach(System.out::print);

		Collections.sort(list);
	}

}
