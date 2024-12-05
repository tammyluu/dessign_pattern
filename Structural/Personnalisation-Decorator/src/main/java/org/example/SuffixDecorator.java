package org.example;

public class SuffixDecorator extends TextDecorator{
    private String suffix;
    public SuffixDecorator(Text text, String suffix ) {
        super(text);
        this.suffix = suffix;
    }
    @Override
    public String transform() {
        return  text.transform() + suffix;
    }
}
