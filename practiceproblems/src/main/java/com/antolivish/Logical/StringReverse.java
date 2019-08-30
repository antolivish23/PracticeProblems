package com.antolivish.Logical;

import java.util.Arrays;

/**
 * Program to reverse the string - complexity n/2
 */
public class StringReverse {

	public static void main( String[] args )
	{
		String input = "AntoLivish";
		System.out.println(input);
		char[] chars = input.toCharArray();

		int beginIndex = 0;
		int endIndex = chars.length;
		while( beginIndex < endIndex )
		{
			char temp = chars[beginIndex];
			chars[beginIndex] = chars[endIndex - 1];
			chars[endIndex - 1] = temp;

			beginIndex++;
			endIndex--;
		}


		System.out.println(String.valueOf(chars));
	}

}
