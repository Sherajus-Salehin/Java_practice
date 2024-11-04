package com.liteSpring.FrameBuild;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree {
    public static void main(String[]ar){
       // File root=new File("src/com/liteSpring/FrameBuild");
        //
        String pkg="com.liteSpring.FrameBuild";
        String [] Lname=pkg.split("\\.");
        System.out.println(Lname[Lname.length-1]);
        File root=new File("out//production//FrameBuilding//"+pkg.replace(".","//"));
        List<File> dirs=new ArrayList<>();
        List<String> allFiles=new ArrayList<>();
        dirs.add(root);

        //initiate loop tomorrow
        int i=0;
        while (i<dirs.size()){
            File currentDir = dirs.get(i);
            File[] fileList = currentDir.listFiles();

            if (fileList != null) {
                for (File file : fileList) {
                    if (file.isFile()) {
                        // Add files to the list
                        allFiles.add(file.getPath());
                    } else if (file.isDirectory()) {
                        // Add directories to the list
                        dirs.add(file);
                    }
                }
            }
            i++;
        }
        System.err.println("Files and their paths:");
        for (String s : allFiles) {
            System.out.println(s);
        }
    }
}
