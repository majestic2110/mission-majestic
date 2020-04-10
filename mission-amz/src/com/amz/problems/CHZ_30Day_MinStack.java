package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

import java.util.Stack;

public class CHZ_30Day_MinStack extends AbstractQuestion {
    class MinStack {
        Stack<int[]> minStack;
        Stack<Integer> stack;

        public MinStack() {
            this.stack = new Stack<>();
            this.minStack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if (this.minStack.isEmpty() || x < this.minStack.peek()[0]) {
                this.minStack.push(new int[]{x, 1});
            } else if (this.minStack.peek()[0] == x) {
                this.minStack.peek()[1]++;
            }
        }

        public void pop() {
            int item = stack.pop();
            if (this.minStack.peek()[0] == item) {
                this.minStack.peek()[1]--;
                if (this.minStack.peek()[1] == 0) {
                    this.minStack.pop();
                }
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return this.minStack.peek()[0];
        }
    }

    @Override
    @Test
    public void evaluate() {
        // to be done
    }
}
