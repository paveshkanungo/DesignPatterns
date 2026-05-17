package org.example.Structural.Composite.example1.Problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList;

    public Directory(String name){
        this.directoryName = name;
        objectList = new ArrayList<>();
    }

    public void add(Object object){
        objectList.add(object);
    }

    public void remove(Object object){
        objectList.remove(object);
    }

    // Display full structure
    // Breaks OCP - if we want to add a new file type, we need to modify
    // this method to add another if/else condition
    // Suppose if we want to add IMG Type or any Type like Compressed Folder, then we
    // have to add one more else if block for that
    public void ls(){
        System.out.println("Directory Name: " + directoryName);
        for(Object obj: objectList){
            if(obj instanceof File file){
                file.ls();
            } else if(obj instanceof Directory dir){
                dir.ls();
            }
        }
    }
}
