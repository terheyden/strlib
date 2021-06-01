package com.terheyden.str;

/**
 * Str class, for blazingly fast String formatting and more.
 */
public final class Str {

    private Str() {
        // Private since this class shouldn't be instantiated.
    }

    public static String format(String formatStr, Object... formatArgs) {

        if (formatStr == null || formatStr.isEmpty()) {
            return formatStr;
        }

        if (formatArgs.length == 0) {
            return formatStr;
        }

        // We make a rough guess at the end size for a performance gain.
        StringBuilder build = new StringBuilder(formatStr.length() + 10 * formatArgs.length);
        int argOff = 0;
        int startOff = 0;
        int delimOff = formatStr.indexOf("{}", startOff);

        while (delimOff > -1) {

            String word = formatStr.substring(startOff, delimOff);

            if (word.length() > 0) {
                build.append(word);
            }

            if (argOff < formatArgs.length) {
                build.append(formatArgs[argOff]);
                argOff++;
            }

            startOff = delimOff + 2;
            if (startOff == formatStr.length()) {
                break;
            }

            // If there are no more args, we can finish early.
            if (argOff == formatArgs.length) {
                build.append(formatStr.substring(startOff));
                startOff = formatStr.length();
                break;
            }

            delimOff = formatStr.indexOf("{}", startOff);
        }

        // Add the last trailing piece.
        if (startOff < formatStr.length()) {
            build.append(formatStr.substring(startOff));
        }

        // Add remaining args.
        while (argOff < formatArgs.length) {
            build.append(formatArgs[argOff++]);
        }

        return build.toString();
    }
}
