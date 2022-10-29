package StackAndQueue;

public class Stack_Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack s=new Stack(9);
		System.out.println(s.size());
		s.push(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		//System.out.println(s.display());
		s.display();
		System.out.println(s.isEmpty());;
		System.out.println(s.isFull());
		s.push(44);
		s.push(56);
		s.display();
		System.out.println(s.peek());
		System.out.println(s.pop());
		s.display();
		s.push(67);
		//s.push(98);
		s.push(68);
		s.display();
		System.out.println(s.size());
		s.pop();
		System.out.println(s.size());
	

	}
	
}
