package com.company;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int data) {

        int min = data;

        if (!minSt.isEmpty() && min > minSt.peek()) {
            min = minSt.peek();
        }

        st.push(data);
        minSt.push(min);
    }

    public void pop() {
        st.pop();
        minSt.pop();
    }

    public int top() {
        return st.peek();
    }

    public int peekMin() {
        return minSt.peek();
    }
}