package Tries;

public class StringFunctions {

    public static String consumePrefix(String word) {
        return consumePrefix(word,1);
    }

    public static String consumePrefix(String word, int index) {
        return word.substring(index,word.length());
    }
}
