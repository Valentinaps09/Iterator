package co.edu.uniquindio.poo;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class PalindromeIterator implements Iterator<String>{
    private final List<String> list;
    private int currentIndex;

    public PalindromeIterator(List<String> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    private boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < list.size()) {
            String currentString = list.get(currentIndex);
            if (isPalindrome(currentString)) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(currentIndex++);
    }
}
