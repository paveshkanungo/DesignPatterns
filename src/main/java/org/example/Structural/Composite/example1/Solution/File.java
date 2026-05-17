package org.example.Structural.Composite.example1.Solution;

public class File implements FileSystemComponent {
    String fileName;

    public File(String name) {
        this.fileName = name;
    }

    @Override
    public void ls() {
        System.out.println("File name: " + fileName);
    }
}
