class Instructor extends Employee implements Lecturer, CommitteeMember {
  private int appointmentMonths;

  public Instructor(String name, int id, double payRate, int appointmentMonths) {
    super(name, id, payRate);
    this.appointmentMonths = appointmentMonths;
  }

  @Override
  public String getName() {
    return super.getName() + "**";
  }

  @Override
  public double getMonthlyPay(double hoursWorked) {
    return this.getPayRate() / this.appointmentMonths;
  }

  public double getMonthlyPay() {
    return this.getPayRate() / this.appointmentMonths;
  }

  public void printClasses() {
    System.out.println("CS 496, CS 391, CS 290");
  }

  public String deliverLecture() {
    return "Blah, blah, blah...";
  }

  public void attendMeeting() {
    System.out.println("zzz...");
  }
}
