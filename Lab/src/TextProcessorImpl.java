import java.util.Collection;

/**
 * Created by Paul Zenie, pxz5572 on 3/3/2015.
 */
public class TextProcessorImpl  implements TextProcessor{
    /*
    Reads in a literary work and analyze's the word use.
     */
    @Override
    public Collection<String> getShortestWords() {
        /**
         * Return the shortest word or words from the literary work.
         * Since most languages contain many 1-letter words,
         * a collection is returned.
         * @return the shortest word(s)
         */
        return null;
    }

    @Override
    public Collection<String> getLongestWords() {
        /**
         * Return the longest word or words from the literary work.
         * There will often only be one word, but in case of a tie,
         * a collection is returned.
         * @return the longest word(s)
         */
        return null;
    }

    @Override
    public Collection<Character> mostCommonFirstUnweighted() {
        /**
         * Return the letters that are most likely to appear at
         * the start of a word from the literary work. Frequency
         * of the words involved is not taken into account. There
         * will often only be one letter, but in case of a tie,
         * a collection is returned.
         * @return the most common first letter(s) in the words
         */
        return null;
    }

    @Override
    public Collection<Character> mostCommonFirstWeighted() {
        /**
         * Return the letters that are most likely to appear at
         * the start of a word from the literary work. Frequency
         * of the words involved is taken into account. There
         * will often only be one letter, but in case of a tie,
         * a collection is returned.
         * @return the most common first letter(s) in the words
         */
        return null;
    }

    @Override
    public Collection<String> mostCommon(int length) {
        /**
         * Return the most common word or words of a given
         * length in the literary work. There will often
         * only be one such word, but in case of a tie,
         * a collection is returned.
         * @param length the length of words to consider
         * @return the list of most common words
         */
        return null;
    }

    public TextProcessorImpl(String arg) {
    }
}
