package com.liteSpring.FrameBuild.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface HttpMethods {
        String path();
        HttpMethod method() default HttpMethod.GET;
    }

