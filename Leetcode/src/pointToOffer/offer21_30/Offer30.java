package pointToOffer.offer21_30;

import java.util.Stack;

/**
 * @author 51465
 */
public class Offer30 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());

    }

}

class MinStack {
    private int[] stack;
    private int top = -1;

    public MinStack() {
        stack = new int[100];
    }

    public void push(int x) {
        if(top < 100){
            top++;
            stack[top] = x;
        }
    }

    public void pop() {
        if(top != -1){
            int value = stack[top];
            top--;
            System.out.println(value);
        }
    }

    public int top() {
        if(top != -1){
            return stack[top];
        }else{
            return -1;
        }
    }

    public int min() {
        if(top != -1){
            int min = stack[0];
            for(int i = 1;i <= top;i++){
                if(stack[i] < min){
                    min = stack[i];
                }
            }
            return min;
        }else{
            return -1;
        }
    }
}
