class stack{
	static final int max=5;
	int stackArray [] = new int[max];
	int top;
	
	stack(){
		top=-1;
	}
	boolean isEmpty(){
		return (top < 0);
	}
	boolean isFull(){
		return (top >= max-1);
	}
	boolean push(int x){
		if(isFull()){
			System.out.println("Stack Overflow");
			return false;
		}else{
			stackArray[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}
	int pop(){
		if(isEmpty()){
			System.out.println("Stack underflow");
			return 0;
		}else{
			int x = stackArray[top--];
			return x;
		}
	}
	int peek(){
		if(isEmpty()){
			System.out.println("Stack underflow");
			return 0;
		}else{
			int x = stackArray[top];
			return x;
		}
	}
	void print(){
		for(int i=0;i<max;i++){
			System.out.print(stackArray[i] + ",");
		}System.out.println("\b\t");
	}
}

public class stackMain{
	public static void main(String args []){
		stack s = new stack();
		s.isEmpty();
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.print();
	}
}