package org.dsa.linkedlist;

/**
 * Create a stack using linked list. 
 *
 */
public class StackUsingLinkedList {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.printStack();
		stack.push(5);
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.printStack();
	}
	
}

class Stack {
	private LinkedList list;
	
	Stack(){
		this.list = new LinkedList();
	}
	
	public int size() {
		return list.size();
	}
	
	public void push(int data) {
		list.addFirst(data);
	}
	
	public Integer pop() {
		return list.removeFirst();
	}
	
	public void printStack() {
		System.out.println("printing stack");
		list.print();
	}
}

