package com.Annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.TYPE;

/**
 * @author 51465
 */
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE})
public @interface MyAnnotation {
    String value() default "lulu";
}
