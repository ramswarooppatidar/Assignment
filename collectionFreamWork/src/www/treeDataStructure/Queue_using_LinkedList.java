package www.treeDataStructure;
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}
class LinkedListAsQueue{
	Node front,rear;
	public LinkedListAsQueue() {
		front = rear = null;
	}
	void enqueue(int data) {
		Node newNode = new Node(data);
		if(rear== null) {
			front = rear = newNode;
		}
		rear.next = newNode;
		rear = newNode;
		System.out.println("node added "+rear.data);
	}
	void deque() {
		if(front==null) {
			System.out.println("queue is empty");
		}
		 Node temp = front;
	     front = front.next;
	     if(front==null) {
	    	 rear = null;
	     }
	     System.out.println("node remove "+temp.data);
	}
	public void showQueue() {
		System.out.println("elements in queue ");
		Node temp = front;
		if(temp==null) {
			System.out.println("queue is empty");
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class Queue_using_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListAsQueue q = new LinkedListAsQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.showQueue();
		q.enqueue(5);
		q.enqueue(15);
		q.showQueue();
		q.enqueue(45);
		q.enqueue(62);
		q.showQueue();
		q.deque();
		q.showQueue();
		q.deque();
		q.showQueue();
		
		
		
		System.out.println("queue front : "+q.front.data);
		System.out.println("rear front : "+q.rear.data);


	}

}
