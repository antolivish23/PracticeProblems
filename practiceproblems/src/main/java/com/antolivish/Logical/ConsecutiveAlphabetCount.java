package com.antolivish.Logical;

/**
 * Print the input string in an encoded format Eg aaabbcc as a3b2c2
 */
public class ConsecutiveAlphabetCount {

	public static void main( String[] args )
	{
		String input = "AANNTTTTOLIVISH";
		char[] chars = input.toCharArray();
		int count = 1;

		for( int i = 0; i < chars.length; i++ )
		{
			if( i + 1 < chars.length && chars[i] == chars[i + 1] )
			{
				count++;
			}
			else
			{
				System.out.print(String.valueOf(chars[i]) + count);
				count = 1;
			}
		}
	}

}
