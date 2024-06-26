import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "2, 3, 5",
//          "3, 4, 8" purposefully incorrect test

    })
    void addition(int a, int b, int expected) {
        assertEquals(expected, a + b,
                () -> a + " + " + b + " should equal " + expected);
    }
}
