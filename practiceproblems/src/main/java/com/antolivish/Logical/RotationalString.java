package com.antolivish.Logical;

/**
 * Check whether the input strings are rotational
 */
public class RotationalString {

	static boolean areRotational(String a, String b)
	{
		return (a.length() == b.length()) && (a + a).contains(b);
	}

	public static void main( String[] args )
	{
		String a = "ABCD";
		String b = "BCDA";
		System.out.println(areRotational(a, b));
	}
}
