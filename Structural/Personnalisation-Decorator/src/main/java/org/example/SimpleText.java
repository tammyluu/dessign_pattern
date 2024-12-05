package org.example;

public class SimpleText implements Text{
    private String text;
    @Override
    public String transform() {
        return text;
    }
    public SimpleText(String text) {
        this.text = text;
    }
}

