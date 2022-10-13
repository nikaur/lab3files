import static org.junit.Assert.*;

//import java.lang.reflect.Array;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
  //my tests 
  @Test 
  public void testReverseInPlaceLargerArrays(){
    int[] input1 = {1, 2, 3}; 
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1}, input1); //input1 = {3, 2, 3}

    int[] input2 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input2); //input2 = {5, 4, 3, 4, 5}
  }
  
  @Test 
  public void testReverseLargerArrays(){
    int[] input1 = {1, 2, 3}; 
    ArrayExamples.reversed(input1); 
    assertArrayEquals(new int[] {3, 2, 1}, input1);//input1 = {0,0,0}

    int[] input2 = {1, 2, 3, 4, 5}; 
    ArrayExamples.reversed(input2); 
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, input2); //input2 = {0,0,0,0,0}
  }

  @Test 
  public void testAverage(){ 
    double[] input1 = {1, 4, 6};  
    double a = 5; 
    assertEquals(a, ArrayExamples.averageWithoutLowest(input1), a);
  }
}
