package org.example;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Text simpleText = new SimpleText("Java - Oracle, 02/12/2024!");

        Text upperCaseText = new UpperCaseDecorator(simpleText);
        Text lowerCaseText = new LowerCaseDecorator(simpleText);
        Text prefixedText = new PrefixDecorator(upperCaseText, "M2i - ");
        Text suffixedText = new SuffixDecorator(lowerCaseText, " Bravo!");

        System.out.println("Texte brut : " + simpleText.transform());
        System.out.println("-----------------------------------------------");
        System.out.println("Texte en majuscules : " + upperCaseText.transform());
        System.out.println("Textes en minuscules : " +lowerCaseText .transform());
        System.out.println("-----------------------------------------------");
        System.out.println("Texte avec préfixe : " + prefixedText.transform());
        System.out.println("Texte avec suffixe : " +  suffixedText.transform());

    }
}