package Tries;

import java.util.Iterator;

/**
 * Interface class representation of a trie in Java.
 *
 * @author Nathaniel Lao
 */
public interface Trie {

    /**
     * Searches for the given word in the trie.
     * @param word String to be searched for.
     * @return true if the String exists in the trie.
     */
    boolean search(String word);

    /**
     * Adds the given word to the trie.
     * @param word String to be added to the trie.
     * @return true if the word was not present before the insertion and the insertion was successful, false otherwise.
     */
    boolean add(String word);

    /**
     * Removes the given word from the trie.
     * @param word
     * @return
     */
    boolean delete(String word);

    /**
     * Returns the number of words in the trie.
     * @return the size or number of words currently stored in the trie.
     */
    int size();

    /**
     * Checks if the trie has no words.
     * @return true iff size = 0.
     */
    boolean isEmpty();

    /**
     * Retrieves the longest word in the trie.
     * @return the longest string in the trie structure.
     */
    String getLongest();

    /**
     * Traverses the trie in an in-order traversal.
     * @return An iterator containing the strings in the trie traversed in-order.
     */
    Iterator<String> inorderTraversal();
}
