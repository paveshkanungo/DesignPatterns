package org.example.Structural.Composite.example1.Problem;

public class File {
    String fileName;

    public File(String name){
        this.fileName = name;
    }

    public void ls(){
        System.out.println("File name: " + fileName);
    }
}
