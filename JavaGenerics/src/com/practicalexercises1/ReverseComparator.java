package com.practicalexercises1;

//PASS A PARAMETER TO A GENERIC TYPE

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {

    private final Comparator<T> delegateComparator;

    public ReverseComparator(Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }


    public int compare(final T o1, final T o2){
        return -1 * delegateComparator.compare(o1, o2);
    }
}
