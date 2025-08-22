import java.util.*;
class PivotArrEx{
	public static void main(String[] args) {
		Employee [] empList = new Employee[5];
		empList[0] = new Employee("Ramesh" , 1234,"HR", 20000);
		empList[1] = new Employee("Ganesh" , 1345,"IT", 80000);
		empList[2] = new Employee("Suresh" , 1678,"HR", 90000);
		empList[3] = new Employee("Mangesh" , 7834,"HR", 50000);
		empList[4] = new Employee("Dinesh" , 9014,"HR", 60000);

		for(Employee emp : empList)
		{
			System.out.println(emp);
		}


		Arrays.sort(empList);
		System.out.println("------------------------------------");
		for(Employee emp : empList){
			System.out.println(emp);
		}



	}
}
class Employee implements Comparable<Employee>{
	String ename;
	int id ;
	String dept;
	int salary;

	Employee(String ename , int id , String dept ,int salary ){
		super();
		this.ename=ename;
		this.id=id;
		this.dept=dept;
		this.salary=salary;

	}

	@Override
	public String toString(){
		return "Employee [ empId = "+id +" ,ename= "+ename +", dept= "+dept+
		        ", salary: "+salary+"]";

	}

	// @Override
	// public int compareTo(Employee emp)   // ascending sort for id
	// {
	// 	return this.id-emp.id;
	// }

	// @Override
	// public int compareTo(Employee emp)   // descending sort for id
	// {
	// 	return emp.id-this.id;
	// }

	// @Override
	// public int compareTo(Employee emp)   // asccending sort for salary
	// {
	// 	return this.ename.compareTo(emp.ename);
	// }
	// @Override
	// public int compareTo(Employee emp)   // descending sort for salary
	// {
	// 	return emp.ename.compareTo(this.ename);
	// }

	@Override
	public int compareTo(Employee emp)   // asscending sort for salary
	{
		return this.salary-emp.salary;
	}

	// @Override
	// public int compareTo(Employee emp)   // descending sort for salary
	// {
	// 	return emp.salary-this.salary;
	// }



}