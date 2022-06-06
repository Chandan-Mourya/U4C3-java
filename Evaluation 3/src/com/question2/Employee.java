package com.question2;

public abstract class Employee {
	
	protected int employeeId;
	protected String employeeName;
	protected  double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	abstract void calculateSalary();
}
public class PermanentEmployee extends Employee{
	
	double basicPay;

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay=basicPay;
		calculateSalary();
	}

	@Override
	void calculateSalary() {
		this.salary=basicPay-(basicPay*0.12);
	}
	
}

public class TemporaryEmployee extends Employee{
	
	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}

	@Override
	void calculateSalary() {
		this.salary=hoursWorked * hourlyWages;
		
	}

}
public class Loan {
		public double calculateLoanAmount(Employee employeeObj) {
			
			double loan=0;
			
			if(employeeObj instanceof PermanentEmployee) {
				loan=employeeObj.salary*15/100;
				return loan;
			}
			if(employeeObj instanceof TemporaryEmployee) {
				loan=employeeObj.salary*10/100;
				return loan;
			}
			return 0;
			
		}
	}
	


class Main{
	public static void main(String[] args) {
		Loan l=new Loan();
		PermanentEmployee pe=new PermanentEmployee(101,"chandan",100);
		
		pe.calculateSalary();
		l.calculateLoanAmount(pe);
		
		
		//System.out.println(l.calculateLoanAmount(pe));
		
		
	}
}



















