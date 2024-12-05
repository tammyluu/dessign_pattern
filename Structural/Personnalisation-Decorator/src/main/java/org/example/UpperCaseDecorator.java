package org.example;

public class UpperCaseDecorator  extends TextDecorator{
    public UpperCaseDecorator(Text text) {
        super(text);
    }
    @Override
    public String transform() {
        return text.transform().toUpperCase();
    }
}

