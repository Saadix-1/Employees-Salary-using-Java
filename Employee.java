public class Employee {

  private String name;

   Employee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return -1.0;
  }

  public String toString() {
    return getClass().getName() + "; name=" + name
      + "; salary=" + getSalary();
  }

  
}
