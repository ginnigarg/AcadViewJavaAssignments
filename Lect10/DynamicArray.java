package dyanmicArray;

public class DynamicArray<T> {
	
	Object [] dynamicArray;
	int index;
	int currentSize;
	
	DynamicArray() {
		dynamicArray = new Object[5];
		index=0;
		currentSize=5;
	}
	
	public void add(Object val) {
		if(index>=currentSize) {
			restructure();
		}
		dynamicArray[index] = val;
		index++;
	}
	
	public void removeLast() {
		if(index < 1) {
			try {
				throw new Exception("Array Out Of Bound");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			dynamicArray[index-1]=0;
			index--;
		}
	}
	
	public int size() {
		return index;
	}
	
	public Object get(int ind) {
		if(ind > index || ind < 0 )
		{
			return -1;
		}
		return dynamicArray[ind];
	}
	
	public void set(int ind,Object val) {
		if(ind > index || ind < 0) {
			try {
				throw new Exception("Array Out of Bound") ;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(ind == index) {
			add(val);
		} else {
			dynamicArray[ind] = val;
		}
	}
	
	public void addAll(DynamicArray )
	
	public void restructure() {
		Object temp [] = dynamicArray;
		dynamicArray = new Object[currentSize*2];
		for(int i=0;i<currentSize;i++) {
			dynamicArray[i] = temp[i];
		}
		currentSize*=2;
	}
	
	public static void main(String[] args) {
		DynamicArray<Integer> arr = new DynamicArray<Integer>();
		arr.add(5);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.set(7,1);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
