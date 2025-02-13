package com.telran.lessons.lesson26.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Repeatable()
//@Inherited
public @interface HelloAnnotation {

//    String value() default "Hello Hello!";
}
