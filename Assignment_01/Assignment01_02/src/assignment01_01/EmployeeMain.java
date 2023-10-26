package assignment01_01;

import java.util.Scanner;

public class EmployeeMain {
	public static int empidSearch(Employee[] employees, int size, int empid) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmpid() == empid)
                return i;
        }
        return -1;
    }
	public static int nameSearch(Employee[] employees, int size, String name) {
	    for (int i = 0; i < size; i++) {
	        if (employees[i].getName().equals(name))
	            return i;
	    }
	    return -1;
	}
	public static int salarySearch(Employee[] employees, int size, double salary) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() == salary)
                return i;
        }
        return -1;
    }

	

	public static void main(String[] args) {
		Employee[] employee=new Employee[4];
		employee[0]=new Employee(1,"Akanksha",34567);
		employee[1]=new Employee(3,"Manav",8765);
		employee[2]=new Employee(6,"Naheen",2345);
		employee[3]=new Employee(5,"Neha",23456);
		
		Scanner scanner=new Scanner(System.in);
		
		int choice;
		do
		{
			System.out.println("----Search for Employee------");
			System.out.println("1.Search by empid");
			System.out.println("2.Search by Name");
			System.out.println("3.Search by salary");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter empid to search :");
				int id=scanner.nextInt();
				int result = empidSearch(employee, employee.length, id);
				if(result!=-1)
				{
					Employee emp=employee[result];
					System.out.println("Employee found at index :"+result);
				}
				else 
				{
					System.out.println("Employee not found");
				}
				break;
			case 2:
				System.out.println("Enter name to search :");
				String name=scanner.next();
				int result1=nameSearch(employee,employee.length,name);
				if(result1!=-1)
				{
					Employee emp=employee[result1];
					System.out.println("Employee found at index "+result1);
				}
				else
				{
					System.out.println("Employee not found");
				}
				break;
			case 3:
				System.out.println("Enter salary to search :");
				double salary=scanner.nextDouble();
				int result2 = salarySearch(employee, employee.length, salary);
				if(result2!=-1)
				{
					Employee emp=employee[result2];
					System.out.println("Employee found at index :"+result2);
				}
				else 
				{
					System.out.println("Employee not found");
				}
				break;
				
			}
		}while(choice!=0);
	}

}
