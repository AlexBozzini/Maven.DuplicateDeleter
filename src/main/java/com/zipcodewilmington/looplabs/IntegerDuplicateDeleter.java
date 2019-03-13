package com.zipcodewilmington.looplabs;

import java.util.List;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int indexesToBeRemoved = 0;
        for (int i = 0; i < array.length; i++){
            if (countFrequency(array[i]) >= maxNumberOfDuplications){
                indexesToBeRemoved++;
            }
        }
        Integer[] duplicatesRemoved = new Integer[array.length - indexesToBeRemoved];
        Integer indexInNewArray = 0;
        for (int i = 0; i < array.length; i++){
            if (countFrequency(array[i]) < maxNumberOfDuplications){
                duplicatesRemoved[indexInNewArray] = array[i];
                indexInNewArray++;
            }
        }
        return duplicatesRemoved;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int indexesToBeRemoved = 0;
        for (int i = 0; i < array.length; i++){
            if (countFrequency(array[i]) == exactNumberOfDuplications){
                indexesToBeRemoved++;
            }
        }
        Integer[] duplicatesRemoved = new Integer[array.length - indexesToBeRemoved];
        Integer indexInNewArray = 0;
        for (int i = 0; i < array.length; i++){
            if (countFrequency(array[i]) != exactNumberOfDuplications){
                duplicatesRemoved[indexInNewArray] = array[i];
                indexInNewArray++;
            }
        }
        return duplicatesRemoved;
    }

    public Integer countFrequency(Integer index){
        Integer frequency = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == index){
                frequency++;
            }
        }
        return frequency;
    }
}
