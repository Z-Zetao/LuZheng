package pointToOffer.offer31_40;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 *
 * 序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列
 *
 * @author 51465
 */
public class Offer31 {

    public static void main(String[] args) {
        int[] pushed = {0, 2, 1};
        int[] poped = {0, 1, 2};
        Offer31 offer31 = new Offer31();
        boolean b = offer31.validateStackSequences(pushed, poped);
        System.out.println(b);
    }

    /**
     * 无论三七二十一我就先给你入栈然后再判断
     * @param pushed 栈数组
     * @param popped 出栈数组
     * @return 是否能按顺序出栈
     */
    public boolean validateStackSequencesAnswer(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int num : pushed) {
            stack.push(num);
            while(!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0 && popped.length == 0){
            return true;
        }
        int i = 0,j = 0;
        Stack<Integer> stack = new Stack<>();
        while (pushed[i] != popped[j]){
            stack.push(pushed[i]);
            i++;
        }
        while (j < popped.length && i < pushed.length){
            if (popped[j] == pushed[i]){
                j++;
                i++;
                continue;
            }
            if (!stack.empty() && popped[j] == stack.peek()){
                stack.pop();
                j++;
                continue;
            }
            stack.push(pushed[i]);
            i++;
        }
        while (j < popped.length){
            if (popped[j] == stack.peek()){
                stack.pop();
                j++;
            }else {
                return false;
            }
        }
        return true;
    }

}
