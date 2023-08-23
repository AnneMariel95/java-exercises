package codewarsExercises;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BasicMathematicalOperationsTest {
    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertThat(BasicMathematicalOperations.basicMath("+", 4, 7), is(11));
        assertThat(BasicMathematicalOperations.basicMath("-", 15, 18), is(-3));
        assertThat(BasicMathematicalOperations.basicMath("*", 5, 5), is(25));
        assertThat(BasicMathematicalOperations.basicMath("/", 49, 7), is(7));
    }
}