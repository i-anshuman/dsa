package app.dsa.array;

import java.util.Arrays;
import java.util.Objects;

/** Find the largest number in the given array. */
public class LargestNumberInArray {

  /**
   * Brute-force approach to solve the problem.<br>
   * Time Complexity: {@code O(n log(n))}<br>
   * Space Complexity: {@code O(1)}
   *
   * @param numbers Array of integers.
   * @return Largest integer in {@code numbers}.
   */
  public Integer brute(final int[] numbers) {
    if (Objects.isNull(numbers) || numbers.length == 0) {
      throw new ArrayIndexOutOfBoundsException();
    }
    Arrays.sort(numbers);
    return numbers[numbers.length - 1];
  }

  /**
   * Optimal approach to solve the problem.<br>
   * Time Complexity: {@code O(n)}<br>
   * Space Complexity: {@code O(1)}
   *
   * @param numbers Array of integers.
   * @return Largest integer in {@code numbers}.
   */
  public Integer optimal(final int[] numbers) {
    if (Objects.isNull(numbers) || numbers.length == 0) {
      throw new ArrayIndexOutOfBoundsException();
    }
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (max < numbers[i]) {
        max = numbers[i];
      }
    }
    return max;
  }
}
