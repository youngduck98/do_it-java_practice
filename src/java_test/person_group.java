package java_test;
import java.util.Vector;

public class person_group {
	person a;
	Vector<person> group = new Vector<person>();
	
	public void print_group() {
		System.out.println("¡∂¿Â: " + this.a.name);
		for (person b : this.group){
			System.out.println(b.name);
		}
	}
	
	public void add_leader(person a) {
		this.a = a;
	}
	
	public void add_member(person b) {
		this.group.add(b);
	}
}
