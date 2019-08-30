package com.antolivish.Logical;

import java.util.ArrayList;
import java.util.List;

public class GridConnections {

	static int findQualifiedNumbers( List<List<Integer>> matrix )
	{

		Integer connections = 0;
		int rowSize = matrix.size();
		int columnSize = matrix.get(0).size();
		for( int i = 0; i < rowSize; i++ )
		{
			for( int j = 0; j < columnSize; j++ )
			{
				if( matrix.get(i).get(j) == 1 )
				{
					if( j + 1 < columnSize && matrix.get(i).get(j + 1) == 1 )
					{
						connections++;//horizontal
					}
					if( i + 1 < rowSize && matrix.get(i + 1).get(j) == 1 )
					{
						connections++;//vertical
					}
					if( i + 1 < rowSize && j + 1 < columnSize && matrix.get(i + 1).get(j + 1) == 1 )
					{
						connections++;//diagonal
					}
					if( i + 1 < rowSize && j - 1 >= 0 && matrix.get(i + 1).get(j - 1) == 1 )
					{
						connections++;//diagonal
					}
				}
			}

		}
		return connections;
	}

	public static void main( String[] args )
	{
		List<List<Integer>> array = new ArrayList();
		List<Integer> row1 = new ArrayList();
		row1.add(1);
		row1.add(0);
		row1.add(0);
		row1.add(1);
		array.add(row1);
		List<Integer> row2 = new ArrayList();
		row2.add(0);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		array.add(row2);
		List<Integer> row3 = new ArrayList();
		row3.add(1);
		row3.add(0);
		row3.add(0);
		row3.add(1);
		array.add(row3);
		System.out.println(findQualifiedNumbers(array));
	}

}
