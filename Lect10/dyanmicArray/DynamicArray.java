package dyanmicArray;

public class DynamicArray<T> {
	
	Integer [] dynamicArray;
	int index;
	int currentSize;
	
	DynamicArray() {
		dynamicArray = new Integer[5];
		index=0;
		currentSize=5;
	}
	
	public void add(Integer val) {
		if(index>=currentSize) {
			restructure();
		}
		dynamicArray[index] = val;
		index++;
	}
	
	public void removeLast() throws Exception {
		if(index < 1) {
			throw new Exception("Array Out Of Bound");
		} else {
			dynamicArray[index-1]=0;
			index--;
		}
	}
	
	public int size() {
		return index;
	}
	
	public Integer get(int ind) {
		if(ind > index || ind < 0 )
		{
			return -1;
		}
		return dynamicArray[ind];
	}
	
	public void set(int ind,Integer val) {
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
	
	public void addAll(DynamicArray<Integer> arr){
		for(int i=0;i<arr.size();i++)
		{
			add(arr.get(i));
		}
	}
	
	public int indexOf(Integer value) {
		for(int i=0;i<index;i++)
		{
			if(get(i) == value) {
				return i;
			}
		}
		return -1;
	}
	
	
	public void restructure() {
		Integer temp [] = dynamicArray;
		dynamicArray = new Integer[currentSize*2];
		for(int i=0;i<currentSize;i++) {
			dynamicArray[i] = temp[i];
		}
		currentSize*=2;
	}
	
	public static void main(String[] args) {
		DynamicArray<Integer> arr1 = new DynamicArray<Integer>();
		DynamicArray<Integer> arr = new DynamicArray<Integer>();
		arr.add(5);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr1.addAll(arr);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr1.get(i));
		}
		
	}

}
