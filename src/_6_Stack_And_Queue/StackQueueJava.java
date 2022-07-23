package _6_Stack_And_Queue;

import java.util.Stack;

public class StackQueueJava {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        
        for(Integer value:myStack){
            System.out.print(value + " ");
        }
        System.out.println();
        
        int x = myStack.pop();
        System.out.println("POP: " + x);
        for(Integer value:myStack){
            System.out.print(value + " ");
        }
        System.out.println();
        
        int y = myStack.peek();
        System.out.println("PEEK: " + y);
        for(Integer value:myStack){
            System.out.print(value + " ");
        }
        System.out.println();
        
    }
}
