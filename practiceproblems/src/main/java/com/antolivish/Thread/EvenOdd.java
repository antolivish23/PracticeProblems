package com.antolivish.Thread;

/**
 * In progress
 */
public class EvenOdd implements Runnable {

	private Integer max;

	private Print print;

	private boolean isEven;

	public EvenOdd( Integer number, Print print, boolean isEven )
	{
		this.max = number;
		this.print = print;
		this.isEven = isEven;
	}

	public EvenOdd( Integer max, Print print )
	{
		this.max = max;
		this.print = print;
	}

	@Override
	public void run()
	{
		int number = isEven ? 2 : 1;
		while( number < max )
		{
			print.printZero();
			if( isEven )
			{
				print.printEven(number);
			}
			else
			{
				print.printOdd(number);
			}
			number = number + 2;
		}
	}
}

class Print {

	private boolean isOdd = false;
	private boolean printZero = true;

	synchronized void printEven( Integer number )
	{
		while( !isOdd )
		{
			try
			{
				wait();
			}
			catch( Exception e )
			{
				Thread.currentThread().interrupt();
			}
		}
//		System.out.println(Thread.currentThread().getName() + " : " + number);
		System.out.println(number);
		printZero = true;
		notifyAll();
		isOdd = false;
		notifyAll();
	}

	synchronized void printOdd( Integer number )
	{
		while( isOdd )
		{
			try
			{
				wait();
			}
			catch( Exception e )
			{
				Thread.currentThread().interrupt();
			}
		}
//		System.out.println(Thread.currentThread().getName() + " : " + number);
		System.out.println(number);
		printZero = true;
		notifyAll();
		isOdd = true;
		notifyAll();
	}

	synchronized void printZero()
	{
		while( !printZero )
		{
			try
			{
				wait();
			}
			catch( Exception e )
			{
				Thread.currentThread().interrupt();
			}
		}
		System.out.print("0");
		printZero = false;
		notifyAll();
	}

}

class Test {

	public static void main( String[] args )
	{
		Print print = new Print();
		Thread t1 = new Thread(new EvenOdd(10, print, false), "Odd");
		Thread t2 = new Thread(new EvenOdd(10, print, true), "Even");
		Thread t3 = new Thread(new EvenOdd(10, print), "zero");
		t3.start();
		t1.start();
		t2.start();
	}
}