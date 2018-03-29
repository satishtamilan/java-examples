package io.mincongh.util.internal;

/**
 * Enum of different argument categories.
 *
 * @author Mincong Huang
 */
public enum ArgumentCategory {
  /** May be applied to any argument type. */
  GENERAL,
  /**
   * May be applied to basic types which represent Unicode characters: char, Character, byte, Byte,
   * short, and Short. This conversion may also be applied to the types int and Integer when
   * Character.isValidCodePoint(int) returns true.
   */
  CHARACTER,
  /**
   * May be applied to Java integral types: byte, Byte, short, Short, int and Integer, long, Long,
   * and BigInteger
   */
  INTEGRAL,
  /** May be applied to Java floating-point types: float, Float, double, Double, and BigDecimal */
  FLOATING_POINT,
  /**
   * May be applied to Java types which are capable of encoding a date or time: long, Long,
   * Calendar, and Date.
   */
  DATE_TIME,
  /** Produces a literal '%' ('\u0025') */
  PERCENT,
  /** Produces the platform-specific line separator. */
  LINE_SEPARATOR
}
