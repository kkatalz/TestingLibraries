import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitSimpleTest {

    @Test
    void addition() {
        Main main = new Main();
        int result = main.add(2, 3);

        assertEquals(result, 5, "2 + 3 should equal 5");
    }
}
