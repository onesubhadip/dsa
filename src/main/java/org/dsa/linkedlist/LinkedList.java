package org.dsa.linkedlist;

public class LinkedList {
	
	private Node head;
	private int size;
	
	public LinkedList() {
		this.size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public void addFirst(int data) {		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public Integer removeFirst() {
		if(head == null) {
			return null;
		}
		Node toRemove = head;
		head = head.next;
		size--;
		return toRemove.data;
	}
	
	public void print() {
		Node tmp = head;
		while(tmp!=null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	
	class Node {
		Node(int data){
			this.data = data;
		}
		
		int data;
		Node next;
	}
}
