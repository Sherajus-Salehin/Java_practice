package com.liteSpring.FrameBuild.Annotation;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
       //create loop for scanning all classes
        Class<?> x = TestAservice1.class;

        //create loop for method scanning
        Method m = x.getMethod("Tester");
        if (m.isAnnotationPresent(TestAnnotation1.class)) {
            TestAnnotation1 a = m.getAnnotation(TestAnnotation1.class);
            System.out.println("annotation tester: " + a.testMethod());
            //TestAservice1 obj=new TestAservice1();
            //obj.Tester();

        }
        if(x.isAnnotationPresent(urlPort.class)){
            urlPort up= x.getAnnotation(urlPort.class);
            String url= up.url();
            int port= up.port();
            System.out.println("config: "+url+" "+port);
        }
        //configure loops
        Method HR=x.getMethod("doPut");
        if(HR.isAnnotationPresent(HttpMethods.class)){
            HttpMethods Hp=HR.getAnnotation(HttpMethods.class);
            System.out.println("Http method passed: "+ Hp.method()+" on path: "+Hp.path());
        }

    }
}