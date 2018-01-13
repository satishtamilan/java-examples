package io.mincongh.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A repeatable annotations, can be declared multiple times.
 *
 * @author Mincong Huang
 */
@Repeatable(value = MyTags.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyTag {
  String name();
}
