class Professor extends Employee implements Lecturer {
  public Professor(String name, int id, double payRate) {
    super(name, id, payRate);
  }

  public String deliverLecture() {
    return "Much pontification...";
  }
}
