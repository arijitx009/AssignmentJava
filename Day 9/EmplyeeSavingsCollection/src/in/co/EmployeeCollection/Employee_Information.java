package in.co.EmployeeCollection;

public class Employee_Information {
	private int emp_ID;
	private String emp_Name;
	private String emp_Designation;
	private double emp_Salary;
	private String emp_comm;
	public Employee_Information(int emp_ID, String emp_Name, String emp_Designation, double emp_Salary,
			String emp_comm) {
		super();
		this.emp_ID = emp_ID;
		this.emp_Name = emp_Name;
		this.emp_Designation = emp_Designation;
		this.emp_Salary = emp_Salary;
		this.emp_comm = emp_comm;
	}
	public int getEmp_ID() {
		return emp_ID;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public String getEmp_Designation() {
		return emp_Designation;
	}
	public double getEmp_Salary() {
		return emp_Salary;
	}
	public String getEmp_comm() {
		return emp_comm;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emp_Designation == null) ? 0 : emp_Designation.hashCode());
		result = prime * result + emp_ID;
		result = prime * result + ((emp_Name == null) ? 0 : emp_Name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(emp_Salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((emp_comm == null) ? 0 : emp_comm.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee_Information other = (Employee_Information) obj;
		if (emp_Designation == null) {
			if (other.emp_Designation != null)
				return false;
		} else if (!emp_Designation.equals(other.emp_Designation))
			return false;
		if (emp_ID != other.emp_ID)
			return false;
		if (emp_Name == null) {
			if (other.emp_Name != null)
				return false;
		} else if (!emp_Name.equals(other.emp_Name))
			return false;
		if (Double.doubleToLongBits(emp_Salary) != Double.doubleToLongBits(other.emp_Salary))
			return false;
		if (emp_comm == null) {
			if (other.emp_comm != null)
				return false;
		} else if (!emp_comm.equals(other.emp_comm))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee_Information [emp_ID=" + emp_ID + ", emp_Name=" + emp_Name + ", emp_Designation="
				+ emp_Designation + ", emp_Salary=" + emp_Salary + ", emp_comm=" + emp_comm + "]";
	}
	 
}
