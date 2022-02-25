package com.practicalexercises1;

import java.util.*;
import java.util.concurrent.Callable;

public class SortingAnonymousClassExample{

    public static void main(String[] args) {
        // write your code here
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCopper = new Person("Bert Copper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCopper);


        Collections.sort(madMen, new AgeComparator());
        System.out.println(madMen);


        //OSEEE

        Collections.sort(madMen, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        Collections.sort(madMen, new ReverseComparator<Person>(new AgeComparator()));
        System.out.println(madMen);

        final Person youngestCastMember = (Person) min(madMen, new AgeComparator());
        System.out.println(youngestCastMember);


        //GET RESULT FROM COMPARING

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(min(numbers, Integer::compare));

    }
    public static <T> Object min(List<T> values, Comparator<T> comparator){
        if(values.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }
        T lowesetElement = values.get(0);
        for (int i=1; i<values.size(); i++){
            final T element = values.get(i);
            if(comparator.compare(element, lowesetElement) < 0){
                lowesetElement = element;
            }
        }
        return lowesetElement;
    }
}

