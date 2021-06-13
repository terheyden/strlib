package com.terheyden.str;

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
    public static String format(String formatStr, Object... formatParams) {

        if (formatStr == null) {
            formatStr = "";
        }

        // varargs can be null if they explicitly pass null as the only vararg!
        if (formatParams == null || formatParams.length == 0) {
            return formatStr;
        }

        // We make a generous guess at the end size for performance.
        StringBuilder build = new StringBuilder(formatStr.length() + 10 * formatParams.length);
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

                if (argOff < formatParams.length) {
                    build.append(formatParams[argOff]);
                    argOff++;
                }
            }

            startOff = delimOff + 2;

            if (startOff == formatStr.length()) {
                break;
            }

            // If there are no more args, we can finish early.
            if (argOff == formatParams.length) {
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
        while (argOff < formatParams.length) {

            // Just append the extra arg.
            build.append(formatParams[argOff]);
            argOff++;

            // If it looks like another arg is coming after this, add a comma.
            if (argOff < formatParams.length) {
                build.append(", ");
            }
        }

        return build.toString();
    }
}
