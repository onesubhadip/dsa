package org.dsa.linkedlist;

public class LinkedList {
	
	private Node head;
	private Node tail;
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
		if(size == 1) {
			tail = head;
		}
	}
	
	public void addLast(int data) {	
		if(head == null) {
			this.addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		newNode.next = null;
		tail.next = newNode;
		tail = tail.next;
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
