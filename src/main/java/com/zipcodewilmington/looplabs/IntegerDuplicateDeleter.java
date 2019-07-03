package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer [] intArray){
        super(intArray);
    }



    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
     return    Arrays.stream(array).filter(x -> Collections.frequency(Arrays.asList(array),x) < maxNumberOfDuplications)
                .toArray(Integer[]::new);
//        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
   return     Arrays.stream(array).filter(x -> Collections.frequency(Arrays.asList(array),x) != exactNumberOfDuplications)
                .toArray(Integer [] :: new);
//        return new Integer[0];
    }
}
