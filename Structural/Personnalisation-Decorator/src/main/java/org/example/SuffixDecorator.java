package org.example;

public class SuffixDecorator extends TextDecorator{
    private String suffix;
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    public SuffixDecorator(Text text, String suffix ) {
        super(text);
        this.suffix = suffix;
    }
    @Override
    public String transform() {
        return  text.transform() + RED + suffix + RESET;
    }
}
