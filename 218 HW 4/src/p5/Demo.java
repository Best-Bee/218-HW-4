package p5;

import p1_p3.GStack;

public class Demo {
	public static void main(String[] args) {
		GBag<Integer> i= new GBag<>(5);
		GBag<String> s= new GBag<>(5);
		GBag<Object> o= new GBag<>(5);
		i.store(6);    s.store("Bonnie");		o.store("Fnaf");
        i.store(7);    s.store("Chica");		o.store(198.7);
        i.store(0);    s.store("Freddy");		o.store("67");
        i.store(9);    s.store("Foxy");			o.store(1234567890);
        i.store(0);    s.store("Balloon Boy");	o.store("a1987");
        
        System.out.println(i.find(7));						//find returns true or false
        System.out.println(s.find("Bonnie"));
        System.out.println(o.find(198.7) + "\n");
        
        o.display();
        
        o.delete("67");
        System.out.println();
        o.display();
        System.out.println();
        
        GBag<Student> st=new GBag<>(5);
        Student s1= new Student("Rally", 4.0); Student s2= new Student("Carry", 2.0);Student s3= new Student("Rob", 3.0);
        Student s4= new Student("Crop", 0.7);  Student s5= new Student("Bob", 3.8);
        st.store(s1); st.store(s2); st.store(s3); st.store(s4); st.store(s5);
        
        st.display();
        
        System.out.println(st.searchById("3"));
        
        System.out.println(st.deleteById("2") + "\n");
        st.display();
	}
}
