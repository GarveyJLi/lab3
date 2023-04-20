import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {

  //reverseInPlace Tests

  void generalTestReverseInPlace(int[] input, int[] expected) {
    int[] input_copy = input.clone();
    ArrayExamples.reverseInPlace(input_copy);
    assertArrayEquals(expected, input_copy);
  }


	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlaceEmptyArr() {
    int[] input1 = { };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ }, input1);
  }

  //Fails. Expected 1 at elem 2 but was 2. Method returns {2, 2}
  @Test
  public void testReverseInPlaceSizeTwo() {
    generalTestReverseInPlace(new int[]{1, 2}, new int[]{2, 1});
  }

  //Fails. Expected 1 at elem 2 but got 3. Method returns {3, 2, 3}
  @Test
  public void testReverseInPlaceSize3() {
    generalTestReverseInPlace(new int[]{1, 2, 3}, new int[]{3, 2, 1});
  }



  void generalTestReversed(int[] input, int[] expected) {
    int[] input_copy = input.clone();
    ArrayExamples.reverseInPlace(input_copy);
    assertArrayEquals(expected, input_copy);
  }

  //reversed Tests
  @Test
  public void testReversedEmptyArr() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  //Pass
  @Test
  public void testReversedSizeOne() {
    generalTestReverseInPlace(new int[] {1}, new int[] {1});
  }

  //Pass
  @Test
  public void testReversedSizeTwo() {
    generalTestReverseInPlace(new int[] {1,2}, new int[] {2, 1});

  }
  //Pass
  @Test
  public void testReversedSizeThree() {
    generalTestReverseInPlace(new int[] {1, 2, 3}, new int[] {3, 2, 1});
  }

  //Fails. Array being returned has the same memory location as the input.
  @Test
  public void testReversedNewObject() {
    int[] input = {1};
    assertFalse(input == ArrayExamples.reversed(input));
  }
}
