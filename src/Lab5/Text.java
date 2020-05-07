package Lab5;

import java.util.ArrayList;

public class Text extends Sentence {
    private final String txt;
    
    Text(String txt) {
        super(txt);
        this.txt = txt;
    }
    ArrayList<Sentence> sentence = new ArrayList<>();
    ArrayList<Punctuation> punctuation = new ArrayList<>();

    protected void ObjectSplit() {
        int index_punc = 0;
        for (String txt_iter : this.txt.split(" ")) {
            this.sentence.add(new Sentence(txt_iter));
            index_punc += txt_iter.length();
            this.punctuation.add(new Punctuation(this.txt.charAt(index_punc)));
            index_punc++;
        }
        for (Sentence s: sentence) {
            for (Word w: word) {
                System.out.println(w.getWord());
            }
            System.out.println(" ");
        }
    }
    public static String my_permutation(String sb) {
        char FirstLetter = sb.charAt(0);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == FirstLetter || sb.charAt(i) == Character.toUpperCase(FirstLetter) ||
                    sb.charAt(i) == Character.toLowerCase(FirstLetter)) {
                sb = sb.replaceAll(String.valueOf(sb.charAt(i)), "");
                i--;
            }
        }
        return sb;
      }
}


