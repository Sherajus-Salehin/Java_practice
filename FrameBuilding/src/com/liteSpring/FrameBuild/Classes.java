package com.liteSpring.FrameBuild;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Classes {
    public static List<Class<?>> scan(File dir, String packageName) throws ClassNotFoundException {
        List<Class<?>> classList = new ArrayList<>();
        if (dir.listFiles() == null) {
            System.out.println("Directory Error");
        }
        for(File file : Objects.requireNonNull(dir.listFiles())) {
            if(file.isFile() && file.getName().endsWith(".class")) {
                String className = packageName + "." + file.getName().replace(".class", "");

                classList.add(Class.forName(className)); // forName returns instance of this named class
            }
            else classList.addAll(scan(file, packageName + "." + file.getName()));
        }
        return classList;
    }
}
