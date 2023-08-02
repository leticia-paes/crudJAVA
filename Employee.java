package crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Employee {
	
	private int empno;
	private String ename;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(int empno, String ename, int salary){
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	
	Scanner sc = new Scanner(System.in);
	List<Employee> c = new ArrayList<Employee>();
	
	public int getEmpno() {
		return empno;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getEname() {
		return ename;
	}
	
	public String toString() {
		return empno+ " " +ename+" "+salary;
	}
	
	public void insert() {
		
		System.out.print("Enter Empno: ");
		int eno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter EmpName: ");
		String ename = sc.nextLine();
		System.out.print("Enter Salary: ");
		int salary = sc.nextInt();
		c.add(new Employee(eno,ename,salary));
		
	}
	
	public void display() {
		System.out.println("------------------------------");
		Iterator<Employee> i = c.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e);
		}
		System.out.println("------------------------------");
		
	}
	
	public void search() {
		boolean found = false;
		System.out.println("Enter Empno to search: ");
		int empno = sc.nextInt();
		System.out.println("------------------------------");
		Iterator<Employee> i = c.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			if(e.getEmpno() == empno) {
				System.out.println(e);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Record not found");
		
		}
		System.out.println("------------------------------");
		
	}
	
	public void delete() {
		Boolean found = false;
		System.out.println("Enter Empno to delete: ");
		empno = sc.nextInt();
		System.out.println("------------------------------");
		Iterator<Employee> i = c.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			if(e.getEmpno() == empno) {
				i.remove();
				System.out.println("Record deleted!");
				found = true;
			} 
		}
		if(!found) {
			System.out.println("Record not found");
		
		}
		System.out.println("------------------------------");
		
	}
	
	public void update() {
		Boolean found = false;
		System.out.println("Enter Empno to update: ");
		empno = sc.nextInt();
		sc.nextLine();
		System.out.println("------------------------------");
		ListIterator<Employee> li = c.listIterator();
		while(li.hasNext()) {
			Employee e = li.next();
			if(e.getEmpno() == empno) {
				System.out.println("Enter new name: ");
				ename = sc.nextLine();
				System.out.println("Enter new salary: ");
				salary = sc.nextInt();
				li.set(new Employee(empno,ename,salary));
				found = true;
			
				System.out.println("Record updated!");
			}
		}
		if(!found) {
			System.out.println("Record not found");
		
		}
		System.out.println("------------------------------");
		
	}

}
