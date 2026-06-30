package org.DSABasics.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class BrowserHistory {
    private LinkedList<String> history;
    private ListIterator<String> it;

    public BrowserHistory(String homepage) {
        history = new LinkedList<>();
        history.add(homepage);
        it = history.listIterator();
        it.next(); // Move iterator past the homepage
    }

    public void visit(String url) {
        // Clear all forward history before adding a new page
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        it.add(url);
    }

    public String back() {
        if (it.hasPrevious()) {
            it.previous(); // Move back past current page
            if (it.hasPrevious()) {
                String prev = it.previous();
                it.next(); // Reset iterator position right after the "current" page
                return prev;
            }
            it.next(); // Reset if we hit the beginning
        }
        return history.getFirst();
    }
}