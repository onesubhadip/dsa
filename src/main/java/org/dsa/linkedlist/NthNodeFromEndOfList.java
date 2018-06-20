package org.dsa.linkedlist;

/**
 * Find the n-th node from the end of a linked list.
 *
 */
public class NthNodeFromEndOfList {

	/**
	 * Main method to test
	 */
	public static void main(String[] args) {

		Node head = new Node(1);
		head.add(2).add(3).add(4).add(5);
		Node head1 = new Node(1);
		head1.add(2);

		/**testing iterative solution*/
		System.out.println("n=3  ::" + findNthNodeFromLast(head, 3));
		System.out.println("n=1  ::" + findNthNodeFromLast(head, 1));
		System.out.println("n=5  ::" + findNthNodeFromLast(head, 5));
		// System.out.println("n=6 ::"+findNthNodeFromLast(head, 6)); // throws exception
		// System.out.println("n=0 ::"+findNthNodeFromLast(head, 0)); // throws exception
		System.out.println("n=1  ::" + findNthNodeFromLast(new Node(1), 1));
		System.out.println("n=1  ::" + findNthNodeFromLast(head1, 1));
		System.out.println("n=2  ::" + findNthNodeFromLast(head1, 2));
		
		/**testing recursive solution*/
		
		printList(head);
		findNthNodeFromLastRecursive(head, 1);
		
	}

	
	/**
	 * this method returns the nth element from the last of the given linked list.
	 * This is an iterative implementation.
	 * 
	 * Time O(n) Space O(1)
	 * 
	 * @param head
	 * @param n
	 * @return
	 */
	public static int findNthNodeFromLast(Node head, int n) {
		printList(head);// just to see the list its operating on.

		if (head == null || n < 1) {
			throw new IndexOutOfBoundsException();
		}

		Node ptr1 = head;
		Node ptr2 = head;

		for (int i = 0; i < n; i++) {
			if (ptr2 == null) {
				throw new IndexOutOfBoundsException();
			}
			ptr2 = ptr2.next;
		}
		
		while (ptr2 != null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		return ptr1.data;
	}
	
	
	private static int countFromEnd = 0;
	public static void findNthNodeFromLastRecursive(Node head, int n) {
		if(head != null) {
			findNthNodeFromLastRecursive(head.next, n);
			countFromEnd++;
		}
		if(countFromEnd == n) {
			System.out.println(head.data);
		}
	}

	/**
	 * print the linked list stating from the given node
	 */
	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " --> ");
			head = head.next;
		}
		System.out.println("null");
	}

}

/**
 * Linkedlist node
 *
 */
class Node {

	Node(int data) {
		this.data = data;
	}

	public Node add(int data) {
		Node newNode = new Node(data);
		this.next = newNode;
		return newNode;
	}

	int data;
	Node next;
}
