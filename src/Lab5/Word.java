package Lab5;

import java.util.ArrayList;

public class Word {
    private final String word;

    ArrayList<Letter> letter = new ArrayList<>();

    Word(String text) {
        this.word = text;
        ArrayList<Punctuation> punctuations = new ArrayList<>();
        for (int j = 0; j < this.word.length(); j++) {
            if (this.word.charAt(j) == '-' || this.word.charAt(j) == ',') {
                punctuations.add(new Punctuation(text.charAt(j)));
            } else {
                this.letter.add(new Letter(text.charAt(j)));
            }

        }
    }
    protected String getWord() {
        return this.word;
    }
}