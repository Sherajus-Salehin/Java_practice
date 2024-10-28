package Java_practice.Annotation;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Class<?> x = TestAservice1.class;
        Method m = x.getMethod("Tester");

        if (m.isAnnotationPresent(TestAnnotation1.class)) {
            TestAnnotation1 a = m.getAnnotation(TestAnnotation1.class);
            System.out.println("annotation tester: " + a.testMethod());
        }

    }
}