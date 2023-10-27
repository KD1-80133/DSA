package assignment02_05;
import java.util.*;
public class Employee {
	private int empid;
	private String name;
	private double salary;
	

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "\nEmployee [empid=" + empid + ", name=" + name + ", salary=" + salary +"]";
	}

	public static void employeeSorted(Employee[] arr,int N)
	{
		int count=0;
		for(int i=1;i<N;i++)
		{
			for(int j=0;j<N-1;j++)
			{
				count++;
				if(arr[j].getSalary()>arr[j+1].getSalary())
				{
					Employee temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("No of comparisions : " + count);
	}
	public static void main(String[] args) {
		Employee[] emp=new Employee[5];
		emp[0]=new Employee(1,"Akanksha",344556);
		emp[1]=new Employee(3,"Manav",98765);
		emp[2]=new Employee(4,"Dinesh",1234);
		emp[3]=new Employee(5,"Zikra",45567);
		emp[4]=new Employee(6,"Naheen",56788);
		
		System.out.println("Array before sort : " + Arrays.toString(emp));
		
		employeeSorted(emp,emp.length);
		System.out.println("Array after sort : " + Arrays.toString(emp));

	}

}
