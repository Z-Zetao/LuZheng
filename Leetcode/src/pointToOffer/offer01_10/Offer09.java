package pointToOffer.offer01_10;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。
 * (若队列中没有元素，deleteHead操作返回 -1 )
 *
 * @author 51465
 */
public class Offer09 {


}

class CQueue {

    Stack<Integer> stackAppend = new Stack<>();
    Stack<Integer> stackAssist = new Stack<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        if (stackAppend.isEmpty()){
            stackAppend.push(value);
        }else {
            while (!stackAppend.isEmpty()){
                stackAssist.push(stackAppend.pop());
            }
            stackAppend.push(value);
            while (!stackAssist.isEmpty()){
                stackAppend.push(stackAssist.pop());
            }
        }
    }

    public int deleteHead() {
        if (stackAppend.isEmpty()){
            return -1;
        }else {
            return stackAppend.pop();
        }
    }
}
