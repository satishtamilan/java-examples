package io.mincongh.util;

import io.mincongh.util.internal.Formatter;
import java.util.Locale;

/**
 * String emulation.
 *
 * @author Mincong Huang
 */
public final class Str {

  /**
   * Returns a formatted string using the specified format string and arguments.
   *
   * <p>The locale always used is the one returned by {@link java.util.Locale#getDefault()}.
   *
   * @param format A format string
   * @param args Arguments referenced by the format specifiers in the format string. If there're
   *     more arguments than format specifiers, the extra arguments are ignored. The number of
   *     arguments is variable and may be zero. The maximum number of arguments is limited by the
   *     maximum dimension of a Java array as defined by The Java Virtual Machine Specification. The
   *     behaviour on a <tt>null</tt> argument depends on the conversion.
   * @return A formatted string
   * @throws java.util.IllegalFormatException If a format string contains an illegal syntax, a
   *     format specifier that is incompatible with the given arguments, insufficient arguments
   *     given the format string, ot other illegal conditions. For specification of all possible
   *     formatting errors, see the Details section of the formatter class specification.
   * @throws java.lang.NullPointerException If the format is null.
   */
  public static String format(String format, Object... args) {
    return Formatter.format(Locale.getDefault(), format, args);
  }

  /**
   * Returns a formatted string using the specified locale, format string, and arguments.
   *
   * @param locale The locale to apply during formatting. If locale is null then no localization is
   *     applied.
   * @param format A format string
   * @param args Arguments referenced by the format specifiers in the format string. If there're
   *     more arguments than format specifiers, the extra arguments are ignored. The number of
   *     arguments is variable and may be zero. The maximum number of arguments is limited by the
   *     maximum dimension of a Java array as defined by The Java Virtual Machine Specification. The
   *     behaviour on a <tt>null</tt> argument depends on the conversion.
   * @return A formatted string
   * @throws java.util.IllegalFormatException If a format string contains an illegal syntax, a
   *     format specifier that is incompatible with the given arguments, insufficient arguments
   *     given the format string, or other illegal conditions. For specification of all possible
   *     formatting errors, see the Details section of the formatter class specification.
   * @throws java.lang.NullPointerException If the format is null.
   */
  public static String format(Locale locale, String format, Object... args) {
    return Formatter.format(locale, format, args);
  }
}
