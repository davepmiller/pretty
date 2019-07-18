package org.laser.pretty;

import java.util.function.Function;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.laser.pretty.Pretty.*;

public class PrettyTest {
    private static String TEST_STRING = "testString";

    private void assertColorAndReset(Function<String, String> f, String color) {
        String pretty = f.apply(TEST_STRING);
        assertTrue(pretty.startsWith(color));
        assertTrue(pretty.endsWith(ANSI_RESET));
    }

    @Test
    public void yellow() {
        assertColorAndReset(Pretty::yellow, ANSI_YELLOW);
    }

    @Test
    public void black() {
        assertColorAndReset(Pretty::black, ANSI_BLACK);
    }

    @Test
    public void red() {
        assertColorAndReset(Pretty::red, ANSI_RED);
    }

    @Test
    public void green() {
        assertColorAndReset(Pretty::green, ANSI_GREEN);
    }

    @Test
    public void blue() {
        assertColorAndReset(Pretty::blue, ANSI_BLUE);
    }

    @Test
    public void purple() {
        assertColorAndReset(Pretty::purple, ANSI_PURPLE);
    }

    @Test
    public void cyan() {
        assertColorAndReset(Pretty::cyan, ANSI_CYAN);
    }

    @Test
    public void white() {
        assertColorAndReset(Pretty::white, ANSI_WHITE);
    }
}
