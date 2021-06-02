package com.terheyden.str;

import java.util.Arrays;

/**
 * Much faster String formatting in the same style as Log4J / SLF4J log formatting.
 */
public final class Str {

    private Str() {
        // Private since this class shouldn't be instantiated.
    }

    /**
     * Returns the given String, injected with the specified parameters.
     * Formatting is the same style as {@code Log4J / SLF4J}, e.g.:
     * <pre>
     * {@code
     *     Str.format("Hello {}!", name);
     * }
     * </pre>
     * @param formatStr the formatted String, e.g.: {@code Str.format("Hello {}!", name);}
     * @return the formatted String injected with the given parameters
     */
    public static String format(String formatStr, Object arg1) {
        return formatString(formatStr, new Object[] { arg1 });
    }

    /**
     * Returns the given String, injected with the specified parameters.
     * Formatting is the same style as {@code Log4J / SLF4J}, e.g.:
     * <pre>
     * {@code
     *     Str.format("Hello {}!", name);
     * }
     * </pre>
     * @param formatStr the formatted String, e.g.: {@code Str.format("Hello {}!", name);}
     * @return the formatted String injected with the given parameters
     */
    public static String format(String formatStr, Object arg1, Object arg2) {
        return formatString(formatStr, new Object[] { arg1, arg2 });
    }

    /**
     * Returns the given String, injected with the specified parameters.
     * Formatting is the same style as {@code Log4J / SLF4J}, e.g.:
     * <pre>
     * {@code
     *     Str.format("Hello {}!", name);
     * }
     * </pre>
     * @param formatStr the formatted String, e.g.: {@code Str.format("Hello {}!", name);}
     * @return the formatted String injected with the given parameters
     */
    public static String format(String formatStr, Object arg1, Object arg2, Object arg3) {
        return formatString(formatStr, new Object[] { arg1, arg2, arg3 });
    }

    /**
     * Returns the given String, injected with the specified parameters.
     * Formatting is the same style as {@code Log4J / SLF4J}, e.g.:
     * <pre>
     * {@code
     *     Str.format("Hello {}!", name);
     * }
     * </pre>
     * @param formatStr the formatted String, e.g.: {@code Str.format("Hello {}!", name);}
     * @return the formatted String injected with the given parameters
     */
    public static String format(String formatStr, Object arg1, Object arg2, Object arg3, Object arg4) {
        return formatString(formatStr, new Object[] { arg1, arg2, arg3, arg4 });
    }

    /**
     * Returns the given String, injected with the specified parameters.
     * Formatting is the same style as {@code Log4J / SLF4J}, e.g.:
     * <pre>
     * {@code
     *     Str.format("Hello {}!", name);
     * }
     * </pre>
     * @param formatStr the formatted String, e.g.: {@code Str.format("Hello {}!", name);}
     * @return the formatted String injected with the given parameters
     */
    public static String format(
        String formatStr,
        Object arg1,
        Object arg2,
        Object arg3,
        Object arg4,
        Object arg5) {

        return formatString(formatStr, new Object[] { arg1, arg2, arg3, arg4, arg5 });
    }

    /**
     * Returns the given String, injected with the specified parameters.
     * Formatting is the same style as {@code Log4J / SLF4J}, e.g.:
     * <pre>
     * {@code
     *     Str.format("Hello {}!", name);
     * }
     * </pre>
     * @param formatStr the formatted String, e.g.: {@code Str.format("Hello {}!", name);}
     * @return the formatted String injected with the given parameters
     */
    public static String format(
        String formatStr,
        Object arg1,
        Object arg2,
        Object arg3,
        Object arg4,
        Object arg5,
        Object arg6) {

        return formatString(formatStr, new Object[] { arg1, arg2, arg3, arg4, arg5, arg6 });
    }

    /**
     * Returns the given String, injected with the specified parameters.
     * Formatting is the same style as {@code Log4J / SLF4J}, e.g.:
     * <pre>
     * {@code
     *     Str.format("Hello {}!", name);
     * }
     * </pre>
     * @param formatStr the formatted String, e.g.: {@code Str.format("Hello {}!", name);}
     * @return the formatted String injected with the given parameters
     */
    public static String format(
        String formatStr,
        Object arg1,
        Object arg2,
        Object arg3,
        Object arg4,
        Object arg5,
        Object arg6,
        Object arg7) {

        return formatString(formatStr, new Object[] { arg1, arg2, arg3, arg4, arg5, arg6, arg7 });
    }

    /**
     * Returns the given String, injected with the specified parameters.
     * Formatting is the same style as {@code Log4J / SLF4J}, e.g.:
     * <pre>
     * {@code
     *     Str.format("Hello {}!", name);
     * }
     * </pre>
     * @param formatStr the formatted String, e.g.: {@code Str.format("Hello {}!", name);}
     * @return the formatted String injected with the given parameters
     */
    public static String format(
        String formatStr,
        Object arg1,
        Object arg2,
        Object arg3,
        Object arg4,
        Object arg5,
        Object arg6,
        Object arg7,
        Object arg8) {

        return formatString(formatStr, new Object[] { arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
    }

    /**
     * Returns the given String, injected with the specified parameters.
     * Formatting is the same style as {@code Log4J / SLF4J}, e.g.:
     * <pre>
     * {@code
     *     Str.format("Hello {}!", name);
     * }
     * </pre>
     * @param formatStr the formatted String, e.g.: {@code Str.format("Hello {}!", name);}
     * @return the formatted String injected with the given parameters
     */
    public static String format(
        String formatStr,
        Object arg1,
        Object arg2,
        Object arg3,
        Object arg4,
        Object arg5,
        Object arg6,
        Object arg7,
        Object arg8,
        Object arg9) {

        return formatString(formatStr, new Object[] { arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 });
    }

    /**
     * Returns the given String, injected with the specified parameters.
     * Formatting is the same style as {@code Log4J / SLF4J}, e.g.:
     * <pre>
     * {@code
     *     Str.format("Hello {}!", name);
     * }
     * </pre>
     * @param formatStr the formatted String, e.g.: {@code Str.format("Hello {}!", name);}
     * @return the formatted String injected with the given parameters
     */
    public static String format(
        String formatStr,
        Object arg1,
        Object arg2,
        Object arg3,
        Object arg4,
        Object arg5,
        Object arg6,
        Object arg7,
        Object arg8,
        Object arg9,
        Object arg10,
        Object... args) {

        Object[] arr1 = { arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 };
        if (args.length == 0) {
            return formatString(formatStr, arr1);
        }

        Object[] arr = Arrays.copyOf(arr1, arr1.length + args.length);
        System.arraycopy(args, 0, arr, arr1.length, args.length);

        return formatString(formatStr, arr);
    }

    private static String formatString(String formatStr, Object[] formatArgs) {

        if (formatStr == null) {
            formatStr = "";
        }

        if (formatArgs.length == 0) {
            return formatStr;
        }

        // We make a generous guess at the end size for a performance gain.
        StringBuilder build = new StringBuilder(formatStr.length() + 10 * formatArgs.length);
        int argOff = 0;
        int startOff = 0;
        int delimOff = formatStr.indexOf("{}", startOff);

        while (delimOff > -1) {

            // If it's escaped, add it as usual and skip appending the arg.
            boolean isDelimEscaped = delimOff > 0 && formatStr.charAt(delimOff - 1) == '\\';

            if (isDelimEscaped) {

                // We want to keep the string + delim, so: delimOff + 2
                build.append(formatStr, startOff, delimOff + 2);

            } else {

                build.append(formatStr, startOff, delimOff);

                if (argOff < formatArgs.length) {
                    build.append(formatArgs[argOff]);
                    argOff++;
                }
            }

            startOff = delimOff + 2;

            if (startOff == formatStr.length()) {
                break;
            }

            // If there are no more args, we can finish early.
            if (argOff == formatArgs.length) {
                build.append(formatStr, startOff, formatStr.length());
                startOff = formatStr.length();
                break;
            }

            delimOff = formatStr.indexOf("{}", startOff);
        }

        // Add the last trailing piece.
        if (startOff < formatStr.length()) {
            build.append(formatStr, startOff, formatStr.length());
        }

        // Add remaining args.
        while (argOff < formatArgs.length) {

            // Just append the extra arg.
            build.append(formatArgs[argOff]);
            argOff++;

            // If it looks like another arg is coming after this, add a comma.
            if (argOff < formatArgs.length) {
                build.append(", ");
            }
        }

        return build.toString();
    }
}
