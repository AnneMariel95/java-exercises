package java_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataRemovingElementsTest {

    @Test
    void removeEveryOther() {
        Object[] expected = {1,3,5};
        Object[] param = {1,2,3,4,5};

        assertArrayEquals(expected, KataRemovingElements.removeEveryOther(param));
    }
}