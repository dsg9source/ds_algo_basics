package Driver;

import LinkedList.LinkedList;

//import LinkedList.LinkedList;

public class LinkedListDriver {
 public static void main(String args[]){
	 LinkedList ll=new LinkedList(12);
	 ll.addNode(14);
	 ll.addNode(16);
	 ll.printLinkedList();
	 ll.deleteNode(14);
	 System.out.println();
	 ll.printLinkedList();
	 
			 
 }
}
