import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.StringReader;

public class Day18Tests {

    @ParameterizedTest
    @CsvSource({"1 + 2 * 3 + 4 * 5 + 6,231",
            "1 + (2 * 3) + (4 * (5 + 6)),51",
            "2 * 3 + (4 * 5),46",
            "5 + (8 * 3 + 9 + 3 * 4 * 3),1445",
            "5 * 9 * (7 * 3 * 3 + 9 * 3 + (8 + 6 * 4)),669060",
            "((2 + 4 * 9) * (6 + 9 * 8 + 6) + 6) + 2 + 4 * 2, 23340"
    })
    void Examples(String input, String result) throws Exception {
        StringReader reader  = new StringReader(input);
        Calculator calculator = new Calculator(reader);
        long computed = calculator.compute();
        assertEquals(Integer.parseInt(result), computed);
    }
}


