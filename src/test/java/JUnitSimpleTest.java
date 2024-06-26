import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assumptions;

public class JUnitSimpleTest {

    @Test
    void addition() {
        Main main = new Main();
        int result = main.add(2, 3);

        assertEquals(result, 5, "2 + 3 should equal 5");
    }

    @Test
    void subtraction() {
        // Припущення, що тест повинен виконуватися лише тоді, коли змінна середовища
        // RUN_SUBTRACTION_TEST встановлена в true

        boolean runTest = Boolean.parseBoolean(System.getenv("RUN_SUBTRACTION_TEST"));
        Assumptions.assumeTrue(runTest, "Test skipped as RUN_SUBTRACTION_TEST is not true");

        Main main = new Main();
        int result = main.subtract(5, 3);
        assertEquals(result, 2, "5 - 3 should equal 2");
    }


}
