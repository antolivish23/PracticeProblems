package com.antolivish.Logical;

/**
 * Find the maximum consecutive elements in the string
 */
public class MaxConsecutiveElements {

	public static void main( String[] args )
	{
		String input = "aaabbcbcndffflmffmkv";

		char[] chars = input.toCharArray();

		String result = "";
		int count = 1;
		int computingCount = 1;
		for( int i = 0; i < chars.length; i++ )
		{
			if( i + 1 < chars.length && chars[i] == chars[i + 1] )
			{
				computingCount++;
			}
			else
			{
				computingCount = 1;
			}

			if( computingCount > count )
			{
				result = String.valueOf(chars[i]);
				count = computingCount;
			}
		}

		System.out.println(result);
		System.out.println(count);
	}

}
