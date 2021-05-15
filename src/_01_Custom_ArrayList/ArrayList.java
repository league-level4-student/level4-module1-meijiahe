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

		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}