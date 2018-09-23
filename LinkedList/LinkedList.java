package LinkedList;

public class LinkedList {
	private Node head;

	public LinkedList(int data) {
		head = new Node(data);

	}

	// Add node at the end of the linkedlist. Returns index of added new node or
	// null (if it fails)
	public int addNode(int data) {
		Node refNode = head;
		int count = 0;
		while (refNode.getNext() != null) {
			refNode = refNode.getNext();
			count++;
		}
		Node newNode = new Node(data);
		refNode.setNext(newNode);
		return ++count;
	}

	public boolean deleteNode(int data) {
		Node refNode = head;
		while (refNode.getNext() != null) {
			if (refNode.getData() == data) {
				refNode.setData(refNode.getNext().getData());
				refNode.setNext(refNode.getNext().getNext());
				return true;
			} else {
				refNode = refNode.getNext();
			}
		}
		return false;
	}

	public void printLinkedList() {
		Node refNode = head;
		while (refNode.getNext() != null) {
			System.out.print(refNode.getData() + " --> ");
			refNode = refNode.getNext();
		}
		if (refNode.getNext() == null) {
			System.out.print(refNode.getData());
		}

	}

}
