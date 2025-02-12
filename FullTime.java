
public class FullTime extends Employee {

  private double turnover = -1.0; 
  private double pay  = -1.0; 
  private static final double percentTurnover = 1.0;

   FullTime(String name, double pay , double turnover) {
    super(name);
    this.pay = pay;
    this.turnover = turnover;
  }

   FullTime(String name) {
    super(name);
  }

  public void setSalaryInfo(double pay, double turnover) {
    this.pay = pay;
    this.turnover = turnover;
  }

  public void setTurnover(double turnover) {
    if (turnover >= 0) {
      this.turnover = turnover;
    }
  }

  public void setPay(double pay) {
    if (pay >= 0) {
      this.pay = pay;
    }
  }


  public double getSalary() {
    if (turnover != -1.0 && pay != -1.0) {
      return pay + (percentTurnover * turnover) / 100;
    }
    else {
      return -1.0;
    }
  }


  public String toString() {
    return super.toString() + ";pay =" + pay + "turnover=" + turnover;
  }
}

