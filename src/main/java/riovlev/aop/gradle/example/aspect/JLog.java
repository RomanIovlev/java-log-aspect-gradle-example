package riovlev.aop.gradle.example.aspect;

import java.lang.annotation.*;

/**
 * @author Roman Iovlev
 *         08/06/18
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface JLog {
    String value() default "";
}