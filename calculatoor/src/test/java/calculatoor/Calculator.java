package calculatoor;

/**
 *  
 * @author hmaha 
 *
 */
public class Calculator {

	/**
	 * 
	 * @param num1  it is the first number with data type integer
	 * @param num2	it is the second number with data type integer
	 * @param num3	it is the third number with data type integer
	 * @return it will return the maximum value.
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
		if (arr[i] > max)
		max = arr[i];
		}
		return max;
		}
	/**
	 * 
	 * @param num it the the number with the data type integer
	 * @return it will return the result.
	 * @throws IllegalArgumentException excception which is illegal arguent exception.
	 */
		public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
		result = num * num;
		} else
		throw new IllegalArgumentException();
		return result;
		}
}
