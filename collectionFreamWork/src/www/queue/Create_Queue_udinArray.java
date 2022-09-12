package www.queue;
class MyQueue{
	int front,rear,temp,size;
	int arr[];
	
	public  MyQueue(int size) {
		front=rear=temp=0;
		this.size=size;
		  arr= new int[size];
	}
	public void insert(int data) {
		if(rear<size)
		{
			arr[rear]=data;
			rear++;
			System.out.println(data+" : inserted in queue");
		}
		else
			System.out.println("Myqueue is overflow");
	}
	public void delete() {
		if(rear>front) {
			for(temp=front;temp<rear-1;temp++) {
				arr[temp]=arr[temp+1];
				
			}
			rear--;
			arr[rear]=0;
			System.out.println("element is deleted from queue");
		}
		else
			System.out.println("queue is empty");
	}
	public void show() {
		System.out.println("elements are in queue ");
		if(rear>front)
		for(temp=front;temp<rear;temp++) {
			System.out.print(arr[temp]+" ");
		}
		else
			System.out.println("Queue is empty");
		System.out.println();
	}
}


public class Create_Queue_udinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyQueue obj = new  MyQueue(5);
		 obj.insert(12);
		 obj.insert(54);
		 obj.insert(34);
		 obj.insert(46);
		 obj.insert(18);
		 obj.show();
		 obj.delete();
		 obj.show();
		 obj.delete();
		 obj.show();
		 obj.delete();
		 obj.show();
		 obj.delete();






		 
	}

}
