package org.example.Behavioral.ChainOfResponsibility.example1;

public class FatalLogProcessor extends LogProcessor {
    public FatalLogProcessor(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FATAL: " + message);
    }
}
