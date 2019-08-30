package com.antolivish.Logical;

/**
 * Print the matric in spiral order
 */
public class Spiral2DArray {

	public static void main( String[] args )
	{
		Integer array[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		int startingRow = 0;
		int endingRow = array.length;
		int startingColumn = 0;
		int endingColumn = array[0].length;

		while( startingRow < endingRow && startingColumn < endingColumn )
		{
			for( int index = startingColumn; index < endingColumn; index++ )
			{
				System.out.print(array[startingRow][index] + " ");
			}
			startingRow++;

			for( int index = startingRow; index < endingRow; index++ )
			{
				System.out.print(array[index][endingColumn - 1] + " ");
			}
			endingColumn--;

			if( startingRow < endingRow )
			{
				for( int index = endingColumn - 1; index >= startingColumn; index-- )
				{
					System.out.print(array[endingRow - 1][index] + " ");
				}
				endingRow--;
			}

			if( startingColumn < endingColumn )
			{
				for( int index = endingRow - 1; index >= startingRow; index-- )
				{
					System.out.print(array[index][startingColumn] + " ");
				}
				startingColumn++;
			}

		}
	}

}
