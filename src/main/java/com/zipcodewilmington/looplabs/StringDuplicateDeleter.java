package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int indexesToBeRemoved = 0;
        for (int i = 0; i < array.length; i++){
            if (countFrequency(array[i]) >= maxNumberOfDuplications){
                indexesToBeRemoved++;
            }
        }
        String[] duplicatesRemoved = new String[array.length - indexesToBeRemoved];
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int indexesToBeRemoved = 0;
        for (int i = 0; i < array.length; i++){
            if (countFrequency(array[i]) == exactNumberOfDuplications){
                indexesToBeRemoved++;
            }
        }
        String[] duplicatesRemoved = new String[array.length - indexesToBeRemoved];
        Integer indexInNewArray = 0;
        for (int i = 0; i < array.length; i++){
            if (countFrequency(array[i]) != exactNumberOfDuplications){
                duplicatesRemoved[indexInNewArray] = array[i];
                indexInNewArray++;
            }
        }
        return duplicatesRemoved;
    }

    public Integer countFrequency(String element){
        Integer frequency = 0;
        for (int i = 0; i < array.length; i++){
            if (element.equals(array[i])){
                frequency++;
            }
        }
        return frequency;
    }
}
