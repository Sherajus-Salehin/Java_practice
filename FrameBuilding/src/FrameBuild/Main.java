package FrameBuild;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

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
        File resource=new File("src\\FrameBuild");
        try {
            Classes.scan(new File(resource.getPath()), "FrameBuild");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}