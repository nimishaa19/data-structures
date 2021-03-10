package stack;

public class main {

	public static void main(String[] args) throws Exception {
		MyStack<Integer> stack=new MyStack<>();
		stack.push(10);
		stack.push(15);
		stack.push(20);
		
		int popped=stack.pop();
		System.out.println(popped);
		
		int peeked=stack.peek();
		System.out.println(peeked);
	}

}
