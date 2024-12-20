package com.liteSpring.FrameBuild;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//make two methods for file and class scanning.
public class Tree {
    public List<String> scanFiles(String pkg, String dir){
    //public void scan(String pkg) throws ClassNotFoundException {
       // File root=new File("src/com/liteSpring/FrameBuild");
        File root=new File(dir+pkg.replace(".","/"));
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
                        allFiles.add(file.getPath());
                    } else if (file.isDirectory()) {
                        dirs.add(file);
                    }
                }
            }
            i++;
        }
        return allFiles;
    }
    public List<Class<?>> scanClass(String pkg, String dir) throws ClassNotFoundException {
        List<Class<?>> ClassList= new ArrayList<>();
        List<String> FileTree= scanFiles(pkg,dir);
        //String Froot=dir;
        for (String path:FileTree){
            path=path.replace(dir,"").replace(".class","").replace("\\",".");
            //System.out.println(path);
            //System.out.println(ClassList.add(Class.forName(path)));
            ClassList.add(Class.forName(path));
        }
        return ClassList;
    }
}
