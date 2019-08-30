package com.antolivish.Algorithm;

import java.util.ArrayList;

/**
 * Refer GFG
 * Find the subsets in a matrix in which elements of each subset sum is the sum provided by the user
 */
public class SubsetSum {

	// dp[i][j] is going to store true if sum j is
	// possible with array elements from 0 to i.
	static boolean[][] dp;

	static void display( ArrayList<Integer> v )
	{
		System.out.println(v);
	}

	// A recursive function to print all subsets with the
	// help of dp[][]. Vector p[] stores current subset.
	static void printSubsetsRec( int arr[], int length, int sum, ArrayList<Integer> p )
	{
		// If we reached end and sum is non-zero. We print
		// p[] only if arr[0] is equal to sun OR dp[0][sum]
		// is true.
		if( length == 0 && sum != 0 && dp[0][sum] )
		{
			p.add(arr[length]);
			display(p);
			p.clear();
			return;
		}

		// If sum becomes 0
		if( length == 0 && sum == 0 )
		{
			display(p);
			p.clear();
			return;
		}

		// If given sum can be achieved after ignoring
		// current element.
		if( dp[length - 1][sum] )
		{
			// Create a new vector to store path
			ArrayList<Integer> b = new ArrayList();
			b.addAll(p);
			printSubsetsRec(arr, length - 1, sum, b);
		}

		// If given sum can be achieved after considering
		// current element.
		if( sum >= arr[length] && dp[length - 1][sum - arr[length]] )
		{
			p.add(arr[length]);
			printSubsetsRec(arr, length - 1, sum - arr[length], p);
		}
	}

	// Prints all subsets of arr[0..n-1] with sum 0.
	static void printAllSubsets( int arr[], int length, int sum )
	{
		if( length == 0 || sum < 0 )
			return;

		// Sum 0 can always be achieved with 0 elements
		dp = new boolean[length][sum + 1];
		for( int i = 0; i < length; ++i )
		{
			dp[i][0] = true;
		}

		// Sum arr[0] can be achieved with single element
		if( arr[0] <= sum )
			dp[0][arr[0]] = true;

		// Fill rest of the entries in dp[][]
		for( int i = 1; i < length; ++i )
		{
			for( int j = 0; j < sum + 1; ++j )
			{
				dp[i][j] = (arr[i] <= j) ? (dp[i - 1][j] || dp[i - 1][j - arr[i]]) : dp[i - 1][j];
			}
		}

		if( dp[length - 1][sum] == false )
		{
			System.out.println("There are no subsets with" + " sum " + sum);
			return;
		}

		// Now recursively traverse dp[][] to find all
		// paths from dp[n-1][sum]
		ArrayList<Integer> p = new ArrayList();
		printSubsetsRec(arr, length - 1, sum, p);
	}

	//Driver Program to test above functions
	public static void main( String args[] )
	{
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int sum = 10;
		printAllSubsets(arr, n, sum);
	}
}

