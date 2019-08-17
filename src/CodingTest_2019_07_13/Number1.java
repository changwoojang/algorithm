package CodingTest_2019_07_13;

import java.util.List;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Created by changwooj111@gmail.com on 11/07/2019
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class Number1 {

    public enum BoardStatus{
        IMPOSSIBLE("IMPOSSIBLE"),
        POSSIBLE("POSSIBLE");
        private String status;
        BoardStatus(String status){
            this.status = status;
        }
        public String getStatus(){
            return status;
        }
    }

    public enum BoardValues{
        MATRIX_TWO(2,"2"),
        MATRIX_ONE(1,"1"),
        MATRIX_ZERO(0,"0");
        private int value;
        private String valueText;
        BoardValues(int value, String valueText){
            this.value = value;
            this.valueText = valueText;
        }
        public int getValue(){
            return value;
        }
        public String getValueText(){
            return valueText;
        }
    }

    public class UpperLowerRow{

        String upper;
        String lower;
        int upperCount;
        int lowerCount;

        public UpperLowerRow(String upper, String lower, int upperCount, int lowerCount){
            this.upper = upper;
            this.lower = lower;
            this.upperCount = upperCount;
            this.lowerCount = lowerCount;
        }
        public String getUpper(){
            return upper;
        }
        public void setUpper(String upper){
            this.upper = upper;
        }
        public String getLower(){
            return lower;
        }
        public void setLower(String lower){
            this.lower = lower;
        }
        public int getUpperCount(){
            return upperCount;
        }
        public void setUpperCount(int upperCount){
            this.upperCount = upperCount;
        }
        public int getLowerCount(){
            return lowerCount;
        }
        public void setLowerCount(int lowerCount){
            this.lowerCount = lowerCount;
        }
    }

    public String solutionResult(String upper,String lower){
        StringJoiner solutionResult = new StringJoiner(",");
        solutionResult.add(upper);
        solutionResult.add(lower);
        return solutionResult.toString();
    }

    public boolean isImpossible(int U, int L, int[] C){
        Integer sumOfColumn = Arrays.stream(C).boxed().mapToInt(Integer::intValue).sum();
        int sumOfUpperAndLowerRows = U + L;
        if( sumOfUpperAndLowerRows != sumOfColumn){ return true;}
        return false;
    }

    public void addColumnToUpperAndLower(UpperLowerRow upperLowerRow, String upper, String lower, int upperCount, int lowerCount){
        upperLowerRow.setUpper(upperLowerRow.getUpper().concat(upper));
        upperLowerRow.setLower(upperLowerRow.getLower().concat(lower));
        upperLowerRow.setUpperCount(upperCount);
        upperLowerRow.setLowerCount(lowerCount);
    }
    public int decreaseUpperLowerCount(int count){
        return --count;
    }
    public String solution(int U, int L, int[] C) {
        // write your code in Java SE 8
        if(isImpossible(U,L,C)){
            return BoardStatus.IMPOSSIBLE.getStatus();
        }
        UpperLowerRow upperLowerRow = new UpperLowerRow(new String(), new String(), U, L);

        for(int each : C){

            if(each == BoardValues.MATRIX_TWO.getValue()){
                addColumnToUpperAndLower(upperLowerRow,BoardValues.MATRIX_ONE.getValueText(),BoardValues.MATRIX_ONE.getValueText()
                        ,decreaseUpperLowerCount(upperLowerRow.getUpperCount()),decreaseUpperLowerCount(upperLowerRow.getLowerCount()));

            }else if (each == BoardValues.MATRIX_ONE.getValue()){
                if(upperLowerRow.getUpperCount() > 0){
                    addColumnToUpperAndLower(upperLowerRow,BoardValues.MATRIX_ONE.getValueText(),BoardValues.MATRIX_ZERO.getValueText()
                            ,decreaseUpperLowerCount(upperLowerRow.getUpperCount()),upperLowerRow.getLowerCount());

                }else if(upperLowerRow.getLowerCount() > 0){
                    addColumnToUpperAndLower(upperLowerRow,BoardValues.MATRIX_ZERO.getValueText(),BoardValues.MATRIX_ONE.getValueText()
                            ,upperLowerRow.getUpperCount(),decreaseUpperLowerCount(upperLowerRow.getLowerCount()));
                }
            }else if (each == BoardValues.MATRIX_ZERO.getValue()){
                addColumnToUpperAndLower(upperLowerRow,BoardValues.MATRIX_ZERO.getValueText(),BoardValues.MATRIX_ZERO.getValueText()
                        ,upperLowerRow.getUpperCount(),upperLowerRow.getLowerCount());
            }
        }
        return solutionResult(upperLowerRow.upper,upperLowerRow.lower);
    }

    public static void main (String[] args){
//
        int[] C = {2,1,1,0,1};
        Number1 num = new Number1();
        System.out.println(num.solution(3,2, C));

//        int[] D = {0,0,1,1,2};
//        System.out.println(num.solution(2,3, D));
//
//        int[] E = {2,0,2,0};
//        System.out.println(num.solution(2,2, E));
//
//        int[] F = {2,2,1,1,0,1};
//        System.out.println(num.solution(4,3, F));
    }
}
