package io.mincongh.util.internal;

import java.util.Locale;

/**
 * Formatter for string formatting.
 *
 * @author Mincong Huang
 */
public class Formatter {

  public static String format(Locale locale, String format, Object... args) {
    // TODO
    // Walker walks the string
    // - Walker recognizes FormatSpecifier type
    // - Walker constructs FormatSpecifier
    // - FormatSpecifier receives raw data as string from Walker
    // - FormatSpecifier parses all the raw data into flags, width, precision etc
    // - FormatSpecifier validates the data and the combination
    // - FormatSpecifier formats the target argument with flags
    // - Walker registers FormatSpecifier into a data-structures with specifier order
    // - Builder constructs the result, based on FormatSpecifier order
    // - Builder returns the result
    return null;
  }
}
