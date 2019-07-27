
//Runner class for executing various DS
public class Runner {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.print();
		stack.pop();
		stack.pop();
		stack.print();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());

	}

}
