import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddMatrices{
	@Test
	//3*2 matrix 
	public void testAddtion() {
		int[][] t1 = {{1, 2}, {2, 3}, {5,4}};
		int[][] t2 = {{3, 4}, {6, 7}, {6,3}};
		int[][] expectResult = {{4,6},{8,10},{11,7}};
		int[][] result = new int[3][2];	
		MatrixAddition.addMatricies(t1,t2,result);
		for(int i = 0; i <  expectResult.length; i++){
		  for(int j = 0; j <  expectResult[i].length; j++){
			assertEquals(expectResult[i][j], result[i][j]);
	      }
		}
	}
	@Test
	//3*3 matrix
	public void testAddtion2() {
		int[][] t1 = {{6, 2, 2}, {7, 3, 9}, {2,5,4}};
		int[][] t2 = {{6,3, 4}, {9,12, 7}, {1,2,7}};
		int[][] expectResult = {{12,5,6},{16,15,16},{3,7,11}};
		int[][] result = new int[3][3];	
		MatrixAddition.addMatricies(t1,t2,result);
		for(int i = 0; i < expectResult.length; i++){
		  for(int j = 0; j < expectResult[i].length; j++){
			assertEquals(expectResult[i][j], result[i][j]);
	      }
		}
	}
   


}