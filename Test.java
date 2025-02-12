
public class Test {

  public static void main(String[] args) {
    Employee[] employees = new Employee[4];
    employees[0] = new FullTime("Alex", 70000, 750000); 
    employees[1] = new Contract("Dave", 45, 150, 50); 

    Contract employee3 = new Contract("Louise");
    employee3.setSalaryInfo(40, 100, 50);
    employees[2] = employee3;
    employees[3] = new FullTime("Demi");
    
    
    for (int i = 0; i < employees.length; i++) {
      System.out.print(employees[i].getName());
      
      if (employees[i].getSalary() == -1)
        System.out.println(" has an unspecified pay ");
      else
        System.out.println(" earns " + employees[i].getSalary() + " $");
    }
    
  }
}

