package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RetryOperation {
    Class<? extends Throwable>[] retryExceptions() default {Exception.class};
    long durationBetweenRetriesMs() default 0;
    String failureMessage() default "Operation failed after retrying!";
    int numberOfRetries();
}
