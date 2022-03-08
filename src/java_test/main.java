package java_test;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person a = new person();
		a.setAge(18);
		a.setName("first");
		a.setChildren_num(1);
		a.setMarriage('Y');
		
		person_group k = new person_group();
		k.add_leader(a);
		k.add_member(a);
		k.print_group();
	}

}
