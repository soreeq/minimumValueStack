package com.company;
import java.util.Stack;

public class Main {
    public static void main(String[]args){
        MinStack minElement = new MinStack();

        minElement.push(9);
        minElement.push(2);
        minElement.push(3);
        minElement.push(4);


        System.out.println(" Minimalna wartośc stosu to: " + minElement.peekMin());
    }

}
