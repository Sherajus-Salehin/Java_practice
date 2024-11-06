package com.liteSpring.FrameBuild;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //String s ="Main.class";
        //System.out.print(s.endsWith(".class"));
        String pkg="com.liteSpring.FrameBuild";
        String dir="out\\production\\FrameBuilding\\";
        Tree t1= new Tree();

        try {
            t1.scanClass(pkg,dir);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

