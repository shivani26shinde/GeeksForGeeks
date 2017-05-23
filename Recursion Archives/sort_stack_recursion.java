# Sorting a stack using recursion

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static Stack<Integer> stack = new Stack();
	public static void Stack1(Stack<Integer> stack){
		if(stack.isEmpty()){
			return;
		}
		int temp = stack.pop();
		Stack1(stack);
		Stack2(stack, temp);
	}
	public static void Stack2(Stack<Integer> stack, int temp){
		if(stack.isEmpty() || temp>stack.peek()){
			stack.push(temp);
			return;
		}
		int temp2 = stack.pop();
		Stack2(stack, temp);
		stack.push(temp2);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		stack.push(2);stack.push(3);stack.push(1);stack.push(4);stack.push(2);
		Stack1(stack);
		System.out.println(stack);
	}
}