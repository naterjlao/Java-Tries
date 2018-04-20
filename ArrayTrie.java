package Tries;

import java.util.Iterator;

/**
 * An implementation of a classic Trie using the an array for key storage. Here, each Node holds an array of pointers
 * where each index corresponds to the specific character.
 *
 * @author Nathaniel Lao
 */
public class ArrayTrie implements Trie {
    protected int size;

    public ArrayTrie() {
        size = 0;
    }

    @Override
    public boolean search(String word) {
        return false;
    }

    @Override
    public boolean add(String word) {
        return false;
    }

    @Override
    public boolean delete(String word) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String getLongest() {
        return null;
    }

    @Override
    public Iterator<String> inorderTraversal() {
        return null;
    }
}
