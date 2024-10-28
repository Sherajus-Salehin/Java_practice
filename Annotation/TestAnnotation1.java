package Java_practice.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // where i want this to work
@Retention(RetentionPolicy.RUNTIME) // when i want this to work
public @interface TestAnnotation1 {

    String testMethod() default "ok";
}
