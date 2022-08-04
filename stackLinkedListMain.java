class stackLinkedList{
	Node top;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	public boolean isEmpty(){
		if (top == null){
			return true;
		}else{
			return false;
		}
	}
	public void push(int data){
		Node newNode = new Node(data);
		if(top == null){
			top = newNode;
		}else{
			Node temp = top;
			top = newNode;
			newNode.next = temp;
		}System.out.println(data + " pushed to the linked list");
	}
	public void pop(){
		if(top == null){
			System.out.println("Stack is empty");
		}else{
			System.out.println(top.data);
			top = top.next;
		}
	}
	public void peek(){
		if(top == null){
			System.out.println("Stack is empty");
		}else{
			System.out.println(top.data);
		}
	}
}

public class stackLinkedListMain{
	public static void main(String args[]){
		stackLinkedList sl = new stackLinkedList();
  
        sl.push(10);
        sl.push(20);
        sl.push(30);
		sl.peek();
		
	}
}