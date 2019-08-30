package com.antolivish.Logical;

/**
 * find the different way in which one person can climb the stairs if he can take 1 or 2 or 3 steps
 */
public class StairsDiffWaysCount {

	public static void main( String[] args )
	{
		int n = 5;
		Integer[] stair = new Integer[n + 1];
		stair[0] = 1;
		stair[1] = 1;
		stair[2] = 2;

		for( int i = 3; i <= n; i++ )
		{
			//			if person can take 1 or 2 or 3 steps
			stair[i] = stair[i - 1] + stair[i - 2] + stair[i - 3];

			//			if person can take 1 or 2 steps, then
			//			stair[i] = stair[i - 1] + stair[i - 2];
		}
		System.out.println(stair[n]);

		//		kmp, lcs

	}

}
