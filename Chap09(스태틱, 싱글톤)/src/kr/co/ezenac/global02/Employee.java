package kr.co.ezenac.global02;

public class Employee {
	public static int serialNum = 1000;		// static 변수
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {			
		Employee.serialNum++;
		employeeId = serialNum;
	}
// ==================== get & set ====================
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
