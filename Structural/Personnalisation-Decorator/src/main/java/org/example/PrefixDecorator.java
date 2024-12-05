package org.example;

public class PrefixDecorator extends TextDecorator{
    private  String prefix;
    public PrefixDecorator(Text text) {
        super(text);
    }
    public PrefixDecorator(Text text, String prefix) {
        super(text);
        this.prefix = prefix;
    }

    @Override
    public String transform() {
        return prefix + text.transform();
    }
}
