/*
* creted date: 21 thg 10, 2021
* author: cgm
*/
package vn.edu.giadinh.tuan07;

public class IntSquare {
    private int intValue;

    public IntSquare(){}
    
    public IntSquare(int i){
        intValue = i;

    }

    private int calculateSquare(){
        //return intValue * intValue;
        return (int) Math.pow(intValue,2);

    }
     public int getSquare(){
         return calculateSquare();
     }
    }