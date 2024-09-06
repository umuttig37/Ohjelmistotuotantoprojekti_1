import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 };
        assertArrayEquals(a1, a2, "Arrays should be equal");
    }

    @Test
    public void testSingleDimensionalArrayInequality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 9 };
        assertArrayEquals(a1, a2, "Arrays should not be equal");
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 3, 3 }, { 7, 7 }, { 13, 13 } };
        int[][] a12 = { { 3, 3 }, { 7, 7 }, { 13, 13 } };
        assertArrayEquals(a11, a12, "2D arrays should be equal");
    }

    @Test
    public void testMultiDimensionalArrayInequality() {
        int[][] a11 = { { 3, 3 }, { 7, 7 }, { 13, 13 } };
        int[][] a12 = { { 3, 3 }, { 9, 9 }, { 13, 13 } };
        assertArrayEquals(a11, a12, "2D arrays should not be equal");
    }

    @Test
    public void testDifferentTypeArrayEquality() {

        String[] s1 = { "apple", "banana", "cherry" };
        String[] s2 = { "apple", "banana", "cherry" };
        assertArrayEquals(s1, s2, "String arrays should be equal");

        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 };
        assertArrayEquals(d1, d2, "Double arrays should be equal");
    }
}
