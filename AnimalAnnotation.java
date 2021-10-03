package hw_lesson21;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AnimalAnnotation {
    String value() default "not good";
}
