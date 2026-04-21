package org.example.Behavioral.ChainOfResponsibility.example1;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
