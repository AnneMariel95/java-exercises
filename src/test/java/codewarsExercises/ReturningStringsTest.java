package codewarsExercises;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReturningStringsTest {
    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", ReturningStrings.greet("Ryan"));
        assertEquals("Hello, Betty how are you doing today?", ReturningStrings.greet("Betty"));
    }
}