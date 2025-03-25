package app.das.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import app.dsa.array.LargestNumberInArray;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tags({@Tag("Array"), @Tag("Easy")})
@DisplayName("Test largest number in array.")
public class TestLargestNumberInArray {

  private LargestNumberInArray problem;

  @BeforeEach
  void setup() {
    problem = new LargestNumberInArray();
  }

  @Nested
  @Order(1)
  @DisplayName("Test brute force method.")
  class TestBruteForceMethod {

    @Test
    @Order(1)
    @DisplayName("Case 1: Array with zero and positive numbers.")
    void case1() {
      assertEquals(9, problem.brute(new int[] {2, 3, 6, 0, 5, 3, 7, 9, 2, 9}));
    }

    @Test
    @Order(2)
    @DisplayName("Case 2: Empty array.")
    void case2() {
      assertThrows(ArrayIndexOutOfBoundsException.class, () -> problem.brute(new int[] {}));
    }

    @Test
    @Order(3)
    @DisplayName("Case 3: Array with single number.")
    void case3() {
      assertEquals(5, problem.brute(new int[] {5}));
    }

    @Test
    @Order(4)
    @DisplayName("Case 4: Array with same numbers.")
    void case4() {
      assertEquals(4, problem.brute(new int[] {4, 4, 4, 4, 4}));
    }

    @Test
    @Order(5)
    @DisplayName("Case 5 Array of size 2 with same numbers.")
    void case5() {
      assertEquals(5, problem.brute(new int[] {5, 5}));
    }

    @Test
    @Order(6)
    @DisplayName("Case 6: Array with single number, which is zero.")
    void case6() {
      assertEquals(0, problem.brute(new int[] {0}));
    }

    @Test
    @Order(7)
    @DisplayName("Case 7: Array with largest number is not repeated.")
    void case7() {
      assertEquals(90, problem.brute(new int[] {5, 5, 5, 90, 5, 5, 5}));
    }

    @Test
    @Order(8)
    @DisplayName("Case 8: Array with largest number is repeated.")
    void case8() {
      assertEquals(505, problem.brute(new int[] {505, 505, 505, 90, 505, 505, 505}));
    }

    @Test
    @Order(9)
    @DisplayName("Case 9: Array with negative numbers only.")
    void case9() {
      assertEquals(-4, problem.brute(new int[] {-19, -4, -7, -10, -12, -5, -4, -7}));
    }

    @Test
    @Order(10)
    @DisplayName("Case 10: Array with negative numbers and zeros only.")
    void case10() {
      assertEquals(0, problem.brute(new int[] {-19, -4, -7, 0, -10, -12, -5, -4, 0, -7}));
    }
  }

  @Nested
  @Order(2)
  @DisplayName("Test optimal method.")
  class TestOptimalMethod {

    @Test
    @Order(1)
    @DisplayName("Case 1: Array with zero and positive numbers.")
    void case1() {
      assertEquals(9, problem.optimal(new int[] {2, 3, 6, 0, 5, 3, 7, 9, 2, 9}));
    }

    @Test
    @Order(2)
    @DisplayName("Case 2: Empty array.")
    void case2() {
      assertThrows(ArrayIndexOutOfBoundsException.class, () -> problem.optimal(new int[] {}));
    }

    @Test
    @Order(3)
    @DisplayName("Case 3: Array with single number.")
    void case3() {
      assertEquals(5, problem.optimal(new int[] {5}));
    }

    @Test
    @Order(4)
    @DisplayName("Case 4: Array with same numbers.")
    void case4() {
      assertEquals(4, problem.optimal(new int[] {4, 4, 4, 4, 4}));
    }

    @Test
    @Order(5)
    @DisplayName("Case 5 Array of size 2 with same numbers.")
    void case5() {
      assertEquals(5, problem.optimal(new int[] {5, 5}));
    }

    @Test
    @Order(6)
    @DisplayName("Case 6: Array with single number, which is zero.")
    void case6() {
      assertEquals(0, problem.optimal(new int[] {0}));
    }

    @Test
    @Order(7)
    @DisplayName("Case 7: Array with largest number is not repeated.")
    void case7() {
      assertEquals(90, problem.optimal(new int[] {5, 5, 5, 90, 5, 5, 5}));
    }

    @Test
    @Order(8)
    @DisplayName("Case 8: Array with largest number is repeated.")
    void case8() {
      assertEquals(505, problem.optimal(new int[] {505, 505, 505, 90, 505, 505, 505}));
    }

    @Test
    @Order(9)
    @DisplayName("Case 9: Array with negative numbers only.")
    void case9() {
      assertEquals(-4, problem.optimal(new int[] {-19, -4, -7, -10, -12, -5, -4, -7}));
    }

    @Test
    @Order(10)
    @DisplayName("Case 10: Array with negative numbers and zeros only.")
    void case10() {
      assertEquals(0, problem.optimal(new int[] {-19, -4, -7, 0, -10, -12, -5, -4, 0, -7}));
    }
  }
}
