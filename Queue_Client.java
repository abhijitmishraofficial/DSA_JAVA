package StackAndQueue;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q=new  Queue();
		q.EnQueue(10);	
		q.EnQueue(20);
		q.EnQueue(30);
		q.EnQueue(40);
		q.EnQueue(40);
		System.out.println(q.size());
		q.display();
		q.DeQueue();
		q.display();
		q.EnQueue(8);
		q.display();
		q.DeQueue();
		q.EnQueue(9);
		
		q.display();

	}

}
