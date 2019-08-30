package com.antolivish.Logical;

import java.util.Date;

/**
 * Fibonacci series - recursive and dynamic programming
 */
public class fibonacci {

//	static Long compute( Long n )
//	{
//		Long a = 0L;
//		Long b = 1L;
//		Long c;
//		if( n <= 1 )
//		{
//			return a;
//		}
//		for( int i = 2; i < n; i++ )
//		{
//			c = a + b;
//			a = b;
//			b = c;
//		}
//		return b;
//	}
//
//	public static void main( String[] args )
//	{
//		long l = System.currentTimeMillis();
//		System.out.println(new Date());
//		System.out.println(compute(100L));
//		System.out.println(new Date());
//		System.out.println("computation time in ms - " + (System.currentTimeMillis() - l));
//	}

	static int fib( int n )
	{
		if( n <= 1 )
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main( String args[] )
	{
		int n = 50;
		long l = System.currentTimeMillis();
		System.out.println(new Date());
		System.out.println(fib(n));
		System.out.println(new Date());
		System.out.println("computation time in ms - " + (System.currentTimeMillis() - l));
	}

}
