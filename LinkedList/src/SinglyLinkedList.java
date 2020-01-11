
public class SinglyLinkedList {
	
	private Node first;
	
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	//This functions inserts a node at the beginning
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	//This functions deletes a node at the beginning
	public Node deleteFirst() {
		Node tempNode = first;
		first = first.next;
		return tempNode;
	}
	
	public void displayList() {
		System.out.println("{ displaying from First to Last }");
		Node currentNode = first;
		while (currentNode != null) {
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
	}
	
	public void insertLast(int data) {
		Node currentNode = first;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		Node newNode = new Node();
		newNode.data = data;
		currentNode.next = newNode;
	}

}
