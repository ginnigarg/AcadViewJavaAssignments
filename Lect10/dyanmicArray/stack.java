package dyanmicArray;

public class stack<T> {
	Integer [] stackUsingArray;
	int index;
	int currentSize;
	
	stack() {
		stackUsingArray = new Integer[5];
		index=0;
		currentSize=5;
	}
	
	public void push(Integer val) {
		if(index>=currentSize) {
			restructure();
		}
		stackUsingArray[index] = val;
		index++;
	}
	
	public void pop() throws Exception {
		if(index < 1) {
			throw new Exception("stackUsingArray Underflow");
		} else {
			stackUsingArray[index-1]=0;
			index--;
		}
	}
	
	public int size() {
		return index;
	}
	
	public Integer top() {
		return stackUsingArray[index-1];
	}
	
	public boolean isEmpty() {
		return(index==0);
	}
	
	public void restructure() {
		Integer temp [] = stackUsingArray;
		stackUsingArray = new Integer[currentSize*2];
		for(int i=0;i<currentSize;i++) {
			stackUsingArray[i] = temp[i];
		}
		currentSize*=2;
	}
	
	public static void main(String[] args) throws Exception {
		stack<Integer> arr = new stack<Integer>();
		arr.push(5);
		System.out.println(arr.top());
		arr.push(7);
		System.out.println(arr.top());
		arr.pop();
		System.out.println(arr.top());
		arr.push(10);
		System.out.println(arr.top());
		arr.pop();
		System.out.println(arr.top());
	}


}
