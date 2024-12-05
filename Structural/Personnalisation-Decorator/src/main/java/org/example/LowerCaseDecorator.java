package org.example;

public class LowerCaseDecorator extends TextDecorator{
    public LowerCaseDecorator(Text text) {
        super(text);
    }
    @Override
    public String transform() {
        return text.transform().toLowerCase();
    }

}
