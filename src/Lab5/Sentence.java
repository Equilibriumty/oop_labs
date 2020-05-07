package Lab5;

import java.util.ArrayList;

public class Sentence {
    protected String sentence;
    ArrayList<Word> word = new ArrayList<>();

    Sentence(String txt) {
        this.sentence = txt;
        for (String word_iter : this.sentence.split(" ")) {
            this.word.add(new Word(word_iter));
        }
    }
}


