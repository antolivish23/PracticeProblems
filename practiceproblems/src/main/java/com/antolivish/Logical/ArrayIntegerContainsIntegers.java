package com.antolivish.Logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Find elements in an array in which element has integer 1,2,3 in it
 */
public class ArrayIntegerContainsIntegers {

	static String findQualifiedNumbers(int[] numberArray)
	{
		List<Integer> result = new ArrayList<>();
		for( int i : numberArray )
		{
			String temp = String.valueOf(i);
			if( temp.contains("1") && temp.contains("2") && temp.contains("3"))
			{
				result.add(i);
			}
		}

		Collections.sort(result);
		StringBuilder sb = new StringBuilder();
		result.forEach(integer -> sb.append(integer + ","));
		if(!result.isEmpty())
		{
			int lastIndexOf = sb.lastIndexOf(",");
			return sb.toString().substring(0, lastIndexOf);
		}
		return "-1";
	}

	public static void main( String[] args )
	{
		int[] array = new int[4];
		array[0] = 1456;
		array[1] = 345671;
		array[2] = 1456;
		array[3] = 1456;
		System.out.println(findQualifiedNumbers(array));
	}
}
