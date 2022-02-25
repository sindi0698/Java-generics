package com.practicalexercises1;

public class SortedPair<T extends Comparable<T>>{
    private T first;
    private T second;


    public SortedPair(T left, T right){
        if (left.compareTo(right) < 0){
            first = left;
            second = right;
        }
        else {
            first = right;
            second = left;
        }

    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
