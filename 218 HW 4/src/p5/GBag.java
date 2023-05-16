package p5;
//5
import java.util.function.Predicate;

public class GBag<G extends Object>{
	private G[] g;
	private int nElems;
	private int maxSize;
	
	public GBag(int maxSize) {
		g=(G[]) new Object[maxSize];
		this.maxSize=maxSize;
		nElems=0;
	}
	
	public void store(G value) {
		g[nElems]=value;
		nElems++;
	}
	
	public boolean find(G value) {
		int i;
		Predicate<G> p = g -> g.equals(value);
		for(i=0; i<nElems; i++) {
			if(p.test(g[i])) { return true; }
		}
		return false;
	}
	
	public G delete(G value) {
		G[] temp= (G[])new Object[maxSize];
		int count=0;
		for(int i=0; i<nElems; i++) {
			if(g[i].equals(value)) { 
				
			}
			else { 
				temp[count++]=g[i]; 
			}
		} 
		if(count==nElems-1) {
			g=temp;
			nElems--;
			return value;
		}
		
		
		return null;
	}
	
	
//	public void display() {
//		G[] arrayNums=(G[])new Object[nElems];
//		int count=0;
//		System.out.println("String:");
//		for(int i=0; i<nElems; i++) {
//			if(g[i].equals("" + g[i])) {
//				System.out.print(g[i] + "\t");
//			}
//			else { arrayNums[count++]=g[i];}
//		}
//		System.out.println("\n" + "Doubles:");
//		for(int i=0; i<count; i++) {
//			if(("" + arrayNums[i]).indexOf(".")>0)
//				System.out.print(arrayNums[i] + "\t");
//		}
//		System.out.println("\n" + "Integers:");
//		for(int i=0; i<count; i++) {
//			if(("" + arrayNums[i]).indexOf(".")<0)
//				System.out.print(arrayNums[i] + "\t");
//		}
//	}
	
	public boolean searchById(String id) {
		for(int i=0; i<nElems; i++) {
			if(((Student) g[i]).getId().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	public Student deleteById(String id) {
		G[] temp=(G[]) new Object[maxSize];
		int count=0;
		Student removed = null;
		for(int i=0; i<nElems; i++) {
			if(((Student) g[i]).getId().equals(id)) {
				removed=(Student)g[i];
			}else {
				temp[count++]=g[i];
			}
		}
		if(count==nElems-1) {;
			g=temp;
			nElems--;
			return removed;
		}
		return null;
	}
	
	public void display() {
		for(int i=0; i<nElems; i++) {
			System.out.println(g[i]);
		}
	}
}
