package arrayListWithClass;

import java.util.ArrayList;

public class Main {
	
	public static void main (String[] args ) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Customer engin = new Customer(1,"Engin","Demiroğ");
		customers.add(engin);
		customers.add(new Customer(2,"Selin","Demiroğ"));
		customers.add(new Customer(3,"Derin","Demiroğ"));
		
		customers.remove(engin);
		// customers.add(new Customer(1,"Engin","Demiroğ")); olduğunda listeden silmiyor. Referans tipi önemli.
		
		for(Customer customer:customers) {
			System.out.println(customer.firstName);
		}
	}
}
