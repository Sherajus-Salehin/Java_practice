package com.liteSpring.FrameBuild;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //String s ="Main.class";
        //System.out.print(s.endsWith(".class"));
//         Classes test= new Classes();
//        try {
//    Absolute path =  C:\Users\Sherajus Salehin\Documents\Java practice\Java_practice\FrameBuilding\src
//            test.scan(new File("src/FrameBuild"),"FrameBuild");
//
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }


//        File resource=new File("com.liteSpring.FrameBuild");
//        try {
//            Classes.scan(new File(resource.getPath()), "com.liteSpring.FrameBuild");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        File tester = new File("src/com/liteSpring/FrameBuild");
        String[] files = null;
        if (tester.isDirectory() && tester.exists()) {
            files = tester.list();
        }
        List <String> allFiles= new ArrayList<>();
        for (String file:files){
            if (file.contains(".")){
                while (true){

                }
            }
        }

}}

