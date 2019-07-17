package org.laser.pretty;

import java.util.function.Function;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PrettyTest {
    private static String TEST_STRING = "testString";

    private void assertColorAndReset(Function<String, String> f, String color) {
        String pretty = f.apply(TEST_STRING);
        assertTrue(pretty.contains(color));
        assertTrue(pretty.contains(Pretty.ANSI_RESET));
    }

    @Test
    public void yellow() {
        assertColorAndReset(Pretty::yellow, Pretty.ANSI_YELLOW);
    }

    @Test
    public void black() {
        assertColorAndReset(Pretty::black, Pretty.ANSI_BLACK);
    }

    @Test
    public void red() {
        assertColorAndReset(Pretty::red, Pretty.ANSI_RED);
    }

    @Test
    public void green() {
        assertColorAndReset(Pretty::green, Pretty.ANSI_GREEN);
    }

    @Test
    public void blue() {
        assertColorAndReset(Pretty::blue, Pretty.ANSI_BLUE);
    }

    @Test
    public void purple() {
        assertColorAndReset(Pretty::purple, Pretty.ANSI_PURPLE);
    }

    @Test
    public void cyan() {
        assertColorAndReset(Pretty::cyan, Pretty.ANSI_CYAN);
    }

    @Test
    public void white() {
        assertColorAndReset(Pretty::white, Pretty.ANSI_WHITE);
    }
}
