/* The stack class implements the stack data structure.
 * 
 */
public class Stack<P> {
	private int top = 0;
	private int capacity = 4;
	private Object[] stack = new Object[capacity];
	
	
	public void push (P value){
/*
 * This method is used to add values to the stack.
 * @param <P>value is the value to be added in the stack.
 * @return Nothing.
 */
		if(top >= capacity) {
			capacity *= 2;
			Object[] newStack = new Object[capacity];
			for(int i=0; i<top; i++) {
				newStack[i] = stack[i];
			}
			stack = newStack;
		}
		stack[top] = value;
		top++;
	}
	
	public void pop() {
/*
 * This method removes the values from the stack.
 * @param Nothing.
 * @return Nothing.
 */
		if(top <= capacity/4) {
			capacity /= 2;
			Object[] newStack = new Object[capacity];
			for(int i=0; i<top; i++) {
				newStack[i] = stack[i];
			}
			stack = newStack;
		}
		top--;
		stack[top] = 0;
	}
	
	public int size() {
/*
 * This method provides the size of the stack
 * @param Nothing.
 * @return int This returns the size of the stack
 */
		return top;
	}
	
	public boolean isEmpty() {
/*
 * This method checks if the stack is empty
 * @param nothing.
 * @return boolean Returns whether the stack is empty.
 */
		return top <= 0;
	}
	
	public void print() {
/*
 * This method prints the values in the stack
 * @param Nothing
 * @return nothing
 */
		for (int i=0; i<top; i++) {
			System.out.print(stack[i] + ", ");
		}
		System.out.println();
	}
}
