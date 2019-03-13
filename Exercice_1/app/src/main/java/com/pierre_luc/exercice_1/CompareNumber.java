package com.pierre_luc.exercice_1;

public class CompareNumber {

    public enum compareState{NUMBER1, NUMBER2, EQUAL}

    public compareState testNumber(int Number1, int Number2){
        if(Number1 < Number2){
            return compareState.NUMBER2;
        }else if(Number1 == Number2){
            return compareState.EQUAL;
        }else{
            return compareState.NUMBER1;
        }
    }

}
