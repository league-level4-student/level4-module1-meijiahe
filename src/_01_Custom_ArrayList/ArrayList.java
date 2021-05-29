package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T [] array;
	public ArrayList() {
		array=(T[]) new Object [0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		
		return array[loc];
	}
	
	public void add(T val) {
		T[] big=(T[])new Object [array.length+1];
		for(int i=0;i<array.length;i++) {
			big[i]=array[i];
		}
		big[big.length-1]=val;
		array=big;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
		T[] big=(T[])new Object [array.length+1];
		for(int i=0;i<loc;i++) {
			big[i]=array[i];
		}
		big[loc]=val;
		for(int i=loc+1;i<big.length;i++) {
			big[i]=array[i-1];
		}
		array=big;
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc]=val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] big=(T[])new Object [array.length-1];
		for(int i=0;i<loc;i++) {
			big[i]=array[i];
		}
		for(int i=loc;i<big.length;i++) {
			big[i]=array[i+1];
		}
		array=big;
		
	}
	
	public boolean contains(T val) {
		for(int i=0;i<array.length;i++) {
			if (array[i]==val) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		
		return array.length;
	}
}