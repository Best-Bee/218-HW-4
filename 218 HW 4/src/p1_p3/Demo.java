package p1_p3;

public class Demo {
	public static void main(String[] args) {
		GStack<Integer> i= new GStack<>(5);
		GStack<Double> d= new GStack<>(5);
		GStack<String> s= new GStack<>(5);
		GStack<Object> o= new GStack<>(5);
		i.push(6);    d.push(6.6);    s.push("Bonnie");			o.push("Fnaf");
        i.push(7);    d.push(6.0);    s.push("Chica");			o.push(1987);
        i.push(0);    d.push(3.7);    s.push("Freddy");			o.push(58.17);
        i.push(9);    d.push(9.7);    s.push("Foxy");			o.push(1234567890);
        i.push(0);    d.push(0.3);    s.push("Balloon Boy");	o.push("Fortnite");
        
//        for(int j=0; j<5; j++) { System.out.println(i.pop() + "\t" + d.pop() + "\t" + s.pop() + "\t" + o.pop());}
        
        //2
        GStack<Integer> a= new GStack<>(4);
        Integer[] i2= new Integer[4];
        i2[0]=7;	i2[1]=8;	i2[2]=9;	i2[3]=1;
        a.pushAll(i2);
//        for(int u=0; u<4; u++) { System.out.print(a.pop() + " "); }
        
        //3
        Object[] oAr=o.popAll();
        	for(int q=0; q<oAr.length; q++) { System.out.print(oAr[q] + " "); }
	}
}
