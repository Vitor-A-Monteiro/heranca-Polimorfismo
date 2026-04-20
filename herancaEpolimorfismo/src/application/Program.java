package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.outsourceEmployee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of emproyees");
		int n = sc.nextInt();
		List<Employee> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++)
			System.out.println("Employrr #" + i +" data:");
		
		
		System.out.print("Outsourced(y/n)?");
		char ch =sc.next().charAt(0);
		System.out.print("Name:");
		sc.nextLine();
		
		
		String name =sc.nextLine();
		System.out.print("Hours: ");
		double hours = sc.nextDouble();
		
		
		System.out.print("value per hour: ");
		double valuePerHour = sc.nextDouble();
		if (ch == 'y') {
			System.out.print("Additional charge: ");
			double additionalCharge=sc.nextDouble();
	list.add(new outsourceEmployee(name, hours,valuePerHour, additionalCharge));	
		}else {
			list.add(new Employee());
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
for(Employee emp :list) {
	System.out.println(emp.getName()+"-$"+ String.format("%.2f",emp.payment()));
}
		
		sc.close();
	}

}
