package com.epam.mjc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
       return list.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compare);

    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(List::stream).min(Integer::compare);
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }
}
