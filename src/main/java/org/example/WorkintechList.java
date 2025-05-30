package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<String> {

    @Override
    public boolean add(String element) {
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }

    @Override
    public boolean remove(Object element) {
        boolean removed = super.remove(element);
        if (removed) {
            sort();
        }
        return removed;
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public String get(int index) {
        return super.get(index);
    }

    @Override
    public int size() {
        return super.size();
    }
}