package com.practicalexercises1;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    public int compare(final Person left, final Person right){
        return Integer.compare(left.getAge(), right.getAge()); //asc
        //return -1 * Integer.compare(left.getAge(), right.getAge()); //desc
    }
}
