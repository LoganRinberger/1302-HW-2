//“This homework represents my own work. I understand that I may receive help, but I did not copy any portion of this assignment from anywhere. 
//I understand that a violation of this will result in a Report of Academic Dishonesty. - Logan Rinberger”

package prob1;
import emp.Employee;

public class Store {
	
	private Employee emps[] = new Employee[20];
	private int numEmps;
	
	public Store ()
	{
		numEmps = 0;
	}
	

	public void addEmployee(Employee e) 
	{
		if (numEmps >= 20) 
		{
			System.out.println("Employee limit reached");
		} else 
		{
			emps[numEmps++] = e;
		}
	}

	
	public Employee getEmployee(int i) 
	{
		if (i < 0 || i >= numEmps) 
		{
            return null;
        }
		else
		{
			return emps[i];
		}
	}
	
	public Employee getEmployeeWithName(String findName) {
		for (int i = 0; i < numEmps; i++) {
			if (emps[i].getName().equals(findName)) {
				return emps[i];
			}
		}
		return null;
	}
	
	public int getNumEmployees()
	{
		return numEmps;
	}
	
	public double getTotalHours()
	{
		double total = 0;
		for (int i = 0; i < numEmps; i++) 
		{
			total += emps[i].getTotalHours();
		}
		return total;
	}
	
	public double getTotalPay() 
	{
		double total = 0;
		for (int i = 0; i < numEmps; i++) 
		{
			total += emps[i].getPay();
		}
		return total;
	}
	
	public Employee removeEmployee(int i)
	{
		if (i < 0 || i >= numEmps) 
		{
			return null;
		}
		else
		{
			for (int j = i; j < numEmps - 1; j++) 
			{
				emps[j] = emps[i];
			}
			numEmps--;
			return emps[i];
		}
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Pay Stub\n--------\n");
		for (int i = 0; i < numEmps; i++) {
			sb.append(emps[i].toString());
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Employee e = new Employee("Will", 22.33);
		System.out.println(e);

	}

}
