import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTransformerTest {

    @Test
    void testStandartDeletion(){
        String test = "Hello World! This is but a mere test. The newest version.";
        char char1 = 'h';
        char char2 = 'n';
        String result = StringTransformer.substringDeletion(test, char1, char2);

        String expectedResult = "Hello World! This is but a mere test. T.";

        assertEquals(expectedResult, result);


    }
    @Test
    void testCharachterNotFound(){
        String test = "Hello World! This is but a mere test. The newest version.";
        String result = StringTransformer.substringDeletion(test, 'y', 'z');

        String expectedResult = "Hello World! This is but a mere test. The newest version.";
        assertEquals(expectedResult, result);

    }
    @Test
    void testSameCharachters(){
        String test = "I visited oklahoma. It was beautiful";
        String result = StringTransformer.substringDeletion(test, 'o','o');

        String expectedResult = "I visited ma. It was beautiful";

        assertEquals(expectedResult, result);

    }
    @Test
    void testReverseOrders(){
        String test = "ABCDEFG";
        String result = StringTransformer.substringDeletion(test, 'F', 'B');

        String expectedResult = "ABCDEFG";

        assertEquals(expectedResult, result);
    }
    @Test
    void testEmptyMessage(){
        String test = "";
        String result = StringTransformer.substringDeletion(test, 'A', 'B');

        String expectedResult = "";

        assertEquals(expectedResult, result);
    }
}
