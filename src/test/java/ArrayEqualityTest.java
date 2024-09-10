import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.*;

public class ArrayEqualityTest {

    static int[] sharedResource;

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("Setting up resources which is shared by all tests");
        sharedResource = new int[] {1, 2, 3};
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("Cleaning up resources which is shared by all tests");
        sharedResource = null;
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up before every test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up after every test");
    }

    @Test
    public void testSingleSizedArrayMatch() {
        System.out.println("Running testSizedDimensionalArrayEquality");
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 };
        assertArrayEquals(a1, a2, "Arrays has to be equal");
    }

    @Test
    public void testMultiSizedArrayEquality() {
        System.out.println("Running testMultiSizedArrayEquality");
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        assertArrayEquals(a11, a12, "2D arrays has to be equal");
    }

}
