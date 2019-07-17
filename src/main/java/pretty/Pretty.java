package pretty;

public class Pretty {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String yellow(String s) {
        return new Builder(s).color(ANSI_YELLOW).reset().build();
    }

    public static String black(String s) {
        return new Builder(s).color(ANSI_BLACK).reset().build();
    }

    public static String red(String s) {
        return new Builder(s).color(ANSI_RED).reset().build();
    }

    public static String green(String s) {
        return new Builder(s).color(ANSI_GREEN).reset().build();
    }

    public static String blue(String s) {
        return new Builder(s).color(ANSI_BLUE).reset().build();
    }

    public static String purple(String s) {
        return new Builder(s).color(ANSI_PURPLE).reset().build();
    }

    public static String cyan(String s) {
        return new Builder(s).color(ANSI_CYAN).reset().build();
    }

    public static String white(String s) {
        return new Builder(s).color(ANSI_WHITE).reset().build();
    }

    private static class Builder {
        private String s;
        Builder(String s) {
            this.s = s;
        }

        private Builder color(String c) {
            s = s + c;
            return this;
        }

        private Builder reset() {
            s = s + ANSI_RESET;
            return this;
        }

        private String build() {
            return s;
        }
    }
}
