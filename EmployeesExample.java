class EmployeesExample {
  public static void main(String[] args) {
    Employee emp = new Employee("Luke Skywalker", 933111111, 50.0);
    System.out.println(emp.getName() + " earns " + emp.getMonthlyPay(160));
    // ((Instructor)emp).printClasses();

    Instructor ins = new Instructor("Darth Vader", 933999999, 1000000, 9);
    System.out.println(ins.getName() + " earns " + ins.getMonthlyPay(160));
    ins.printClasses();

    Employee emp2 = new Instructor("Princess Leia", 933000000, 2000000, 9);
    System.out.println(emp2.getName() + " earns " + emp2.getMonthlyPay(160));
    ((Instructor)emp2).printClasses();

    // Instructor ins2 = new Employee("Han Solo", 933444444, 100);
    haveALecture(ins);

    Professor prof = new Professor("Yoda", 933777777, 50.0);
    haveALecture(prof);
  }

  public static void haveALecture(Lecturer l) {
    System.out.println(l.getName() + " says " + l.deliverLecture());
  }
}
