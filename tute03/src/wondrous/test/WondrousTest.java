package wondrous.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import wondrous.Wondrous;

public class WondrousTest {
    @Test
    public void testBasic() {
        Wondrous w = new Wondrous();
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 10, 5, 16, 8, 4, 2, 1));

        assertEquals(expected, w.wondrous(3));
    }

    @Test
    public void testStartingNumberOne() {
        Wondrous w = new Wondrous();
        List<Integer> expected = new ArrayList<Integer>();

        assertEquals(expected, w.wondrous(1));
    }

    @Test
    public void testExceptionWorks() {
        Wondrous w = new Wondrous();
        assertDoesNotThrow(() -> {
            w.wondrous(1);
        });
        assertThrows(IllegalArgumentException.class, () -> w.wondrous(0));
    }
}
