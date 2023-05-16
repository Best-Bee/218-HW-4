package p4;

public class NumberBag <N extends Number>{
	private N[] n;
	private int nElems;
	
	public NumberBag(int maxSize) {
		n= (N[]) new Number[maxSize];
		nElems=0;
	}
	
	public void add(N num) {
		n[nElems]=num;
		nElems++;
	}
	
	public N remove(N num) {
		N[] temp= (N[])new Number[nElems];
		int count=0;
		for(int i=0; i<nElems; i++) {
			if(n[i].equals(num)) { 
				
			}
			else { 
				temp[count++]=n[i]; 
			}
		} 
		if(count==nElems-1) {
			n=temp;
			nElems--;
			return num;
		}
		return null;
	}
	
	public boolean find(N num) {
		for(int i=0; i<nElems; i++) {
			if(n[i].equals(num)) { return true; }
		}
		return false;
	}
	
	public void display() {
		for(int i=0; i<nElems; i++) {
			System.out.println(n[i]);
		}
	}
}
