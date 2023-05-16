package p4;

public class Demo {
	public static void main(String[] args) {
		NumberBag<Integer> i= new NumberBag(4);
		i.add(2);	i.add(4); i.add(909); i.add(21);
		NumberBag<Double> d= new NumberBag(4);
		d.add(2.6);	d.add(6.989); d.add(2.42); d.add(0.21);
		NumberBag<Number> n= new NumberBag(4);
		n.add(34);	n.add(106.1); n.add(19.87); n.add(85);
		
		//i.display();
		
//		System.out.println(d.remove(2.6));
//		System.out.println(d.remove(12.2));
//		d.display();
		
//		System.out.println(n.find(106.1));
//		System.out.println(n.find(0));
	}
}
