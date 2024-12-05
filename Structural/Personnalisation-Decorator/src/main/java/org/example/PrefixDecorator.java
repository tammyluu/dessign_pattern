package org.example;

public class PrefixDecorator extends TextDecorator{
    private  String prefix;
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    public PrefixDecorator(Text text) {
        super(text);
    }
    public PrefixDecorator(Text text, String prefix) {
        super(text);
        this.prefix = prefix;
    }

    @Override
    public String transform() {
        return  RED+ prefix +  RESET +  text.transform() ;
    }
}
