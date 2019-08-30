package com.antolivish.Logical;

/**
 * Find the first unique character in the input string
 */
public class FirstUniqueChar {

	static void compute( char[] array )
	{
		char result = array[0];
		int count = 0;
		int computingCount = 1;
		for( int i = 0; i < array.length; i++ )
		{
			if( i < array.length - 1 && array[i] == array[i + 1] )
			{
				computingCount++;
			}
			else
			{
				if( computingCount > count )
				{
					count = computingCount;
					result = array[i];
				}
				else
				{
					computingCount = 1;
				}
			}
		}
		System.out.println(result);
	}

	public static void main( String[] args )
	{
		String input = "abcdenververbberb";
		compute(input.toCharArray());
	}

}
