package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer>integerList=new ArrayList<>();
        for (Integer integer : list) {
            if (integer%2==0){
                integerList.add(integer);
            }
        }
        return integerList;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        List<String> stringList=new ArrayList<>();
        for (String s : list) {
            stringList.add(s.toUpperCase(Locale.ROOT));
        }
        return stringList;
    }

    public Optional<Integer> findMax(List<Integer> list) {
        int max=0;
        for (Integer integer : list) {
            if(integer>max){
                max=integer;
            }
        }
        Optional<Integer>optional=Optional.of(max);
        return optional;
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        int min=0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if(i==0&&j==0){
                    min=list.get(i).get(j);
                }
                if (list.get(i).get(j)<min){
                    min=list.get(i).get(j);
                }
            }
        }
        Optional<Integer>optional=Optional.of(min);
        return optional;
    }

    public Integer sum(List<Integer> list) {
        int sum=0;
        for (Integer integer : list) {
            sum+=integer;
        }
        return sum;
    }
}
