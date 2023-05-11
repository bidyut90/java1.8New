package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicatesDemo2 {
	public static void main(String[] args) {
		Employee emp = new Employee("bidyut",100000,2);
		Employee emp2 = new Employee("jyoti",500000,4);
		Employee emp3 = new Employee("Rashim",600000,2);
		
		//emp obj --> return name if sal>50k exp >3
		Predicate<Employee> pr = e->(e.salary>3000 && e.experience>3);
		System.out.println(pr.test(emp));
		
		//Ex:2 
		ArrayList<Employee> al = new ArrayList<>();
		al.add(emp);
		al.add(emp2);
		al.add(emp3);
		
		for(Employee employee : al) {
			if(pr.test(employee)) {
				System.out.println(employee.ename + " " +employee.salary);
			}
		}
		
		al.forEach(e->{
			if(pr.test(e)) {
			System.out.println(e.ename+" "+e.salary );
			}
		});
		
		
	}

}
